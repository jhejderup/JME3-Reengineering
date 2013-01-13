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
package com.jme3.renderer;

import com.jme3.bounding.BoundingBox;
import com.jme3.bounding.BoundingVolume;
import com.jme3.export.*;
import com.jme3.math.*;
import com.jme3.renderer.Frustum.FrustumIntersect;
import com.jme3.renderer.Frustum.Planes;
import com.jme3.util.TempVars;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <code>Camera</code> is a standalone, purely mathematical class for doing
 * camera-related computations.
 *
 * <p>
 * Given input data such as location, orientation (direction, left, up),
 * and viewport settings, it can compute data necessary to render objects
 * with the graphics library. Two matrices are generated, the view matrix
 * transforms objects from world space into eye space, while the projection
 * matrix transforms objects from eye space into clip space.
 * </p>
 * <p>Another purpose of the camera class is to do frustum culling operations,
 * defined by six planes which define a 3D frustum shape, it is possible to
 * test if an object bounded by a mathematically defined volume is inside
 * the camera frustum, and thus to avoid rendering objects that are outside
 * the frustum
 * </p>
 *
 * @author Mark Powell
 * @author Joshua Slack
 */
public class CameraView implements Savable, Cloneable {

    private static final Logger logger = Logger.getLogger(CameraView.class.getName());

 
    protected int width;
    protected int height;
    protected boolean viewportChanged = true;
    /**
     * The Fustrum object that the camera will project on
     */
    protected Frustum frustum;
    /**
     * The NewCamera object
     */
    protected Camera camera;
    
    /**
     * store the value for field parallelProjection
     * 
     * 
     * Used in copyFrom(), isParallelProjection(), updateFrustumChange(), setFrustumPerspective() setParallelProjection(), toString()
     *
     *
     */
    private boolean parallelProjection = true;

    /** The camera's name. */
    protected String name;

    /**
     * Serialization only. Do not use.
     */
    public CameraView() {
    	
    // Serialization issues? 
    // If not used keep it as it or make a new method in frustum class with the code below
        frustum = new Frustum();
    	
   //    this.frustum.worldPlane = new Plane[frustum.getMaxWorldPlanes()];
   //     for (int i = 0; i < frustum.getMaxWorldPlanes(); i++) {
    //     this.frustum.worldPlane[i] = new Plane();
    //    }
    }

    /**
     * Constructor instantiates a new <code>Camera</code> object. All
     * values of the camera are set to default.
     */
    public CameraView(int width, int height) {
      
    	this();

    	this.camera = new Camera();
        frustum = new Frustum();
        
        
        this.width = width;
        this.height = height;
    
        updateFrustumChange();  
        updateViewPortChange(); 
        updateFrameChange();
        logger.log(Level.INFO, "Camera created (W: {0}, H: {1})", new Object[]{width, height});
    }

    public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Frustum getFrustum() {
		return frustum;
	}

	public void setFrustum(Frustum frustum) {
		this.frustum = frustum;
	}

	@Override
    public CameraView clone() {
        try {
            CameraView cam = (CameraView) super.clone();
            cam.viewportChanged = true;
            cam.frustum.clone();
        
          cam.camera.setLocation(this.camera.getLocation().clone());  
          cam.camera.setRotation(this.camera.getRotation().clone());  
            
   
          
          if (this.camera.getProjectionMatrixOverride() != null) {
        	             cam.camera.setProjectionMatrixOverride(this.camera.getProjectionMatrixOverride().clone());
        	         }

          
             cam.camera.setViewMatrix(this.camera.getViewMatrix().clone());
             cam.camera.setProjectionMatrix(this.camera.getProjectionMatrix().clone());
             cam.camera.setViewProjectionMatrix(this.camera.getViewProjectionMatrix().clone());
            
            cam.update();

            return cam;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
    
	/**
	 * This method copise the settings of the given camera.
	 * 
	 * @param cam
	 *            the camera we copy the settings from
	 */
    public void copyFrom(CameraView cam) {
    
    	this.camera.setLocation(cam.camera.getLocation());
     
    	this.camera.setRotation(cam.camera.getRotation());
     
        frustum.setFrustumNear(cam.frustum.getFrustumNear());
        frustum.setFrustumFar(cam.frustum.getFrustumFar());
        frustum.setFrustumLeft(cam.frustum.getFrustumLeft());
        frustum.setFrustumRight(cam.frustum.getFrustumRight());
        frustum.setFrustumTop(cam.frustum.getFrustumTop());
        frustum.setFrustumBottom(cam.frustum.getFrustumBottom());
        
        frustum.setCoeffLeftAssignValue(0, cam.frustum.getCoeffLeft()[0]);
        frustum.setCoeffLeftAssignValue(1, cam.frustum.getCoeffLeft()[1]);  
        
        frustum.setCoeffRightAssignValue(0, cam.frustum.getCoeffRight()[0]);
        frustum.setCoeffRightAssignValue(1, cam.frustum.getCoeffRight()[1]);  
   
        frustum.setCoeffBottomAssignValue(0, cam.frustum.getCoeffBottom()[0]);
        frustum.setCoeffBottomAssignValue(1, cam.frustum.getCoeffBottom()[1]);  
        
        frustum.setCoeffTopAssignValue(0, cam.frustum.getCoeffTop()[0]);
        frustum.setCoeffTopAssignValue(1, cam.frustum.getCoeffTop()[1]);  
        
        frustum.setViewPortLeft(cam.frustum.getViewPortLeft());
        frustum.setViewPortRight(cam.frustum.getViewPortRight());
        frustum.setViewPortTop(cam.frustum.getViewPortTop());
        frustum.setViewPortBottom(cam.frustum.getViewPortBottom());
  
        this.width = cam.width;
        this.height = cam.height;
    
        frustum.setPlaneState(cam.frustum.getPlaneState());
        
        this.viewportChanged = cam.viewportChanged;
        for (int i = 0; i < frustum.getMaxWorldPlanes(); ++i) {
        	frustum.getWorldPlane()[i].setNormal(cam.frustum.getWorldPlane()[i].getNormal());
        	frustum.getWorldPlane()[i].setConstant(cam.frustum.getWorldPlane()[i].getConstant());
        }

        this.parallelProjection = cam.parallelProjection;
        if(cam.camera.getProjectionMatrixOverride() != null) {
        	if(this.camera.getProjectionMatrixOverride() == null) {
        	
        		this.camera.setProjectionMatrix(cam.camera.getProjectionMatrix().clone());
        	} else {
       
        		this.camera.setProjectionMatrixOverride(cam.camera.getProjectionMatrixOverride());
        	}
        } else {
        	this.camera.setProjectionMatrixOverride(null);
        }

        this.camera.setViewMatrix(cam.camera.getViewMatrix());
        this.camera.setProjectionMatrix(cam.camera.getProjectionMatrix());
        this.camera.setViewProjectionMatrix(cam.camera.getViewProjectionMatrix());
        
        this.frustum.getGuiBounding().setXExtent(cam.frustum.getGuiBounding().getXExtent());
        this.frustum.getGuiBounding().setYExtent(cam.frustum.getGuiBounding().getYExtent());
        this.frustum.getGuiBounding().setZExtent(cam.frustum.getGuiBounding().getZExtent());
        this.frustum.getGuiBounding().setCenter(cam.frustum.getGuiBounding().getCenter());
        this.frustum.getGuiBounding().setCheckPlane(cam.frustum.getGuiBounding().getCheckPlane());
        
        this.name = cam.name;
    }

    /**
     * This method sets the cameras name.
     * @param name the cameras name
     * 
     * new Camera file: remain here
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the cameras name.
     * @return the cameras name
     * 
     * new Camera file: remain here
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a clipPlane for this camera.
     * The cliPlane is used to recompute the projectionMatrix using the plane as the near plane
     * This technique is known as the oblique near-plane clipping method introduced by Eric Lengyel
     * more info here
     * <ul>
     * <li><a href="http://www.terathon.com/code/oblique.html">http://www.terathon.com/code/oblique.html</a>
     * <li><a href="http://aras-p.info/texts/obliqueortho.html">http://aras-p.info/texts/obliqueortho.html</a>
     * <li><a href="http://hacksoflife.blogspot.com/2008/12/every-now-and-then-i-come-across.html">http://hacksoflife.blogspot.com/2008/12/every-now-and-then-i-come-across.html</a>
     * </ul>
     *
     * Note that this will work properly only if it's called on each update, and be aware that it won't work properly with the sky bucket.
     * if you want to handle the sky bucket, look at how it's done in SimpleWaterProcessor.java
     * @param clipPlane the plane
     * @param side the side the camera stands from the plane
     * 
     * 
     * 
     * 
     *USED externally in: postQueue() in ReflectionProcessor class and preFrame() in SimpleWaterProcessor (Water package)
     *Pure camera method -> we need to connect this part with Frustum to get the clipPlane
     *
     *
     *Remain here (new Camera class)
     *
     */
    public void setClipPlane(Plane clipPlane, Plane.Side side) {     
        float sideFactor = 1;
        if (side == Plane.Side.Negative) {
            sideFactor = -1;
        }
        //we are on the other side of the plane no need to clip anymore.
        if (clipPlane.whichSide(this.camera.getLocation()) == side) {
            return;
        }
        Matrix4f p = this.camera.getProjectionMatrix().clone();

        Matrix4f ivm = this.camera.getViewMatrix().clone();

        Vector3f point = clipPlane.getNormal().mult(clipPlane.getConstant());
        Vector3f pp = ivm.mult(point);
        Vector3f pn = ivm.multNormal(clipPlane.getNormal(), null);
        Vector4f clipPlaneV = new Vector4f(pn.x * sideFactor, pn.y * sideFactor, pn.z * sideFactor, -(pp.dot(pn)) * sideFactor);

        Vector4f v = new Vector4f(0, 0, 0, 0);

        v.x = (Math.signum(clipPlaneV.x) + p.m02) / p.m00;
        v.y = (Math.signum(clipPlaneV.y) + p.m12) / p.m11;
        v.z = -1.0f;
        v.w = (1.0f + p.m22) / p.m23;

        float dot = clipPlaneV.dot(v);//clipPlaneV.x * v.x + clipPlaneV.y * v.y + clipPlaneV.z * v.z + clipPlaneV.w * v.w;
        Vector4f c = clipPlaneV.mult(2.0f / dot);

        p.m20 = c.x - p.m30;
        p.m21 = c.y - p.m31;
        p.m22 = c.z - p.m32;
        p.m23 = c.w - p.m33;
        camera.setProjectionMatrix(p);
    }

    /**
     * Sets a clipPlane for this camera.
     * The cliPlane is used to recompute the projectionMatrix using the plane as the near plane
     * This technique is known as the oblique near-plane clipping method introduced by Eric Lengyel
     * more info here
     * <ul>
     * <li><a href="http://www.terathon.com/code/oblique.html">http://www.terathon.com/code/oblique.html</a></li>
     * <li><a href="http://aras-p.info/texts/obliqueortho.html">http://aras-p.info/texts/obliqueortho.html</a></li>
     * <li><a href="http://hacksoflife.blogspot.com/2008/12/every-now-and-then-i-come-across.html">
     * http://hacksoflife.blogspot.com/2008/12/every-now-and-then-i-come-across.html</a></li>
     * </ul>
     *
     * Note that this will work properly only if it's called on each update, and be aware that it won't work properly with the sky bucket.
     * if you want to handle the sky bucket, look at how it's done in SimpleWaterProcessor.java
     * @param clipPlane the plane
     * 
     * 
     * 
     * 
     * Same reasoning as above
     */
    public void setClipPlane(Plane clipPlane) {
        setClipPlane(clipPlane, clipPlane.whichSide(this.camera.getLocation()));
    }

    /**
     * Resizes this camera's view with the given width and height. This is
     * similar to constructing a new camera, but reusing the same Object. This
     * method is called by an associated {@link RenderManager} to notify the camera of
     * changes in the display dimensions.
     *
     * @param width the view width
     * @param height the view height
     * @param fixAspect If true, the camera's aspect ratio will be recomputed.
     * Recomputing the aspect ratio requires changing the frustum values.
     * 
     * This is also a camera method but the frustum is also affected -> frustum opertions moved to
     * frusturm but a method like onResizeCamera(...) is needed for a call here
     * 
     * Used externally in FilterPostProcessor class, HDRRenderer class, RenderManager class and AwtPanel class
     * Degree of problem: Low
     * 
     * 
     * Remain here (resize the camera view and not the camera!)
     * 
     */
    public void resize(int width, int height, boolean fixAspect) {
        
    	//camera related
    	this.width = width;
        this.height = height;
        
        //frustrum (but maybe camera related)
        updateViewPortChange();

        //frustum related
        if (fixAspect /*&& !parallelProjection*/) {
            frustum.setFrustumRight(frustum.getFrustumTop() * ((float) width / height));
            frustum.setFrustumLeft(-frustum.getFrustumRight());
            updateFrustumChange();
        }
    }
    /**
     * <code>setFrustumBottom</code> sets the value of the bottom frustum
     * plane.
     *
     * @param frustumBottom the value of the bottom frustum plane.
     * 
     * Used externally in zoomCamera(float) in FlyByCamera.java
     * 
     * Degree of problem: high, since this method will be shifted to the new frustum classes 
     * 							so we need to investigate the impact if this method is removed
     * 
     * 
     */
    public void updateFrustumBottom(float frustumBottom) {
        this.frustum.setFrustumBottom(frustumBottom);
        updateFrustumChange();
    }
    /**
     * <code>setFrustumFar</code> sets the value of the far frustum plane.
     *
     * @param frustumFar the value of the far frustum plane.
     * 
     * 
     * Externally used in parseCameraClipping in SceneLoader
     * Good thing used in jme3tests{batching,bullet,effect,light,post,water}!
     *
     * 
     * 
     */
    public void updateFrustumFar(float frustumFar) {
        this.frustum.setFrustumFar(frustumFar); //frustumFar = frustumFar;
       updateFrustumChange();
    }
    /**
     * <code>setFrustumLeft</code> sets the value of the left frustum plane.
     *
     * @param frustumLeft the value of the left frustum plane.
     * 
     * Used in zoomCamera in FlyByCamera
     * 
     */
    public void updateFrustumLeft(float frustumLeft) {
        this.frustum.setFrustumLeft(frustumLeft);
        updateFrustumChange();
    }
    /**
     * <code>setFrustumNear</code> sets the value of the near frustum plane.
     *
     * @param frustumNear the value of the near frustum plane.
     *
     * Exterbnally used in Sceneloader -> parseCameraClipping() 
     */
    public void updateFrustumNear(float frustumNear) {
        this.frustum.setFrustumNear(frustumNear);
        updateFrustumChange();
    }
    /**
     * <code>setFrustumRight</code> sets the value of the right frustum plane.
     *
     * @param frustumRight the value of the right frustum plane.
     */
    public void updateFrustumRight(float frustumRight) {
        this.frustum.setFrustumRight(frustumRight);
        updateFrustumChange();
    }

    /**
     * <code>setFrustumTop</code> sets the value of the top frustum plane.
     *
     * @param frustumTop the value of the top frustum plane.
     * 
     * Externally used in ZoomCamera() in FlyBycamera
     */
    public void updateFrustumTop(float frustumTop) {
        this.frustum.setFrustumTop(frustumTop);
        updateFrustumChange();
    }
    /**
     * <code>setLocation</code> sets the position of the camera.
     *
     * @param location the position of the camera.
     * 
     * 
     * Depends
     * 
     */
    public void updateLocation(Vector3f location) {
        this.camera.setLocation(location);
        updateFrameChange();
    }

    /**
     * <code>setRotation</code> sets the orientation of this camera. 
     * This will be equivelant to setting each of the axes:
     * <code><br>
     * cam.setLeft(rotation.getRotationColumn(0));<br>
     * cam.setUp(rotation.getRotationColumn(1));<br>
     * cam.setDirection(rotation.getRotationColumn(2));<br>
     * </code>
     *
     * @param rotation the rotation of this camera
     * 
     * Depends
     * 
     */
    public void updateRotation(Quaternion rotation) {
        this.camera.setRotation(rotation); //rotation.set(rotation);
        updateFrameChange();
    }

    /**
     * <code>lookAtDirection</code> sets the direction the camera is facing
     * given a direction and an up vector.
     *
     * @param direction the direction this camera is facing.
     * 
     * 
     * Depends
     * 
     */
    public void lookAtDirection(Vector3f direction, Vector3f up) {
     //   this.rotation.lookAt(direction, up);
    	this.camera.lookAtDirection(direction, up);
        updateFrameChange();
    }

    /**
     * <code>setAxes</code> sets the axes (left, up and direction) for this
     * camera.
     *
     * @param left      the left axis of the camera.
     * @param up        the up axis of the camera.
     * @param direction the direction the camera is facing.
     * 
     * @see CameraView#setAxes(com.jme3.math.Quaternion) 
     * 
     * 
     * Depends
     * 
     */
    public void updateAxes(Vector3f left, Vector3f up, Vector3f direction) {
      //  this.rotation.fromAxes(left, up, direction);
    	this.camera.setAxes(left, up, direction);
        updateFrameChange();
    }

    /**
     * <code>setAxes</code> uses a rotational matrix to set the axes of the
     * camera.
     *
     * @param axes the matrix that defines the orientation of the camera.
     * 
     * 
     * Depends
     * 
     */
    public void updateAxes(Quaternion axes) {
        this.camera.setAxes(axes);
        updateFrameChange();
    }

    /**
     * normalize normalizes the camera vectors.
     * 
     * 
     * Depends
     * 
     */
    public void normalize() {
       // this.rotation.normalizeLocal();
    	this.camera.normalize();
        updateFrameChange();
    }

    /**
     * <code>setFrustum</code> sets the frustum of this camera object.
     *
     * @param near   the near plane.
     * @param far    the far plane.
     * @param left   the left plane.
     * @param right  the right plane.
     * @param top    the top plane.
     * @param bottom the bottom plane.
     * @see CameraView#setFrustum(float, float, float, float,
     *      float, float)
     *      
     *      
     * Pure frustum method, should not be here
     * 
     * Externally called in water and shadow packages
     * Test cases exist! good!
     * 
     * Degree of problem: medium (due to external calls)         
     */
    public void updateFrustum(float near, float far, float left, float right,
            float top, float bottom) {

    	//wraping around as of now....
    	   frustum.setFrustum(near, far, left, right, top, bottom);
    /*    frustumNear = near;
        frustumFar = far;
        frustumLeft = left;
        frustumRight = right;
        frustumTop = top;
        frustumBottom = bottom;*/
        updateFrustumChange();
    }

    /**
     * <code>setFrustumPerspective</code> defines the frustum for the camera.  This
     * frustum is defined by a viewing angle, aspect ratio, and near/far planes
     *
     * @param fovY   Frame of view angle along the Y in degrees.
     * @param aspect Width:Height ratio
     * @param near   Near view plane distance
     * @param far    Far view plane distance
     * 
     * External call in initCamera() in Application and in 6 other classes
     * Degree of Problem: medium, this is a pure frustum method but this is
     * method is mainly desgined for the camera
     * 
     */
    public void updateFrustumPerspective(float fovY, float aspect, float near,
            float far) {
    	
    	//moved to frustum
    	frustum.setFrustumPerspective(fovY, aspect, near, far);
       /* if (Float.isNaN(aspect) || Float.isInfinite(aspect)) {
            // ignore.
            logger.log(Level.WARNING, "Invalid aspect given to setFrustumPerspective: {0}", aspect);
            return;
        }

        float h = FastMath.tan(fovY * FastMath.DEG_TO_RAD * .5f) * near;
        float w = h * aspect;
        frustumLeft = -w;
        frustumRight = w;
        frustumBottom = -h;
        frustumTop = h;
        frustumNear = near;
        frustumFar = far;

        // Camera is no longer parallel projection even if it was before */
        parallelProjection = false;

        updateFrustumChange();
    }

    /**
     * <code>setFrame</code> sets the orientation and location of the camera.
     *
     * @param location  the point position of the camera.
     * @param left      the left axis of the camera.
     * @param up        the up axis of the camera.
     * @param direction the facing of the camera.
     * @see CameraView#setFrame(com.jme3.math.Vector3f,
     *      com.jme3.math.Vector3f, com.jme3.math.Vector3f, com.jme3.math.Vector3f)
     *      
     *      
     *      Camera related
     *      
     */
    public void setFrame(Vector3f location, Vector3f left, Vector3f up,
            Vector3f direction) {

    	this.camera.setLocation(location);
    	this.camera.getRotation().fromAxes(left, up, direction);
       // this.location = location;
      //  this.rotation.fromAxes(left, up, direction);
        updateFrameChange();
    }

    /**
     * <code>lookAt</code> is a convienence method for auto-setting the frame
     * based on a world position the user desires the camera to look at. It
     * repoints the camera towards the given position using the difference
     * between the position and the current camera location as a direction
     * vector and the worldUpVector to compute up and left camera vectors.
     *
     * @param pos           where to look at in terms of world coordinates
     * @param worldUpVector a normalized vector indicating the up direction of the world.
     *                      (typically {0, 1, 0} in jME.)
     *                      
     *    Camera related                  
     *                      
     */
    public void lookAt(Vector3f pos, Vector3f worldUpVector) {
        TempVars vars = TempVars.get();
        Vector3f newDirection = vars.vect1;
        Vector3f newUp = vars.vect2;
        Vector3f newLeft = vars.vect3;

        newDirection.set(pos).subtractLocal(this.camera.getLocation()).normalizeLocal();

        newUp.set(worldUpVector).normalizeLocal();
        if (newUp.equals(Vector3f.ZERO)) {
            newUp.set(Vector3f.UNIT_Y);
        }

        newLeft.set(newUp).crossLocal(newDirection).normalizeLocal();
        if (newLeft.equals(Vector3f.ZERO)) {
            if (newDirection.x != 0) {
                newLeft.set(newDirection.y, -newDirection.x, 0f);
            } else {
                newLeft.set(0f, newDirection.z, -newDirection.y);
            }
        }

        newUp.set(newDirection).crossLocal(newLeft).normalizeLocal();

 //       this.rotation.fromAxes(newLeft, newUp, newDirection);
 //       this.rotation.normalizeLocal();
        vars.release();

        updateFrameChange();
    }

    /**
     * <code>setFrame</code> sets the orientation and location of the camera.
     * 
     * @param location
     *            the point position of the camera.
     * @param axes
     *            the orientation of the camera.
     *
     *
     * Camera related
     *
     */
    public void setFrame(Vector3f location, Quaternion axes) {
       
    	this.camera.setLocation(location);
    	//TODO:verify that this workds
    	this.camera.getRotation().set(axes);
    	//this.location = location;
        //this.rotation.set(axes);
        updateFrameChange();
    }

    /**
     * <code>update</code> updates the camera parameters by calling
     * <code>onFrustumChange</code>,<code>updateViewPortChange</code> and
     * <code>updateFrameChange</code>.
     *
     * @see CameraView#update()
     * 
     * 
     * 
     *  Update method for Frustum class is needed (a seperation here)
     *  
     * 
     */
    public void update() {
        updateFrustumChange();
        updateViewPortChange();
        updateFrameChange();
    }

  
    /**
     * <code>setViewPortLeft</code> sets the left boundary of the viewport
     *
     * @param left the left boundary of the viewport
     * 
     * 
     * Not used
     * 
     */
   public void updateViewPortLeft(float left) {
        frustum.setViewPortLeft(left);
        updateViewPortChange();
    }

    /**
     * <code>setViewPortRight</code> sets the right boundary of the viewport
     *
     * @param right the right boundary of the viewport
     * 
     * 
     * Not used
     */
    public void updateViewPortRight(float right) {
        frustum.setViewPortRight(right);
        updateViewPortChange();
    }

    /**
     * <code>setViewPortTop</code> sets the top boundary of the viewport
     *
     * @param top the top boundary of the viewport
     *
     *
     *Not used
     *
     */
    public void updateViewPortTop(float top) {
        this.frustum.setViewPortTop(top);
        updateViewPortChange();
    }

    /**
     * <code>setViewPortBottom</code> sets the bottom boundary of the viewport
     *
     * @param bottom the bottom boundary of the viewport
     * 
     * 
     * Not used
     * 
     */
    public void updateViewPortBottom(float bottom) {
        this.frustum.setViewPortBottom(bottom);
        updateViewPortChange();
    }

    /**
     * <code>setViewPort</code> sets the boundaries of the viewport
     *
     * @param left   the left boundary of the viewport (default: 0)
     * @param right  the right boundary of the viewport (default: 1)
     * @param bottom the bottom boundary of the viewport (default: 0)
     * @param top    the top boundary of the viewport (default: 1)
     * 
     * 
     * As this method might be moved to Fustrum class, 
     * External calls from FilterPostProcessor class, RenderManager, ViewPort classes
     * test cases exist
     * 
     * 
     */
    public void setViewPort(float left, float right, float bottom, float top) 
    {
               
    	this.frustum.setViewPortLeft(left);
    	this.frustum.setViewPortRight(right);
    	this.frustum.setViewPortBottom(bottom);
    	this.frustum.setViewPortTop(top);
    	updateViewPortChange();
    //	this.viewPortLeft = left;
    //    this.viewPortRight = right;
    //    this.viewPortBottom = bottom;
    //    this.viewPortTop = top;
        
    }
  
    /**
     * @return True if the viewport (width, height, left, right, bottom, up)
     * has been changed. This is needed in the renderer so that the proper
     * viewport can be set-up.
     * 
     * 
     * A potential part of the fustrum class
     * External call: setViewPort in RenderManager 
     * 
     */
    public boolean isViewportChanged() {
        return viewportChanged;
    }

    /**
     * Clears the viewport changed flag once it has been updated inside
     * the renderer.
     * 
     * A potential part of the fustrum class
     * External call: setViewPort in RenderManager 
     * 
     * 
     */
    public void clearViewportChanged() {
        viewportChanged = false;
    }

    /**
     * Called when the viewport has been changed.
     * 
     * 
     * Mostly used inside this class actually! why not private or protected?
     * Internal calls: Camera(), read(), resize(), setViewPort*(), update()
     * 
     * Potentially can be used in Frustum class
     * 
     */
    public void updateViewPortChange() {
        viewportChanged = true;
        //setGuiBounding();
        frustum.setGuiBounding(width,height);
    }

   
    /**
     * <code>onFrustumChange</code> updates the frustum to reflect any changes
     * made to the planes. The new frustum values are kept in a temporary
     * location for use when calculating the new frame. The projection
     * matrix is updated to reflect the current values of the frustum.
     * 
     * 
     * Method only used in this class (similar fashion as the one above)
     * 
     * This method is subject of move to the fustrum class
     * 
     * 90% is fustrum code and the last is camera code
     * 
     * 
     * 
     * 
     */
    public void updateFrustumChange() {
 
    
      frustum.onFrustrumChange(isParallelProjection());
        
        //Camera code
    this.camera.getProjectionMatrix().fromFrustum(frustum.getFrustumNear(), frustum.getFrustumFar(), frustum.getFrustumLeft(), frustum.getFrustumRight(), frustum.getFrustumTop(), frustum.getFrustumBottom(), parallelProjection);
//        projectionMatrix.transposeLocal();

        // The frame is effected by the frustum values
        // update it as well
          
         
    //	frustum.onFrustrumChangefrus();
        updateFrameChange();
    }

    //on frame change() moved
    /**
     * <code>updateFrameChange</code> updates the view frame of the camera.
     * 
     * Camera related BUUT planes are used here and the code is mainly
     * fustrum related, we need to figure out what to do with this.
     * 
     * on the other hand this a high coupling with the fustrum and the camera
     * since the frame technically is a plane and the camera needs to know 
     * hot to project it
     * 
     * Degree of problem medium-high
     * 
     */       
    public void updateFrameChange() {
    	
    	this.camera.onFrameChange(this.frustum, isParallelProjection());

    }

    /**
     * @return true if parallel projection is enable, false if in normal perspective mode
     * @see #setParallelProjection(boolean)
     * 
     * 
     * camera related but is used in onFrutstumChange
     * 
     */
    public boolean isParallelProjection() {
        return this.parallelProjection;
    }

    /**
     * Enable/disable parallel projection.
     *
     * @param value true to set up this camera for parallel projection is enable, false to enter normal perspective mode
     * 
     * Camera related but it has an effect on the frustrum!!
     * 
     * External calls in other packages!!
     * 
     */
    public void setParallelProjection(final boolean value) {
        this.parallelProjection = value;
        updateFrustumChange();
    }

    /**
     * Computes the z value in projection space from the z value in view space 
     * Note that the returned value is going non linearly from 0 to 1.
     * for more explanations on non linear z buffer see
     * http://www.sjbaker.org/steve/omniv/love_your_z_buffer.html
     * @param viewZPos the z value in view space.
     * @return the z value in projection space.
     * 
     * 
     * not even used, dont know if this is camera code or fustrum code
     * 
     */
    public float getViewToProjectionZ(float viewZPos) {
        float far = frustum.getFrustumFar();
        float near = frustum.getFrustumNear();
        float a = far / (far - near);
        float b = far * near / (near - far);
        return a + b / viewZPos;
    }

    /**
     * Computes a position in World space given a screen position in screen space (0,0 to width, height)
     * and a z position in projection space ( 0 to 1 non linear).
     * This former value is also known as the Z buffer value or non linear depth buffer.
     * for more explanations on non linear z buffer see
     * http://www.sjbaker.org/steve/omniv/love_your_z_buffer.html
     * 
     * To compute the projection space z from the view space z (distance from cam to object) @see Camera#getViewToProjectionZ
     * 
     * @param screenPos 2d coordinate in screen space
     * @param projectionZPos non linear z value in projection space
     * @return the position in world space.
     * 
     * 
     * Many external calls, is it Camera code or Fustrum code?
     * 
     */
    public Vector3f getWorldCoordinates(Vector2f screenPos, float projectionZPos) {
        return getWorldCoordinates(screenPos, projectionZPos, null);
    }

    /**
     * @see CameraView#getWorldCoordinates
     * 
     * Same issue as above, here we can see both camera code and fustrum code
     * 
     */
    public Vector3f getWorldCoordinates(Vector2f screenPosition,
            float projectionZPos, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
 
        Matrix4f inverseMat = new Matrix4f(this.camera.getViewProjectionMatrix());
        inverseMat.invertLocal();

        store.set(
                (screenPosition.x / getWidth() - frustum.getViewPortLeft()) / (frustum.getViewPortRight() - frustum.getViewPortLeft()) * 2 - 1,
                (screenPosition.y / getHeight() - frustum.getViewPortBottom()) / (frustum.getViewPortTop() - frustum.getViewPortBottom()) * 2 - 1,
                projectionZPos * 2 - 1);

        float w = inverseMat.multProj(store, store);      
        store.multLocal(1f / w);

        return store;
    }

    /**
     * Converts the given position from world space to screen space.
     * 
     * @see CameraView#getScreenCoordinates
     * 
     * not used
     * 
     */
    public Vector3f getScreenCoordinates(Vector3f worldPos) {
        return getScreenCoordinates(worldPos, null);
    }

    /**
     * Converts the given position from world space to screen space.
     *
     * @see CameraView#getScreenCoordinates(Vector3f, Vector3f)
     * 
     * Internally used(see above code)
     * 
     * has both camera code and viewport code(fustrum)
     * 
     * 
     */
    public Vector3f getScreenCoordinates(Vector3f worldPosition, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }

//        TempVars vars = vars.lock();
//        Quaternion tmp_quat = vars.quat1;
//        tmp_quat.set( worldPosition.x, worldPosition.y, worldPosition.z, 1 );
//        viewProjectionMatrix.mult(tmp_quat, tmp_quat);
//        tmp_quat.multLocal( 1.0f / tmp_quat.getW() );
//        store.x = ( ( tmp_quat.getX() + 1 ) * ( viewPortRight - viewPortLeft ) / 2 + viewPortLeft ) * getWidth();
//        store.y = ( ( tmp_quat.getY() + 1 ) * ( viewPortTop - viewPortBottom ) / 2 + viewPortBottom ) * getHeight();
//        store.z = ( tmp_quat.getZ() + 1 ) / 2;
//        vars.release();

        float w = this.camera.getViewProjectionMatrix().multProj(worldPosition, store);
        store.divideLocal(w);

        store.x = ((store.x + 1f) * (frustum.getViewPortRight() - frustum.getViewPortLeft()) / 2f + frustum.getViewPortLeft()) * getWidth();
        store.y = ((store.y + 1f) * (frustum.getViewPortTop() - frustum.getViewPortBottom()) / 2f + frustum.getViewPortBottom()) * getHeight();
        store.z = (store.z + 1f) / 2f;

        return store;
    }

    /**
     * @return the width/resolution of the display.
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the height/resolution of the display.
     */
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Camera[location=" + this.camera.getLocation() + "\n, direction=" + this.camera.getDirection() + "\n"
                + "res=" + width + "x" + height + ", parallel=" + parallelProjection + "\n"
                + "near=" + frustum.getFrustumNear() + ", far=" + frustum.getFrustumFar() + "]";
    }
    
    public void write(JmeExporter e) throws IOException {
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(this.camera.getLocation(), "location", Vector3f.ZERO);
        capsule.write(this.camera.getRotation(), "rotation", Quaternion.DIRECTION_Z);
        capsule.write(frustum.getFrustumNear(), "frustumNear", 1);
        capsule.write(frustum.getFrustumFar(), "frustumFar", 2);
        capsule.write(frustum.getFrustumLeft(), "frustumLeft", -0.5f);
        capsule.write(frustum.getFrustumRight(), "frustumRight", 0.5f);
        capsule.write(frustum.getFrustumTop(), "frustumTop", 0.5f);
        capsule.write(frustum.getFrustumBottom(), "frustumBottom", -0.5f);
        capsule.write(frustum.coeffLeft, "coeffLeft", new float[2]);
        capsule.write(frustum.coeffRight, "coeffRight", new float[2]);
        capsule.write(frustum.coeffBottom, "coeffBottom", new float[2]);
        capsule.write(frustum.coeffTop, "coeffTop", new float[2]);
        capsule.write(frustum.getViewPortLeft(), "viewPortLeft", 0);
        capsule.write(frustum.getViewPortRight(), "viewPortRight", 1);
        capsule.write(frustum.getViewPortTop(), "viewPortTop", 1);
        capsule.write(frustum.getViewPortBottom(), "viewPortBottom", 0);
        capsule.write(width, "width", 0);
        capsule.write(height, "height", 0);
        capsule.write(name, "name", null);
    }

    public void read(JmeImporter e) throws IOException {
        InputCapsule capsule = e.getCapsule(this);
        this.camera.setLocation((Vector3f) capsule.readSavable("location", Vector3f.ZERO.clone()));
        this.camera.setRotation((Quaternion) capsule.readSavable("rotation", Quaternion.DIRECTION_Z.clone()));
        //     location = (Vector3f) capsule.readSavable("location", Vector3f.ZERO.clone());
    //    rotation = (Quaternion) capsule.readSavable("rotation", Quaternion.DIRECTION_Z.clone());
        frustum.setFrustumNear(capsule.readFloat("frustumNear", 1));
        frustum.setFrustumFar ( capsule.readFloat("frustumFar", 2));
        frustum.setFrustumLeft ( capsule.readFloat("frustumLeft", -0.5f));
        frustum.setFrustumRight ( capsule.readFloat("frustumRight", 0.5f));
        frustum.setFrustumTop ( capsule.readFloat("frustumTop", 0.5f));
        frustum.setFrustumBottom ( capsule.readFloat("frustumBottom", -0.5f));
        frustum.coeffLeft = capsule.readFloatArray("coeffLeft", new float[2]);
        frustum.coeffRight = capsule.readFloatArray("coeffRight", new float[2]);
        frustum.coeffBottom = capsule.readFloatArray("coeffBottom", new float[2]);
        frustum.coeffTop = capsule.readFloatArray("coeffTop", new float[2]);
        frustum.setViewPortLeft (capsule.readFloat("viewPortLeft", 0));
        frustum.setViewPortRight ( capsule.readFloat("viewPortRight", 1));
        frustum.setViewPortTop (capsule.readFloat("viewPortTop", 1));
        frustum.setViewPortBottom ( capsule.readFloat("viewPortBottom", 0));
        width = capsule.readInt("width", 1);
        height = capsule.readInt("height", 1);
        name = capsule.readString("name", null);
        updateFrustumChange();
        updateViewPortChange();
        updateFrameChange();
    }
}
