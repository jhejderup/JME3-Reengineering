/**
 * 
 */
package com.jme3.renderer;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.jme3.bounding.BoundingVolume;
import com.jme3.math.FastMath;
import com.jme3.math.Plane;
import com.jme3.math.Vector3f;


/**
 * 
 * Just shift the code to this class, just make "wraparounds" of the methods that have
 * a mix of camera and fustrum code, and replace the fustrum code in the camera class with a 
 * method call containing the shifted code
 * There are I think some methods that can just be shifted with out Problem
 * 
 *
 * I have added a global variable in the camera class fo this
 *
 */
public class Frustum {
	
	private static final Logger logger = Logger.getLogger(Frustum.class.getName());
	/**
     * Distance from camera to near frustum plane.
     * used in Camera(), copyFrom(Camera), getFrustumNear(), onFrameChange(), onFrustumChange(), read(), setFrustum()x3, toString(), write()
     * Same for the others
     */
    protected float frustumNear;
    /**
     * Distance from camera to far frustum plane.
     */
    protected float frustumFar;
    /**
     * Distance from camera to left frustum plane.
     */
    protected float frustumLeft;
    /**
     * Distance from camera to right frustum plane.
     */
    protected float frustumRight;
    /**
     * Distance from camera to top frustum plane.
     */
    protected float frustumTop;
    /**
     * Distance from camera to bottom frustum plane.
     */
    protected float frustumBottom;
    /**
     * A mask value set during contains() that allows fast culling of a Node's
     * children.
     */
    private int planeState;
    /**
     * FRUSTUM_PLANES represents the number of planes of the camera frustum.
     */  
    private static final int FRUSTUM_PLANES = 6;
    /**
     * MAX_WORLD_PLANES holds the maximum planes allowed by the system.
     */
    private static final int MAX_WORLD_PLANES = 6;
    /**
     * Used in Camera(), copyFrom(Camera), onFrameChange(), onFrustumChange(), read(), write()
     * This is valid for all coeff* arrays
     */
    protected float[] coeffLeft;
	protected float[] coeffRight;
    protected float[] coeffBottom;
    protected float[] coeffTop;
    /**
     * Array holding the planes that this camera will check for culling.
     */      
    public Plane[] worldPlane;
    /**
	 * @return the worldPlane
	 */
	public Plane[] getWorldPlane() {
		return worldPlane;
	}
	/**
	 * @param worldPlane the worldPlane to set
	 */
	public void setWorldPlane(Plane[] worldPlane) {
		this.worldPlane = worldPlane;
	}
	/**
	 * Set a value in the worldplane array
	 * @param index
	 * @param plane
	 */
	public void setWorldPlaneValue(int index, Plane plane){
		
		this.worldPlane[index] = plane;
	}
	   /**
     * Returns the pseudo distance from the given position to the near
     * plane of the camera. This is used for render queue sorting.
     * @param pos The position to compute a distance to.
     * @return Distance from the far plane to the point.
     * 
     * 
     * Not used 
     * 
     * This uses code that should be in the future fustrum class
     * 
     * Degree of Problem: low
     * 
     */
    public float distanceToNearPlane(Vector3f pos) {
        return worldPlane[Planes.NEAR_PLANE.getPlaneValue()].pseudoDistance(pos);
    }
	
	
	/**
     * Percent value on display where horizontal viewing starts for this camera.
     * Default is 0.
     * Used in: Camera(), copyFrom(Camera), getScreenCoordinates(),getViewPortLeft(), getWorldCoordinates, 
     * read(), setGuiBounding(),SetViewPort(), write()
     */
    protected float viewPortLeft;
    /**
     * Percent value on display where horizontal viewing ends for this camera.
     * Default is 1.
     */
    protected float viewPortRight;
    /**
     * Percent value on display where vertical viewing ends for this camera.
     * Default is 1.
     */
    protected float viewPortTop;
    /**
     * Percent value on display where vertical viewing begins for this camera.
     * Default is 0.
     */
    protected float viewPortBottom;
    /**
     * The enum represents all the available planes
     * in a frustum and each plane has been assigned
     */
    public enum Planes{
		/**      
	     * LEFT_PLANE represents the left plane of the camera frustum.
	     */
	    LEFT_PLANE(0),
	    /**
	     * RIGHT_PLANE represents the right plane of the camera frustum.
	     */
	    RIGHT_PLANE(1),
	    /**
	     * BOTTOM_PLANE represents the bottom plane of the camera frustum.
	     */
	    BOTTOM_PLANE(2),
	    /**
	     * TOP_PLANE represents the top plane of the camera frustum.
	     */
	    TOP_PLANE(3),
	    /**
	     * FAR_PLANE represents the far plane of the camera frustum.
	     */
	    FAR_PLANE(4),
	    /**
	     * NEAR_PLANE represents the near plane of the camera frustum.
	     */
	    NEAR_PLANE(5);
	    
	    private int value;
	    private Planes(int value){this.value=value;}
        public int getPlaneValue(){return value;}
    }  
    
    public enum FrustumIntersect {

        /**
         * defines a constant assigned to spatials that are completely outside
         * of this camera's view frustum.
         */
        Outside,
        /**
         * defines a constant assigned to spatials that are completely inside
         * the camera's view frustum.
         */
        Inside,
        /**
         * defines a constant assigned to spatials that are intersecting one of
         * the six planes that define the view frustum.
         */
        Intersects;
    }
	
    public Frustum(){
    	
    	initPlanes();
    	
    }
    
    //the construcotr as per constructor public Camera(int width, int height) in camera class
    // can this be placed in the method?
	
    
    /**
     * This needs to be sorted 
     * @param a
     */
    public Frustum(boolean a)
	{
    	this();
		frustumNear = 1.0f;
        frustumFar = 2.0f;
        frustumLeft = -0.5f;
        frustumRight = 0.5f;
        frustumTop = 0.5f;
        frustumBottom = -0.5f;

        coeffLeft = new float[2];
        coeffRight = new float[2];
        coeffBottom = new float[2];
        coeffTop = new float[2];

        viewPortLeft = 0.0f;
        viewPortRight = 1.0f;
        viewPortTop = 1.0f;
        viewPortBottom = 0.0f;

	}
	
	public void initPlanes(){
		 worldPlane = new Plane[getMaxWorldPlanes()];
	     for (int i = 0; i < getMaxWorldPlanes(); i++) {
	           worldPlane[i] = new Plane();
	      }
	}
    /**
     * <code>getFrustumBottom</code> returns the value of the bottom frustum
     * plane.
     *
     * @return the value of the bottom frustum plane.
     * 
     * 
     * Used externally in postQueue() in SimpleWaterProcessor in water package
     * 					  preFrame()  in WaterFilter in water package
     * Degree of problem: high, since this method will be shifted to the new frustum classes 
     * 							so we need to investigate the impact if this method is removed
     * 
     */
    public float getFrustumBottom() {
        return frustumBottom;
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
    public void setFrustumBottom(float frustumBottom) {
        this.frustumBottom = frustumBottom;
       
    }
    /**
     * <code>getFrustumFar</code> gets the value of the far frustum plane.
     *
     * @return the value of the far frustum plane.
     * 
     * Not used but could be a problem!
     * 
     * 
     */
    public float getFrustumFar() {
        return frustumFar;
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
    public void setFrustumFar(float frustumFar) {
        this.frustumFar = frustumFar;
    }
    /**
     * <code>getFrustumLeft</code> gets the value of the left frustum plane.
     *
     * @return the value of the left frustum plane.
     * 
     * 
     *  Not used but could be a problem!
     *  
     *  
     */
    public float getFrustumLeft() {
        return frustumLeft;
    }
    /**
     * <code>setFrustumLeft</code> sets the value of the left frustum plane.
     *
     * @param frustumLeft the value of the left frustum plane.
     * 
     * Used in zoomCamera in FlyByCamera
     * 
     */
    public void setFrustumLeft(float frustumLeft) {
        this.frustumLeft = frustumLeft;
    
    }

    /**
     * <code>getFrustumNear</code> gets the value of the near frustum plane.
     *
     * @return the value of the near frustum plane.
     * 
     * Used externally in zoomCamera in FlyByCamera, initFilter() in SSAOFilter, controlRender() in LodControl
     *                    setCamera in UniformBindingManager, some classes in water and shadow package and
     *                    perspectiveLodCalculator()
     * 
     * internally used in getViewToProjectionZ()                   
     *                    
     * Degree of problem: high , high usage of this method                   
     *                      
     */
    public float getFrustumNear() {
        return frustumNear;
    }
    /**
     * <code>setFrustumNear</code> sets the value of the near frustum plane.
     *
     * @param frustumNear the value of the near frustum plane.
     *
     * Exterbnally used in Sceneloader -> parseCameraClipping() 
     */
    public void setFrustumNear(float frustumNear) {
        this.frustumNear = frustumNear;
      
    }
    /**
     * <code>getFrustumRight</code> gets the value of the right frustum plane.
     *
     * @return frustumRight the value of the right frustum plane.
     * 
     * Externally used in zoomCamera() in FlyBycamera, used in ShadowUtil in shadow package
     * 					 used in SimpleWaterProcessor, WaterFiler class
     */
    public float getFrustumRight() {
        return frustumRight;
    }
    /**
     * <code>setFrustumRight</code> sets the value of the right frustum plane.
     *
     * @param frustumRight the value of the right frustum plane.
     */
    public void setFrustumRight(float frustumRight) {
        this.frustumRight = frustumRight;
   
    }
    /**
     * <code>getFrustumTop</code> gets the value of the top frustum plane.
     *
     * @return the value of the top frustum plane.
     * 
     * Same as the other used in many external packages
     * 
     */
    public float getFrustumTop() {
        return frustumTop;
    }
    /**
     * <code>setFrustumTop</code> sets the value of the top frustum plane.
     *
     * @param frustumTop the value of the top frustum plane.
     * 
     * Externally used in ZoomCamera() in FlyBycamera
     */
    public void setFrustumTop(float frustumTop) {
        this.frustumTop = frustumTop;
  
    }
    /**
     * 
     * @return
     */
    public  int getMaxWorldPlanes() {
		return MAX_WORLD_PLANES;
	}
    public void setCoeffLeftAssignValue(int index,float value){
    	this.coeffLeft[index] = value;
    }
    public void setCoeffRightAssignValue(int index,float value){
    	this.coeffRight[index] = value;
    }
    public void setCoeffBottomAssignValue(int index,float value){
 	   this.coeffBottom[index] = value;
    }    
    public void setCoeffTopAssignValue(int index,float value){
	 	this.coeffTop[index] = value;
	}    
	public float[] getCoeffLeft() {
		return coeffLeft;
	}
	/**
	 * @param floats the coeffLeft to set
	 */
	public void setCoeffLeft(float[] floats) {
		this.coeffLeft = floats;
	}
	/**
	 * @return the coeffRight
	 */
	public float[] getCoeffRight() {
		return coeffRight;
	}
	/**
	 * @param floats the coeffRight to set
	 */
	public void setCoeffRight(float[] floats) {
		this.coeffRight = floats;
	}
	/**
	 * @return the coeffBottom
	 */
	public float[] getCoeffBottom() {
		return coeffBottom;
	}
	/**
	 * @param coeffBottom the coeffBottom to set
	 */
	public void setCoeffBottom(float[] coeffBottom) {
		this.coeffBottom = coeffBottom;
	}
	/**
	 * @return the coeffTop
	 */
	public float[] getCoeffTop() {
		return coeffTop;
	}
	/**
	 * @param coeffTop the coeffTop to set
	 */
	public void setCoeffTop(float[] coeffTop) {
		this.coeffTop = coeffTop;
	}
    /**
     * <code>getViewPortLeft</code> gets the left boundary of the viewport
     *
     * @return the left boundary of the viewport
     * 
     * Externally used
     * 
     */
    public float getViewPortLeft() {
        return viewPortLeft;
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
    public void setViewPortLeft(float left) {
        viewPortLeft = left;
     
    }
    /**
     * <code>getViewPortRight</code> gets the right boundary of the viewport
     *
     * @return the right boundary of the viewport
     * 
     * Externally used
     * 
     */
    public float getViewPortRight() {
        return viewPortRight;
    }
    /**
     * <code>setViewPortRight</code> sets the right boundary of the viewport
     *
     * @param right the right boundary of the viewport
     * 
     * 
     * Not used
     */
    public void setViewPortRight(float right) {
        viewPortRight = right;
        
    }
    /**
     * <code>getViewPortTop</code> gets the top boundary of the viewport
     *
     * @return the top boundary of the viewport
     * 
     * 
     * Externally used
     * 
     */
    public float getViewPortTop() {
        return viewPortTop;
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
    public void setViewPortTop(float top) {
        viewPortTop = top;
       
    }
    /**
     * <code>getViewPortBottom</code> gets the bottom boundary of the viewport
     *
     * @return the bottom boundary of the viewport
     * 
     * Externally used
     * 
     */
    public float getViewPortBottom() {
        return viewPortBottom;
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
    public void setViewPortBottom(float bottom) {
        viewPortBottom = bottom;
       
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
    public void setViewPort(float left, float right, float bottom, float top) {
        this.viewPortLeft = left;
        this.viewPortRight = right;
        this.viewPortBottom = bottom;
        this.viewPortTop = top;
       
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
     * @see Camera#setFrustum(float, float, float, float,
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
    public void setFrustum(float near, float far, float left, float right,
            float top, float bottom) {

        frustumNear = near;
        frustumFar = far;
        frustumLeft = left;
        frustumRight = right;
        frustumTop = top;
        frustumBottom = bottom;
      //  camuse.onFrustumChange();//temp as of now to keep things in tact
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
    public void setFrustumPerspective(float fovY, float aspect, float near,
            float far) {
        if (Float.isNaN(aspect) || Float.isInfinite(aspect)) {
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

        // Camera is no longer parallel projection even if it was before
   
    }
    /**
     * <code>getPlaneState</code> returns the state of the frustum planes. So
     * checks can be made as to which frustum plane has been examined for
     * culling thus far.
     *
     * @return the current plane state int.
     * 
     * Externally called in renderSubScene in RenderManager and ShadowUtil
     * Degree of Problem: medium (could maybe be decoupled from camera)
     * 
     */
    public int getPlaneState() {
        return planeState;
    }

    /**
     * <code>setPlaneState</code> sets the state to keep track of tested
     * planes for culling.
     *
     * @param planeState the updated state.
     * 
     * 
     * Externally used in renderScence,rendeSubScene in RenderManager
     * 				   also used in the optimize package and shadow package
     * 
     * 
     */
    public void setPlaneState(int planeState) {
        this.planeState = planeState;
    }
    /**
     * <code>contains</code> tests a bounding volume against the planes of the
     * camera's frustum. The frustums planes are set such that the normals all
     * face in towards the viewable scene. Therefore, if the bounding volume is
     * on the negative side of the plane is can be culled out.
     *
     * NOTE: This method is used internally for culling, for public usage,
     * the plane state of the bounding volume must be saved and restored, e.g:
     * <code>BoundingVolume bv;<br/>
     * Camera c;<br/>
     * int planeState = bv.getPlaneState();<br/>
     * bv.setPlaneState(0);<br/>
     * c.contains(bv);<br/>
     * bv.setPlaneState(plateState);<br/>
     * </code>
     *
     * @param bound the bound to check for culling
     * @return See enums in <code>FrustumIntersect</code>
     * 
     * 
     * This method should moved to Fustrum class for sure
     * 
     * External calls: 3 packages{scence, shadow, jme3tools.optimize}, class Spatial, Shadowutil, FastOctNode,OctNode
     * 
     * The code is purly frustrum code, so no problem with camera! but BoundingVolume is used, should it be in both classes or only in fustrum?
     * 
     * 
     * 
     */
    public FrustumIntersect contains(BoundingVolume bound) {
        if (bound == null) {
            return FrustumIntersect.Inside;
        }

        int mask;
        FrustumIntersect rVal = FrustumIntersect.Inside;

        for (int planeCounter = FRUSTUM_PLANES; planeCounter >= 0; planeCounter--) {
            if (planeCounter == bound.getCheckPlane()) {
                continue; // we have already checked this plane at first iteration
            }
            int planeId = (planeCounter == FRUSTUM_PLANES) ? bound.getCheckPlane() : planeCounter;
//            int planeId = planeCounter;

            mask = 1 << (planeId);
            if ((getPlaneState()/*planeState*/ & mask) == 0) {
                Plane.Side side = bound.whichSide(worldPlane[planeId]);

                if (side == Plane.Side.Negative) {
                    //object is outside of frustum
                    bound.setCheckPlane(planeId);
                    return FrustumIntersect.Outside;
                } else if (side == Plane.Side.Positive) {
                    //object is visible on *this* plane, so mark this plane
                    //so that we don't check it for sub nodes.
                	setPlaneState(mask);
                } else {
                    rVal = FrustumIntersect.Intersects;
                }
            }
        }

        return rVal;
    }
public void onFrustrumChange(boolean isParallelProjection)
{
	if (!isParallelProjection) {
        float nearSquared = frustumNear * frustumNear;
        float leftSquared = frustumLeft * frustumLeft;
        float rightSquared = frustumRight * frustumRight;
        float bottomSquared = frustumBottom * frustumBottom;
        float topSquared = frustumTop * frustumTop;

        float inverseLength = FastMath.invSqrt(nearSquared + leftSquared);
        coeffLeft[0] = -frustumNear * inverseLength;
        coeffLeft[1] = -frustumLeft * inverseLength;

        inverseLength = FastMath.invSqrt(nearSquared + rightSquared);
        coeffRight[0] = frustumNear * inverseLength;
        coeffRight[1] = frustumRight * inverseLength;

        inverseLength = FastMath.invSqrt(nearSquared + bottomSquared);
        coeffBottom[0] = frustumNear * inverseLength;
        coeffBottom[1] = -frustumBottom * inverseLength;

        inverseLength = FastMath.invSqrt(nearSquared + topSquared);
        coeffTop[0] = -frustumNear * inverseLength;
        coeffTop[1] = frustumTop * inverseLength;
    } else {
        coeffLeft[0] = 1;
        coeffLeft[1] = 0;

        coeffRight[0] = -1;
        coeffRight[1] = 0;

        coeffBottom[0] = 1;
        coeffBottom[1] = 0;

        coeffTop[0] = -1;
        coeffTop[1] = 0;
    }
    
    
    //Camera code
 //   camuse.getProjectionMatrix().fromFrustum(frustumNear, frustumFar, frustumLeft, frustumRight, frustumTop, frustumBottom, camuse.isParallelProjection());
//    projectionMatrix.transposeLocal();

    // The frame is effected by the frustum values
    // update it as well

}
/*
 public void onFrameChangeFrustrum()
 {
	 
	 TempVars vars = TempVars.get();
     Vector3f left = camuse.getLeft(vars.vect1);
     Vector3f direction = camuse.getDirection(vars.vect2);
     Vector3f up = camuse.getUp(vars.vect3);

     float dirDotLocation = direction.dot(camuse.getLocation());
	// left plane
     Vector3f leftPlaneNormal = camuse.worldPlane[LEFT_PLANE].getNormal();
     leftPlaneNormal.x = left.x * coeffLeft[0];
     leftPlaneNormal.y = left.y * coeffLeft[0];
     leftPlaneNormal.z = left.z * coeffLeft[0];
     leftPlaneNormal.addLocal(direction.x * coeffLeft[1], direction.y
             * coeffLeft[1], direction.z * coeffLeft[1]);
     camuse.worldPlane[LEFT_PLANE].setConstant(camuse.getLocation().dot(leftPlaneNormal));

     // right plane
     Vector3f rightPlaneNormal = camuse.worldPlane[RIGHT_PLANE].getNormal();
     rightPlaneNormal.x = left.x * coeffRight[0];
     rightPlaneNormal.y = left.y * coeffRight[0];
     rightPlaneNormal.z = left.z * coeffRight[0];
     rightPlaneNormal.addLocal(direction.x * coeffRight[1], direction.y
             * coeffRight[1], direction.z * coeffRight[1]);
     camuse.worldPlane[RIGHT_PLANE].setConstant(camuse.getLocation().dot(rightPlaneNormal));

     // bottom plane
     Vector3f bottomPlaneNormal = camuse.worldPlane[BOTTOM_PLANE].getNormal();
     bottomPlaneNormal.x = up.x * coeffBottom[0];
     bottomPlaneNormal.y = up.y * coeffBottom[0];
     bottomPlaneNormal.z = up.z * coeffBottom[0];
     bottomPlaneNormal.addLocal(direction.x * coeffBottom[1], direction.y
             * coeffBottom[1], direction.z * coeffBottom[1]);
     camuse.worldPlane[BOTTOM_PLANE].setConstant(camuse.getLocation().dot(bottomPlaneNormal));

     // top plane
     Vector3f topPlaneNormal = camuse.worldPlane[TOP_PLANE].getNormal();
     topPlaneNormal.x = up.x * coeffTop[0];
     topPlaneNormal.y = up.y * coeffTop[0];
     topPlaneNormal.z = up.z * coeffTop[0];
     topPlaneNormal.addLocal(direction.x * coeffTop[1], direction.y
             * coeffTop[1], direction.z * coeffTop[1]);
     camuse.worldPlane[TOP_PLANE].setConstant(camuse.getLocation().dot(topPlaneNormal));

     
     //condition: camera code, code inside: fustrum code 
     
     if (camuse.isParallelProjection()) {
         camuse.worldPlane[LEFT_PLANE].setConstant(camuse.worldPlane[LEFT_PLANE].getConstant() + frustumLeft);
         camuse.worldPlane[RIGHT_PLANE].setConstant(camuse.worldPlane[RIGHT_PLANE].getConstant() - frustumRight);
         camuse.worldPlane[TOP_PLANE].setConstant(camuse.worldPlane[TOP_PLANE].getConstant() - frustumTop);
         camuse.worldPlane[BOTTOM_PLANE].setConstant(camuse.worldPlane[BOTTOM_PLANE].getConstant() + frustumBottom);
     }

     // far plane
     camuse.worldPlane[FAR_PLANE].setNormal(left);
     camuse.worldPlane[FAR_PLANE].setNormal(-direction.x, -direction.y, -direction.z);
     camuse.worldPlane[FAR_PLANE].setConstant(-(dirDotLocation + frustumFar));

     // near plane
     camuse.worldPlane[getNearPlane()].setNormal(direction.x, direction.y, direction.z);
     camuse.worldPlane[getNearPlane()].setConstant(dirDotLocation + frustumNear);
     camuse.getViewMatrix().fromFrame(camuse.getLocation(), direction, up, left);
    
     vars.release();

 }
*/
}
