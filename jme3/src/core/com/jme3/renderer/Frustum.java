/**
 * 
 */
package com.jme3.renderer;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.jme3.bounding.BoundingBox;
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
    private BoundingBox guiBounding = new BoundingBox();
   
    public BoundingBox getGuiBounding() {
		return guiBounding;
	}
	public void setGuiBounding(BoundingBox guiBounding) {
		this.guiBounding = guiBounding;
	}


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
	
   
    
    //the construcotr as per constructor public Camera(int width, int height) in camera class
    // can this be placed in the method?
	
    
    /**
     * Default constructor
     * 
     */
    public Frustum()
	{
    	initPlanes();
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
	
	private void initPlanes(){
		 worldPlane = new Plane[getMaxWorldPlanes()];
	     for (int i = 0; i < getMaxWorldPlanes(); i++) {
	           worldPlane[i] = new Plane();
	      }
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	//	try
	//	{
		//Frustum frustum = (Frustum) Object.clone();
		Frustum frustum = new Frustum();
		frustum.setPlaneState(0);
        frustum.worldPlane = new Plane[getMaxWorldPlanes()];
        for (int i = 0; i < this.getWorldPlane().length; i++) {
          
         	frustum.worldPlane[i] = this.worldPlane[i].clone();
            }
 
            //Float[] was changed to float[] !
            frustum.setPlaneState(this.getPlaneState());
            try {
				frustum.setCoeffLeft(new float[2]); // = new float[2]; //to keep things in tact
            frustum.setCoeffRight(new float[2]); //to keep things in tact
            frustum.setCoeffBottom(new float[2]); // to keep things in tact
            frustum.setCoeffTop(new float[2]); // to kepp things in tact
            } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            frustum.setGuiBounding((BoundingBox) this.getGuiBounding().clone());
		return frustum;
	//	}
	//	catch (CloneNotSupportedException ex) {
     //       throw new AssertionError();
      //  }

	}
	/**
     * <code>containsGui</code> tests a bounding volume against the ortho
     * bounding box of the camera. A bounding box spanning from
     * 0, 0 to Width, Height. Constrained by the viewport settings on the
     * camera.
     *
     * @param bound the bound to check for culling
     * @return True if the camera contains the gui element bounding volume.
     * 
     * External call in checkCulling(Camera) in Spatial
     * 
     * This fells that this method belongs more to Fustrum
     * 
     */
    public boolean containsGui(BoundingVolume bound) {
        return guiBounding.intersects(bound);
    }
    
    /**
     * Only used in the above method, no problem when moving this method
     * 
     * no camera code
     */
    public void setGuiBounding(int width,int height) {  //need to make it to private later
        float sx = width * getViewPortLeft();
        float ex = width * getViewPortRight();
        float sy = height * getViewPortBottom();
        float ey = height * getViewPortTop();
        float xExtent = Math.max(0f, (ex - sx) / 2f);
        float yExtent = Math.max(0f, (ey - sy) / 2f);
        guiBounding.setCenter(new Vector3f(sx + xExtent, sy + yExtent, 0));
        guiBounding.setXExtent(xExtent);
        guiBounding.setYExtent(yExtent);
        guiBounding.setZExtent(Float.MAX_VALUE);
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
     * This internal method is used to see whether a valid index
     * is provided to the different coeff arrays
     * @param index
     */
    private void checkIndexOutOfBoundsCoeff(int index){
    	if(index < 0 || index > 1)
    		throw new java.lang.ArrayIndexOutOfBoundsException("The index value 0 or 1 is only accepted");
    	
    }
  
    /**
     * 
     * @return
     */
    public  int getMaxWorldPlanes() {
		return MAX_WORLD_PLANES;
	}
    public void setCoeffLeftAssignValue(int index,float value){
    	checkIndexOutOfBoundsCoeff(index);
    	this.coeffLeft[index] = value;
    }
    public void setCoeffRightAssignValue(int index,float value){
    	checkIndexOutOfBoundsCoeff(index);
    	this.coeffRight[index] = value;
    }
    public void setCoeffBottomAssignValue(int index,float value){
    	checkIndexOutOfBoundsCoeff(index);
 	   this.coeffBottom[index] = value;
    }    
    public void setCoeffTopAssignValue(int index,float value){
    	
    	checkIndexOutOfBoundsCoeff(index);
	 	this.coeffTop[index] = value;
	}    
	public float[] getCoeffLeft() {
		
		return coeffLeft;
	}
	/**
	 * This method is use to validate the the array length to see
	 * whether it meets the requirements of a coeff array
	 * @param floats provided float array
	 * @throws Exception if the length is less or more than 2
	 */
	private void checkCoeffSize(float[] floats) throws Exception{
		
		if(floats.length != 2)
			throw new Exception("The minimum length is 2");
	}
	
	/**
	 * @param floats the coeffLeft to set
	 * @throws Exception 
	 */
	public void setCoeffLeft(float[] floats) throws Exception {
		checkCoeffSize(floats);
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
	 * @throws Exception 
	 */
	public void setCoeffRight(float[] floats) throws Exception {
		checkCoeffSize(floats);
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
	 * @throws Exception 
	 */
	public void setCoeffBottom(float[] coeffBottom) throws Exception {
		checkCoeffSize(coeffBottom);
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
	 * @throws Exception 
	 */
	public void setCoeffTop(float[] coeffTop) throws Exception {
		checkCoeffSize(coeffTop);
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
}

}
