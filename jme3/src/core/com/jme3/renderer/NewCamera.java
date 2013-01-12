/**
 * 
 */
package com.jme3.renderer;

import com.jme3.math.Matrix4f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Frustum.Planes;
import com.jme3.util.TempVars;

/**
 * @author Joseph
 *
 */
public class NewCamera {
	
    /**
     * Camera's location
     */
    protected Vector3f location;
    /**
     * The orientation of the 
     */
    protected Quaternion rotation;
	
    protected Matrix4f projectionMatrixOverride;
    protected Matrix4f viewMatrix = new Matrix4f();
    protected Matrix4f projectionMatrix = new Matrix4f();
    protected Matrix4f viewProjectionMatrix = new Matrix4f();
    
    
	
	public NewCamera(){
		
	    this.location = new Vector3f();
        this.rotation = new Quaternion();
		
		
		
	}

	/**
	 * @return the location
	 */
	public Vector3f getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Vector3f location) {
		this.location = location;
	}



	/**
	 * @return the rotation
	 */
	public Quaternion getRotation() {
		return rotation;
	}



	/**
	 * @param rotation the rotation to set
	 */
	public void setRotation(Quaternion rotation) {
		this.rotation = rotation;
	}



	/**
	 * @return the projectionMatrixOverride
	 */
	public Matrix4f getProjectionMatrixOverride() {
		return projectionMatrixOverride;
	}



	/**
	 * @param projectionMatrixOverride the projectionMatrixOverride to set
	 */
	public void setProjectionMatrixOverride(Matrix4f projectionMatrixOverride) {
		this.projectionMatrixOverride = projectionMatrixOverride;
	}



	/**
	 * @return the viewMatrix
	 */
	public Matrix4f getViewMatrix() {
		return viewMatrix;
	}



	/**
	 * @param viewMatrix the viewMatrix to set
	 */
	public void setViewMatrix(Matrix4f viewMatrix) {
		this.viewMatrix = viewMatrix;
	}



	/**
	 * @return the projectionMatrix
	 */
/*	public Matrix4f getProjectionMatrix() {
		return projectionMatrix;
	}*/



	/**
	 * @param projectionMatrix the projectionMatrix to set
	 */
	/*public void setProjectionMatrix(Matrix4f projectionMatrix) {
		this.projectionMatrix = projectionMatrix;
	}*/



	/**
	 * @return the viewProjectionMatrix
	 */
	public Matrix4f getViewProjectionMatrix() {
		return viewProjectionMatrix;
	}



	/**
	 * @param viewProjectionMatrix the viewProjectionMatrix to set
	 */
	public void setViewProjectionMatrix(Matrix4f viewProjectionMatrix) {
		this.viewProjectionMatrix = viewProjectionMatrix;
	}
	
	
	 /**
     * <code>getDirection</code> retrieves the direction vector the camera is
     * facing.
     *
     * @return the direction the camera is facing.
     * @see Camera#getDirection()
     * 
     * 
     * could be moved
     * 
     */
    public Vector3f getDirection() {
        return this.rotation.getRotationColumn(2);
    }
    /**
     * <code>getLeft</code> retrieves the left axis of the 
     *
     * @return the left axis of the 
     * @see Camera#getLeft()
     * 
     * could be moved
     * 
     */
    public Vector3f getLeft() {
        return rotation.getRotationColumn(0);
    }
    /**
     * <code>getUp</code> retrieves the up axis of the 
     *
     * @return the up axis of the 
     * @see Camera#getUp()
     *
     *
     *could be moved
     */
    public Vector3f getUp() {
        return rotation.getRotationColumn(1);
    }
	
    
    /**
     * <code>getDirection</code> retrieves the direction vector the camera is
     * facing.
     *
     * @return the direction the camera is facing.
     * @see Camera#getDirection()
     * 
     * 
     * 
     * could be moved
     * 
     */
    public Vector3f getDirection(Vector3f store) {
        return rotation.getRotationColumn(2, store);
    }
    /**
     * <code>getLeft</code> retrieves the left axis of the 
     *
     * @return the left axis of the 
     * @see Camera#getLeft()
     * 
     * 
     * 
     * could be moved
     * 
     */
    public Vector3f getLeft(Vector3f store) {
        return rotation.getRotationColumn(0, store);
    }
    /**
     * <code>getUp</code> retrieves the up axis of the 
     *
     * @return the up axis of the 
     * @see Camera#getUp()
     * 
     * 
     * 
     * could be moved
     * 
     */
    public Vector3f getUp(Vector3f store) {
        return rotation.getRotationColumn(1, store);
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
    	this.rotation.lookAt(direction, up);
    }
    /**
     * <code>setAxes</code> sets the axes (left, up and direction) for this
     * 
     *
     * @param left      the left axis of the 
     * @param up        the up axis of the 
     * @param direction the direction the camera is facing.
     * 
     * @see Camera#setAxes(com.jme3.math.Quaternion) 
     * 
     * 
     * Depends
     * 
     */
    public void setAxes(Vector3f left, Vector3f up, Vector3f direction) {
       this.rotation.fromAxes(left, up, direction);
    
    }
    /**
     * <code>setAxes</code> uses a rotational matrix to set the axes of the
     * 
     *
     * @param axes the matrix that defines the orientation of the 
     * 
     * 
     * Depends
     * 
     */
    public void setAxes(Quaternion axes) {
       this.rotation.set(axes);
       
    }
    /**
     * normalize normalizes the camera vectors.
     * 
     * 
     * Depends
     * 
     */
    public void normalize() {
        this.rotation.normalizeLocal();
   
    }
    /**
     * Overrides the projection matrix used by the  Will
     * use the matrix for computing the view projection matrix as well.
     * Use null argument to return to normal functionality.
     *
     *
     * Camera related
     *
     * @param projMatrix
     */
    public void setProjectionMatrix(Matrix4f projMatrix) {
        projectionMatrixOverride = projMatrix;
        updateViewProjection();
    }
    /**
     * Updates the view projection matrix.
     * 
     * Camera related
     * 
     */
    public void updateViewProjection() {
        if (projectionMatrixOverride != null) {
            viewProjectionMatrix.set(projectionMatrixOverride).multLocal(viewMatrix);
        } else {
            //viewProjectionMatrix.set(viewMatrix).multLocal(projectionMatrix);
            viewProjectionMatrix.set(projectionMatrix).multLocal(viewMatrix);
        }
    }
    /**
     * @return the projection matrix of the 
     * The view projection matrix  transforms eye space into clip space.
     * This matrix is usually defined by the viewport and perspective settings
     * of the 
     * 
     * 
     * Camera related
     * 
     * 
     */
    public Matrix4f getProjectionMatrix() {
        if (projectionMatrixOverride != null) {
            return projectionMatrixOverride;
        }

        return projectionMatrix;
    }
	

    
    public void onFrameChange(Frustum frustum, boolean isParallelProjection){
    	

    	//camera code
        TempVars vars = TempVars.get();
        Vector3f left = getLeft(vars.vect1);
        Vector3f direction = getDirection(vars.vect2);
        Vector3f up = getUp(vars.vect3);

        float dirDotLocation = direction.dot(this.getLocation());

        //fustrum code
                
        // left plane
        Vector3f leftPlaneNormal = frustum.getWorldPlane()[Planes.LEFT_PLANE.getPlaneValue()].getNormal();
        leftPlaneNormal.x = left.x * frustum.getCoeffLeft()[0];
        leftPlaneNormal.y = left.y * frustum.getCoeffLeft()[0];
        leftPlaneNormal.z = left.z * frustum.getCoeffLeft()[0];
        leftPlaneNormal.addLocal(direction.x * frustum.getCoeffLeft()[1], direction.y
                * frustum.getCoeffLeft()[1], direction.z * frustum.getCoeffLeft()[1]);
        frustum.getWorldPlane()[Planes.LEFT_PLANE.getPlaneValue()].setConstant(this.getLocation().dot(leftPlaneNormal));

        // right plane
        Vector3f rightPlaneNormal = frustum.getWorldPlane()[Planes.RIGHT_PLANE.getPlaneValue()].getNormal();
        rightPlaneNormal.x = left.x * frustum.getCoeffRight()[0];
        rightPlaneNormal.y = left.y * frustum.getCoeffRight()[0];
        rightPlaneNormal.z = left.z * frustum.getCoeffRight()[0];
        rightPlaneNormal.addLocal(direction.x * frustum.getCoeffRight()[1], direction.y
                * frustum.getCoeffRight()[1], direction.z * frustum.getCoeffRight()[1]);
        frustum.getWorldPlane()[Planes.RIGHT_PLANE.getPlaneValue()].setConstant(this.getLocation().dot(rightPlaneNormal));

        // bottom plane
        Vector3f bottomPlaneNormal = frustum.getWorldPlane()[Planes.BOTTOM_PLANE.getPlaneValue()].getNormal();
        bottomPlaneNormal.x = up.x * frustum.getCoeffBottom()[0];
        bottomPlaneNormal.y = up.y * frustum.getCoeffBottom()[0];
        bottomPlaneNormal.z = up.z * frustum.getCoeffBottom()[0];
        bottomPlaneNormal.addLocal(direction.x * frustum.getCoeffBottom()[1], direction.y
                * frustum.getCoeffBottom()[1], direction.z * frustum.getCoeffBottom()[1]);
        frustum.getWorldPlane()[Planes.BOTTOM_PLANE.getPlaneValue()].setConstant(this.getLocation().dot(bottomPlaneNormal));

        // top plane
        Vector3f topPlaneNormal = frustum.getWorldPlane()[Planes.TOP_PLANE.getPlaneValue()].getNormal();
        topPlaneNormal.x = up.x * frustum.getCoeffTop()[0];
        topPlaneNormal.y = up.y * frustum.getCoeffTop()[0];
        topPlaneNormal.z = up.z * frustum.getCoeffTop()[0];
        topPlaneNormal.addLocal(direction.x * frustum.getCoeffTop()[1], direction.y
                * frustum.getCoeffTop()[1], direction.z * frustum.getCoeffTop()[1]);
        frustum.getWorldPlane()[Planes.TOP_PLANE.getPlaneValue()].setConstant(this.getLocation().dot(topPlaneNormal));

        
        //condition: camera code, code inside: fustrum code 
        
        if (isParallelProjection) {
        	frustum.getWorldPlane()[Planes.LEFT_PLANE.getPlaneValue()].setConstant(frustum.getWorldPlane()[Planes.LEFT_PLANE.getPlaneValue()].getConstant() + frustum.getFrustumLeft());
        	frustum.getWorldPlane()[Planes.RIGHT_PLANE.getPlaneValue()].setConstant(frustum.getWorldPlane()[Planes.RIGHT_PLANE.getPlaneValue()].getConstant() - frustum.getFrustumRight());
        	frustum.getWorldPlane()[Planes.TOP_PLANE.getPlaneValue()].setConstant(frustum.getWorldPlane()[Planes.TOP_PLANE.getPlaneValue()].getConstant() - frustum.getFrustumTop());
        	frustum.getWorldPlane()[Planes.BOTTOM_PLANE.getPlaneValue()].setConstant(frustum.getWorldPlane()[Planes.BOTTOM_PLANE.getPlaneValue()].getConstant() + frustum.getFrustumBottom());
        }

        // far plane
        frustum.getWorldPlane()[Planes.FAR_PLANE.getPlaneValue()].setNormal(left);
        frustum.getWorldPlane()[Planes.FAR_PLANE.getPlaneValue()].setNormal(-direction.x, -direction.y, -direction.z);
        frustum.getWorldPlane()[Planes.FAR_PLANE.getPlaneValue()].setConstant(-(dirDotLocation + frustum.getFrustumFar()));

        // near plane
        frustum.getWorldPlane()[Planes.NEAR_PLANE.getPlaneValue()].setNormal(direction.x, direction.y, direction.z);
        frustum.getWorldPlane()[Planes.NEAR_PLANE.getPlaneValue()].setConstant(dirDotLocation + frustum.getFrustumNear());  
        
        //camera code
        //moving to frustrum 
     //  viewMatrix.fromFrame(location, direction, up, left);
        this.getViewMatrix().fromFrame(this.getLocation(), direction, up, left);
        vars.release();
        this.getViewMatrix().transposeLocal();
           //frustum.onFrameChangeFrustrum();
        updateViewProjection();
    }
	
	

}
