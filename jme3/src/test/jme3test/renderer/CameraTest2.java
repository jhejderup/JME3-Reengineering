/*package jme3test.renderer;

import static org.junit.Assert.*;

import org.junit.Test;


import org.easymock.EasyMock;
import org.junit.*;
import com.jme3.bounding.BoundingBox;
import com.jme3.bounding.BoundingSphere;
import com.jme3.bounding.BoundingVolume;
import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.math.Matrix4f;
import com.jme3.math.Plane;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;


import com.jme3.renderer.Camera;
*//**
 * Unit tests for the Camera class
 * @author Joseph
 *
 *//*
public class CameraTest2 {
	
	
	
	
	
	
	

	//////////////   CONSTRUCTOR TESTS
	
	*//**
	 * This test will run on the default constructor for Camera class. Even though
	 * this is only intended for serialization and no other cases, we still need
	 * test this. This 
	 * @throws Exception
	 *//*
	@Test
	public void testCamera_serializeconstructor(){
		
		Camera result = new Camera();

		//the object should not be null
		assertNotNull(result);
		//no name should be  set
		assertEquals(null, result.getName());
		//no location should be set
		assertEquals(null, result.getLocation());
		//no width and height should be set
		assertEquals(0, result.getHeight());
		assertEquals(0, result.getWidth());
		//Using double here: 1.0f is defined as the maximim delta between actual value and the expected value to
		//be considred as equal for all related cases here
		assertEquals(0.0f, result.getFrustumBottom(), 1.0f);
		assertEquals(0.0f, result.getFrustumFar(), 1.0f);
		assertEquals(0.0f, result.getFrustumLeft(), 1.0f);
		assertEquals(0.0f, result.getFrustumNear(), 1.0f);
		assertEquals(0.0f, result.getFrustumRight(), 1.0f);
		assertEquals(0.0f, result.getFrustumTop(), 1.0f);
		//rotation object should be null
		assertEquals(null, result.getRotation());
		
		assertEquals(0, result.getPlaneState());
		assertEquals(0.0f, result.getViewPortLeft(), 1.0f);
		assertEquals(0.0f, result.getViewPortRight(), 1.0f);
		assertEquals(0.0f, result.getViewPortTop(), 1.0f);
		assertEquals(0.0f, result.getViewPortBottom(), 1.0f);
		//those should be set to true
		assertEquals(true, result.isViewportChanged());
		assertEquals(true, result.isParallelProjection());
	}
	*//**
	 * Test constructor with size and width with zero as value
	 *//*
	@Test
	public void testCameraIntInt_size_0() {
		int width = 0;
		int height = 0;

		Camera result = new Camera(width, height);

	
		assertNotNull(result);
		assertEquals("Camera[location=(0.0, 0.0, 0.0)\n, direction=(0.0, 0.0, 1.0)\nres=0x0, parallel=true\nnear=1.0, far=2.0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getHeight());
		assertEquals(0, result.getWidth());
		assertEquals(-0.5f, result.getFrustumBottom(), 1.0f);
		assertEquals(2.0f, result.getFrustumFar(), 1.0f);
		assertEquals(-0.5f, result.getFrustumLeft(), 1.0f);
		assertEquals(1.0f, result.getFrustumNear(), 1.0f);
		assertEquals(0.5f, result.getFrustumRight(), 1.0f);
		assertEquals(0.5f, result.getFrustumTop(), 1.0f);
		assertEquals(0, result.getPlaneState());
		assertEquals(0.0f, result.getViewPortLeft(), 1.0f);
		assertEquals(1.0f, result.getViewPortRight(), 1.0f);
		assertEquals(1.0f, result.getViewPortTop(), 1.0f);
		assertEquals(0.0f, result.getViewPortBottom(), 1.0f);
		assertEquals(true, result.isViewportChanged());
		assertEquals(true, result.isParallelProjection());
	}
	*//**
	 * Test constructor specifying the width as 75 and height as 100
	 *//*
	@Test
	public void testCameraIntInt_size_1() {
		int width = 75;
		int height = 100;

		Camera result = new Camera(width, height);

	
		assertNotNull(result);
		assertEquals("Camera[location=(0.0, 0.0, 0.0)\n, direction=(0.0, 0.0, 1.0)\nres=75x100, parallel=true\nnear=1.0, far=2.0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(100, result.getHeight());
		assertEquals(75, result.getWidth());
		assertEquals(-0.5f, result.getFrustumBottom(), 1.0f);
		assertEquals(2.0f, result.getFrustumFar(), 1.0f);
		assertEquals(-0.5f, result.getFrustumLeft(), 1.0f);
		assertEquals(1.0f, result.getFrustumNear(), 1.0f);
		assertEquals(0.5f, result.getFrustumRight(), 1.0f);
		assertEquals(0.5f, result.getFrustumTop(), 1.0f);
		assertEquals(0, result.getPlaneState());
		assertEquals(0.0f, result.getViewPortLeft(), 1.0f);
		assertEquals(1.0f, result.getViewPortRight(), 1.0f);
		assertEquals(1.0f, result.getViewPortTop(), 1.0f);
		assertEquals(0.0f, result.getViewPortBottom(), 1.0f);
		assertEquals(true, result.isViewportChanged());
		assertEquals(true, result.isParallelProjection());
	
	}
	*//**
	 * Test constructor specifying the width as 100 and height as 75
	 *//*
	@Test
	public void testCameraIntInt_size_2() {
		int width = 100;
		int height = 75;

		Camera result = new Camera(width, height);

	
		assertNotNull(result);
		assertEquals("Camera[location=(0.0, 0.0, 0.0)\n, direction=(0.0, 0.0, 1.0)\nres=100x75, parallel=true\nnear=1.0, far=2.0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(75, result.getHeight());
		assertEquals(100, result.getWidth());
		assertEquals(-0.5f, result.getFrustumBottom(), 1.0f);
		assertEquals(2.0f, result.getFrustumFar(), 1.0f);
		assertEquals(-0.5f, result.getFrustumLeft(), 1.0f);
		assertEquals(1.0f, result.getFrustumNear(), 1.0f);
		assertEquals(0.5f, result.getFrustumRight(), 1.0f);
		assertEquals(0.5f, result.getFrustumTop(), 1.0f);
		assertEquals(0, result.getPlaneState());
		assertEquals(0.0f, result.getViewPortLeft(), 1.0f);
		assertEquals(1.0f, result.getViewPortRight(), 1.0f);
		assertEquals(1.0f, result.getViewPortTop(), 1.0f);
		assertEquals(0.0f, result.getViewPortBottom(), 1.0f);
		assertEquals(true, result.isViewportChanged());
		assertEquals(true, result.isParallelProjection());
	
	}
	*//**
	 * Test constructor with size and width which has negative value. This should not work
	 * and this should not be allowed!
	 *//*
	@Test
	public void testCameraIntInt_size_3() {
		int width = -100;
		int height = -75;

		Camera result = new Camera(width, height);

		assertNotNull(result);
		assertEquals("Camera[location=(0.0, 0.0, 0.0)\n, direction=(0.0, 0.0, 1.0)\nres=-100x-75, parallel=true\nnear=1.0, far=2.0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(-75, result.getHeight());
		assertEquals(-100, result.getWidth());
		assertEquals(-0.5f, result.getFrustumBottom(), 1.0f);
		assertEquals(2.0f, result.getFrustumFar(), 1.0f);
		assertEquals(-0.5f, result.getFrustumLeft(), 1.0f);
		assertEquals(1.0f, result.getFrustumNear(), 1.0f);
		assertEquals(0.5f, result.getFrustumRight(), 1.0f);
		assertEquals(0.5f, result.getFrustumTop(), 1.0f);
		assertEquals(0, result.getPlaneState());
		assertEquals(0.0f, result.getViewPortLeft(), 1.0f);
		assertEquals(1.0f, result.getViewPortRight(), 1.0f);
		assertEquals(1.0f, result.getViewPortTop(), 1.0f);
		assertEquals(0.0f, result.getViewPortBottom(), 1.0f);
		assertEquals(true, result.isViewportChanged());
		assertEquals(true, result.isParallelProjection());
	
	}
	
	
	
	
	
	///////////////// CLONE TESTS
	
	@Test
	public void testClone() {
		
		
		
		
	}
	
	
	@Test
	public void testCopyFrom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetClipPlanePlaneSide() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetClipPlanePlane() {
		fail("Not yet implemented");
	}

	@Test
	public void testResize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrustumBottom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumBottom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrustumFar() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumFar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrustumLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrustumNear() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumNear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrustumRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrustumTop() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumTop() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRotation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDirection() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDirectionVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeftVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUpVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRotation() {
		fail("Not yet implemented");
	}

	@Test
	public void testLookAtDirection() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAxesVector3fVector3fVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAxesQuaternion() {
		fail("Not yet implemented");
	}

	@Test
	public void testNormalize() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustum() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrustumPerspective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrameVector3fVector3fVector3fVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testLookAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrameVector3fQuaternion() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPlaneState() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPlaneState() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewPortLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetViewPortLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewPortRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetViewPortRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewPortTop() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetViewPortTop() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewPortBottom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetViewPortBottom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetViewPort() {
		fail("Not yet implemented");
	}

	@Test
	public void testDistanceToNearPlane() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsGui() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewMatrix() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProjectionMatrix() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProjectionMatrix() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateViewProjection() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewProjectionMatrix() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsViewportChanged() {
		fail("Not yet implemented");
	}

	@Test
	public void testClearViewportChanged() {
		fail("Not yet implemented");
	}

	@Test
	public void testOnViewPortChange() {
		fail("Not yet implemented");
	}

	@Test
	public void testOnFrustumChange() {
		fail("Not yet implemented");
	}

	@Test
	public void testOnFrameChange() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsParallelProjection() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetParallelProjection() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetViewToProjectionZ() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWorldCoordinatesVector2fFloat() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWorldCoordinatesVector2fFloatVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetScreenCoordinatesVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetScreenCoordinatesVector3fVector3f() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWidth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testWrite() {
		fail("Not yet implemented");
	}

	@Test
	public void testRead() {
		fail("Not yet implemented");
	}

}
*/