/*
 * Copyright (c) 2009-2012 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.shadow;

import com.jme3.asset.AssetManager;
import com.jme3.light.DirectionalLight;
import com.jme3.light.SpotLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.math.Vector4f;
import com.jme3.renderer.CameraView;
import com.jme3.renderer.queue.GeometryList;
import com.jme3.renderer.queue.OpaqueComparator;
import com.jme3.scene.Node;

/**
 * SpotLightShadowRenderer renderer use Parrallel Split Shadow Mapping technique
 * (pssm)<br> It splits the view frustum in several parts and compute a shadow
 * map for each one.<br> splits are distributed so that the closer they are from
 * the camera, the smaller they are to maximize the resolution used of the
 * shadow map.<br> This result in a better quality shadow than standard shadow
 * mapping.<br> for more informations on this read this <a
 * href="http://http.developer.nvidia.com/GPUGems3/gpugems3_ch10.html">http://http.developer.nvidia.com/GPUGems3/gpugems3_ch10.html</a><br>
 * <p/>
 * @author Rémy Bouquet aka Nehon
 */
public class SpotLightShadowRenderer extends AbstractShadowRenderer {

    protected float zFarOverride = 0;
    protected CameraView shadowCam;    
    protected SpotLight light;
    protected Vector3f[] points = new Vector3f[8];
    //Holding the info for fading shadows in the far distance 
    protected Vector2f fadeInfo;
    protected float fadeLength;

    /**
     * Create a SpotLightShadowRenderer This use standard shadow mapping
     *
     * @param assetManager the application asset manager
     * @param shadowMapSize the size of the rendered shadowmaps (512,1024,2048,
     * etc...) the more quality, the less fps).
     */
    public SpotLightShadowRenderer(AssetManager assetManager, int shadowMapSize) {
        super(assetManager, shadowMapSize, 1);

        shadowCam = new CameraView(shadowMapSize, shadowMapSize);

        for (int i = 0; i < points.length; i++) {
            points[i] = new Vector3f();
        }
    }

    /**
     * return the light used to cast shadows
     *
     * @return the SpotLight
     */
    public SpotLight getLight() {
        return light;
    }

    /**
     * Sets the light to use to cast shadows
     *
     * @param light a SpotLight
     */
    public void setLight(SpotLight light) {
        this.light = light;
    }

    @Override
    protected void updateShadowCams(CameraView viewCam) {

        float zFar = zFarOverride;
        if (zFar == 0) {
            zFar = viewCam.getFrustum().getFrustumFar();
        }

        //We prevent computing the frustum points and splits with zeroed or negative near clip value
        float frustumNear = Math.max(viewCam.getFrustum().getFrustumNear(), 0.001f);
        ShadowUtil.updateFrustumPoints(viewCam, frustumNear, zFar, 1.0f, points);
        //shadowCam.setDirection(direction);

        shadowCam.updateFrustumPerspective(light.getSpotOuterAngle() * FastMath.RAD_TO_DEG * 2.0f, 1, 1f, light.getSpotRange());
        shadowCam.getCamera().getRotation().lookAt(light.getDirection(), shadowCam.getCamera().getUp());
        shadowCam.updateLocation(light.getPosition());

        shadowCam.update();
        shadowCam.getCamera().updateViewProjection();

    }

    @Override
    protected GeometryList getOccludersToRender(int shadowMapIndex, GeometryList sceneOccluders, GeometryList sceneReceivers, GeometryList shadowMapOccluders) {
        ShadowUtil.getGeometriesInCamFrustum(sceneOccluders, shadowCam, shadowMapOccluders);
        return shadowMapOccluders;
    }

    @Override
    GeometryList getReceivers(GeometryList sceneReceivers, GeometryList lightReceivers) {
        ShadowUtil.getGeometriesInCamFrustum(sceneReceivers, shadowCam, lightReceivers);
        return lightReceivers;
    }
    
    @Override
    protected CameraView getShadowCam(int shadowMapIndex) {
        return shadowCam;
    }

    @Override
    protected void doDisplayFrustumDebug(int shadowMapIndex) {
        Vector3f[] points2 = points.clone();

        ((Node) viewPort.getScenes().get(0)).attachChild(createFrustum(points, shadowMapIndex));
        ShadowUtil.updateFrustumPoints2(shadowCam, points2);
        ((Node) viewPort.getScenes().get(0)).attachChild(createFrustum(points2, shadowMapIndex));
    }

    @Override
    protected void setMaterialParameters(Material material) {    
    }

    /**
     * How far the shadows are rendered in the view
     *
     * @see #setShadowZExtend(float zFar)
     * @return shadowZExtend
     */
    public float getShadowZExtend() {
        return zFarOverride;
    }

    /**
     * Set the distance from the eye where the shadows will be rendered default
     * value is dynamicaly computed to the shadow casters/receivers union bound
     * zFar, capped to view frustum far value.
     *
     * @param zFar the zFar values that override the computed one
     */
    public void setShadowZExtend(float zFar) {
        if (fadeInfo != null) {
            fadeInfo.set(zFar - fadeLength, 1f / fadeLength);
        }
        this.zFarOverride = zFar;

    }

    /**
     * Define the length over which the shadow will fade out when using a
     * shadowZextend This is useful to make dynamic shadows fade into baked
     * shadows in the distance.
     *
     * @param length the fade length in world units
     */
    public void setShadowZFadeLength(float length) {
        if (length == 0) {
            fadeInfo = null;
            fadeLength = 0;
            postshadowMat.clearParam("FadeInfo");
        } else {
            if (zFarOverride == 0) {
                fadeInfo = new Vector2f(0, 0);
            } else {
                fadeInfo = new Vector2f(zFarOverride - length, 1.0f / length);
            }
            fadeLength = length;
            postshadowMat.setVector2("FadeInfo", fadeInfo);
        }
    }

    /**
     * get the length over which the shadow will fade out when using a
     * shadowZextend
     *
     * @return the fade length in world units
     */
    public float getShadowZFadeLength() {
        if (fadeInfo != null) {
            return zFarOverride - fadeInfo.x;
        }
        return 0f;
    }
}
