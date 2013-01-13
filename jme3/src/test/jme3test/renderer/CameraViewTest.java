package jme3test.renderer;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;

import com.jme3.export.InputCapsule;
import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.export.OutputCapsule;
import com.jme3.math.Plane;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.jme3.renderer.CameraView;
import com.jme3.renderer.Frustum;

/**
 * The class <code>CameraViewTest</code> contains tests for the class <code>{@link CameraView}</code>.
 *
 * @generatedBy CodePro at 2013-01-13 19:34
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class CameraViewTest {
	/**
	 * Run the CameraView() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCameraView_1()
		throws Exception {

		CameraView result = new CameraView();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(0, result.getHeight());
		assertEquals(0, result.getWidth());
		assertEquals(null, result.getCamera());
		assertEquals(true, result.isViewportChanged());
		assertEquals(true, result.isParallelProjection());
	}

	/**
	 * Run the void clearViewportChanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testClearViewportChanged_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		

		fixture.clearViewportChanged();

		// add additional test code here
	}

	/**
	 * Run the CameraView clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testClone_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		CameraView result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.AssertionError
		//       at com.jme3.renderer.Frustum.clone(Frustum.java:272)
		//       at com.jme3.renderer.CameraView.clone(CameraView.java:153)
		assertNotNull(result);
	}

	/**
	 * Run the CameraView clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testClone_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		CameraView result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.AssertionError
		//       at com.jme3.renderer.Frustum.clone(Frustum.java:272)
		//       at com.jme3.renderer.CameraView.clone(CameraView.java:153)
		assertNotNull(result);
	}

	/**
	 * Run the CameraView clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testClone_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		CameraView result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CameraView clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testClone_4()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		CameraView result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void copyFrom(CameraView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCopyFrom_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		CameraView cam = new CameraView(1, 1);
		cam.setCamera(new Camera());
		cam.setName("");
		cam.setParallelProjection(true);
		cam.setFrustum(new Frustum());
		cam.updateViewPortChange();

		fixture.copyFrom(cam);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.copyFrom(CameraView.java:196)
	}

	/**
	 * Run the void copyFrom(CameraView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCopyFrom_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		CameraView cam = new CameraView(1, 1);
		cam.setCamera(new Camera());
		cam.setName("");
		cam.setParallelProjection(true);
		cam.setFrustum(new Frustum());
		cam.updateViewPortChange();

		fixture.copyFrom(cam);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.copyFrom(CameraView.java:196)
	}

	/**
	 * Run the void copyFrom(CameraView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCopyFrom_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		CameraView cam = new CameraView(1, 1);
		cam.setCamera(new Camera());
		cam.setName("");
		cam.setParallelProjection(true);
		cam.setFrustum(new Frustum());
		cam.updateViewPortChange();

		fixture.copyFrom(cam);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.copyFrom(CameraView.java:196)
	}

	/**
	 * Run the void copyFrom(CameraView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCopyFrom_4()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		CameraView cam = new CameraView(1, 1);
		cam.setCamera(new Camera());
		cam.setName("");
		cam.setParallelProjection(true);
		cam.setFrustum(new Frustum());
		cam.updateViewPortChange();

		fixture.copyFrom(cam);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.copyFrom(CameraView.java:196)
	}

	/**
	 * Run the void copyFrom(CameraView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCopyFrom_5()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		CameraView cam = new CameraView(1, 1);
		cam.setCamera(new Camera());
		cam.setName("");
		cam.setParallelProjection(true);
		cam.setFrustum(new Frustum());
		cam.updateViewPortChange();

		fixture.copyFrom(cam);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.copyFrom(CameraView.java:196)
	}

	/**
	 * Run the void copyFrom(CameraView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testCopyFrom_6()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		CameraView cam = new CameraView(1, 1);
		cam.setCamera(new Camera());
		cam.setName("");
		cam.setParallelProjection(true);
		cam.setFrustum(new Frustum());
		cam.updateViewPortChange();

		fixture.copyFrom(cam);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.copyFrom(CameraView.java:196)
	}

	/**
	 * Run the Camera getCamera() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetCamera_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		Camera result = fixture.getCamera();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getProjectionMatrixOverride());
	}

	/**
	 * Run the Frustum getFrustum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetFrustum_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		Frustum result = fixture.getFrustum();

		
		assertNotNull(result);
		assertEquals(0.0f, result.getViewPortLeft(), 0.1f);
		assertEquals(1.0f, result.getViewPortRight(), 0.1f);
		assertEquals(0.0f, result.getViewPortBottom(), 0.1f);
		assertEquals(1.0f, result.getViewPortTop(), 0.1f);
		assertEquals(-0.5f, result.getFrustumBottom(), 0.1f);
		assertEquals(2.0f, result.getFrustumFar(), 0.1f);
		assertEquals(-0.5f, result.getFrustumLeft(), 0.1f);
		assertEquals(1.0f, result.getFrustumNear(), 0.1f);
		assertEquals(0.5f, result.getFrustumRight(), 0.1f);
		assertEquals(0.5f, result.getFrustumTop(), 0.1f);
		assertEquals(0, result.getPlaneState());
		assertEquals(6, result.getMaxWorldPlanes());
	}

	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		int result = fixture.getHeight();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Vector3f getScreenCoordinates(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetScreenCoordinates_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f worldPos = new Vector3f();

		Vector3f result = fixture.getScreenCoordinates(worldPos);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.5, 0.5, -1.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.5f);
		assertEquals(0.0f, result.getY(), 0.5f);
		assertEquals(0.0f, result.getX(), 0.5f);
		assertEquals(-1.0f, result.getZ(), 0.5f);
		assertEquals(1.5f, result.lengthSquared(), 0.5f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getScreenCoordinates(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetScreenCoordinates_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f worldPosition = new Vector3f();
		Vector3f store = null;

		Vector3f result = fixture.getScreenCoordinates(worldPosition, store);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.5, 0.5, -1.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.5f);
		assertEquals(0.0f, result.getY(), 0.5f);
		assertEquals(0.0f, result.getX(), 0.5f);
		assertEquals(-1.0f, result.getZ(), 0.5f);
		assertEquals(1.5f, result.lengthSquared(), 0.5f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getScreenCoordinates(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetScreenCoordinates_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f worldPosition = new Vector3f();
		Vector3f store = new Vector3f(1.0f, 1.0f, 1.0f);

		Vector3f result = fixture.getScreenCoordinates(worldPosition, store);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.5, 0.5, -1.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.5f);
		assertEquals(0.0f, result.getY(), 0.5f);
		assertEquals(0.0f, result.getX(), 0.5f);
		assertEquals(-1.0f, result.getZ(), 0.5f);
		assertEquals(1.5f, result.lengthSquared(), 0.5f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the float getViewToProjectionZ(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetViewToProjectionZ_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float viewZPos = 1.0f;

		float result = fixture.getViewToProjectionZ(viewZPos);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetWidth_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		int result = fixture.getWidth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Vector3f getWorldCoordinates(Vector2f,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetWorldCoordinates_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector2f screenPos = new Vector2f();
		float projectionZPos = 1.0f;

		Vector3f result = fixture.getWorldCoordinates(screenPos, projectionZPos);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.5, -0.5, 2.0)", result.toString());
		assertEquals(2.0f, result.length(), 0.5f);
		assertEquals(-0.5f, result.getY(), 0.1f);
		assertEquals(0.5f, result.getX(), 0.1f);
		assertEquals(2.0f, result.getZ(), 0.1f);
		assertEquals(4.5f, result.lengthSquared(), 0.5f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getWorldCoordinates(Vector2f,float,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetWorldCoordinates_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector2f screenPosition = new Vector2f(1.0f, 1.0f);
		float projectionZPos = 1.0f;
		Vector3f store = null;

		Vector3f result = fixture.getWorldCoordinates(screenPosition, projectionZPos, store);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(-0.5, 0.5, 2.0)", result.toString());
		assertEquals(2.0f, result.length(), 0.5f);
		assertEquals(0.5f, result.getY(), 0.1f);
		assertEquals(-0.5f, result.getX(), 0.1f);
		assertEquals(2.0f, result.getZ(), 0.1f);
		assertEquals(4.5f, result.lengthSquared(), 0.5f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getWorldCoordinates(Vector2f,float,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testGetWorldCoordinates_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector2f screenPosition = new Vector2f(1.0f, 1.0f);
		float projectionZPos = 1.0f;
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getWorldCoordinates(screenPosition, projectionZPos, store);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(-0.5, 0.5, 2.0)", result.toString());
		assertEquals(2.0f, result.length(), 0.5f);
		assertEquals(0.5f, result.getY(), 0.1f);
		assertEquals(-0.5f, result.getX(), 0.1f);
		assertEquals(2.0f, result.getZ(), 0.1f);
		assertEquals(4.5f, result.lengthSquared(), 0.5f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the boolean isParallelProjection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testIsParallelProjection_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		boolean result = fixture.isParallelProjection();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isParallelProjection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testIsParallelProjection_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(false);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		boolean result = fixture.isParallelProjection();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isViewportChanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testIsViewportChanged_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		boolean result = fixture.isViewportChanged();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isViewportChanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testIsViewportChanged_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());


		boolean result = fixture.isViewportChanged();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void lookAt(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAt_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f pos = new Vector3f();
		Vector3f worldUpVector = new Vector3f();

		fixture.lookAt(pos, worldUpVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAt(CameraView.java:707)
	}

	/**
	 * Run the void lookAt(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAt_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f pos = new Vector3f();
		Vector3f worldUpVector = new Vector3f();

		fixture.lookAt(pos, worldUpVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAt(CameraView.java:707)
	}

	/**
	 * Run the void lookAt(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAt_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f pos = new Vector3f();
		Vector3f worldUpVector = new Vector3f();

		fixture.lookAt(pos, worldUpVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAt(CameraView.java:707)
	}

	/**
	 * Run the void lookAt(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAt_4()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f pos = new Vector3f();
		Vector3f worldUpVector = new Vector3f();

		fixture.lookAt(pos, worldUpVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAt(CameraView.java:707)
	}

	/**
	 * Run the void lookAt(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAt_5()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f pos = new Vector3f();
		Vector3f worldUpVector = new Vector3f();

		fixture.lookAt(pos, worldUpVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAt(CameraView.java:707)
	}

	/**
	 * Run the void lookAt(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAt_6()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f pos = new Vector3f();
		Vector3f worldUpVector = new Vector3f();

		fixture.lookAt(pos, worldUpVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAt(CameraView.java:707)
	}

	/**
	 * Run the void lookAtDirection(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testLookAtDirection_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f direction = new Vector3f();
		Vector3f up = new Vector3f();

		fixture.lookAtDirection(direction, up);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.lookAtDirection(CameraView.java:516)
	}

	/**
	 * Run the void normalize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testNormalize_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		fixture.normalize();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.normalize(CameraView.java:564)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here
	//	 OutputCapsule capsule = e.getCapsule(this);
	//	EasyMock.expect(e.getCapsule();
		
		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_4()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_5()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_6()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_7()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_8()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_9()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_10()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_11()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_12()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_13()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_14()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_15()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testRead_16()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.read(CameraView.java:1123)
	}

	/**
	 * Run the void resize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testResize_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		int width = 1;
		int height = 1;
		boolean fixAspect = true;

		fixture.resize(width, height, fixAspect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.resize(CameraView.java:390)
	}

	/**
	 * Run the void resize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testResize_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		int width = 1;
		int height = 1;
		boolean fixAspect = false;

		fixture.resize(width, height, fixAspect);

		// add additional test code here
	}

	/**
	 * Run the void setCamera(Camera) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetCamera_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Camera camera = new Camera();

		fixture.setCamera(camera);

		// add additional test code here
	}

	/**
	 * Run the void setClipPlane(Plane) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetClipPlane_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Plane clipPlane = new Plane();

		fixture.setClipPlane(clipPlane);

		// add additional test code here
	}

	/**
	 * Run the void setClipPlane(Plane,Side) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetClipPlane_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Plane clipPlane = new Plane();
		com.jme3.math.Plane.Side side = com.jme3.math.Plane.Side.Negative;

		fixture.setClipPlane(clipPlane, side);

		// add additional test code here
	}

	/**
	 * Run the void setClipPlane(Plane,Side) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetClipPlane_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Plane clipPlane = new Plane(new Vector3f(), 1.0f);
		com.jme3.math.Plane.Side side = com.jme3.math.Plane.Side.Negative;

		fixture.setClipPlane(clipPlane, side);

		// add additional test code here
	}

	/**
	 * Run the void setClipPlane(Plane,Side) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetClipPlane_4()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Plane clipPlane = new Plane(new Vector3f(), 1.0f);
		com.jme3.math.Plane.Side side = com.jme3.math.Plane.Side.Negative;

		fixture.setClipPlane(clipPlane, side);

		// add additional test code here
	}

	/**
	 * Run the void setFrame(Vector3f,Quaternion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetFrame_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f location = new Vector3f();
		Quaternion axes = new Quaternion();

		fixture.setFrame(location, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.setFrame(CameraView.java:729)
	}

	/**
	 * Run the void setFrame(Vector3f,Vector3f,Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetFrame_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f location = new Vector3f();
		Vector3f left = new Vector3f();
		Vector3f up = new Vector3f();
		Vector3f direction = new Vector3f();

		fixture.setFrame(location, left, up, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.setFrame(CameraView.java:662)
	}

	/**
	 * Run the void setFrustum(Frustum) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetFrustum_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Frustum frustum = new Frustum();

		fixture.setFrustum(frustum);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setParallelProjection(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetParallelProjection_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		boolean value = true;

		fixture.setParallelProjection(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.setParallelProjection(CameraView.java:959)
	}

	/**
	 * Run the void setViewPort(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testSetViewPort_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float left = 1.0f;
		float right = 1.0f;
		float bottom = 1.0f;
		float top = 1.0f;

		fixture.setViewPort(left, right, bottom, top);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Camera[location=(0.0, 0.0, 0.0)\n, direction=(0.0, 0.0, 1.0)\nres=1x1, parallel=true\nnear=1.0, far=2.0]", result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.update(CameraView.java:746)
	}

	/**
	 * Run the void updateAxes(Quaternion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateAxes_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Quaternion axes = new Quaternion();

		fixture.updateAxes(axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.updateAxes(CameraView.java:551)
	}

	/**
	 * Run the void updateAxes(Vector3f,Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateAxes_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f left = new Vector3f();
		Vector3f up = new Vector3f();
		Vector3f direction = new Vector3f();

		fixture.updateAxes(left, up, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.updateAxes(CameraView.java:536)
	}

	/**
	 * Run the void updateFrameChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrameChange_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		fixture.updateFrameChange();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
	}

	/**
	 * Run the void updateFrustum(float,float,float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustum_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float near = 1.0f;
		float far = 1.0f;
		float left = 1.0f;
		float right = 1.0f;
		float top = 1.0f;
		float bottom = 1.0f;

		fixture.updateFrustum(near, far, left, right, top, bottom);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustum(CameraView.java:598)
	}

	/**
	 * Run the void updateFrustumBottom(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumBottom_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float frustumBottom = 1.0f;

		fixture.updateFrustumBottom(frustumBottom);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumBottom(CameraView.java:408)
	}

	/**
	 * Run the void updateFrustumChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumChange_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		fixture.updateFrustumChange();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
	}

	/**
	 * Run the void updateFrustumFar(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumFar_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float frustumFar = 1.0f;

		fixture.updateFrustumFar(frustumFar);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumFar(CameraView.java:424)
	}

	/**
	 * Run the void updateFrustumLeft(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumLeft_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float frustumLeft = 1.0f;

		fixture.updateFrustumLeft(frustumLeft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumLeft(CameraView.java:436)
	}

	/**
	 * Run the void updateFrustumNear(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumNear_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float frustumNear = 1.0f;

		fixture.updateFrustumNear(frustumNear);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumNear(CameraView.java:447)
	}

	/**
	 * Run the void updateFrustumPerspective(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumPerspective_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float fovY = 1.0f;
		float aspect = 1.0f;
		float near = 1.0f;
		float far = 1.0f;

		fixture.updateFrustumPerspective(fovY, aspect, near, far);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:820)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumPerspective(CameraView.java:638)
	}

	/**
	 * Run the void updateFrustumRight(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumRight_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float frustumRight = 1.0f;

		fixture.updateFrustumRight(frustumRight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumRight(CameraView.java:456)
	}

	/**
	 * Run the void updateFrustumTop(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateFrustumTop_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float frustumTop = 1.0f;

		fixture.updateFrustumTop(frustumTop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Frustum.onFrustrumChange(Frustum.java:835)
		//       at com.jme3.renderer.CameraView.updateFrustumChange(CameraView.java:901)
		//       at com.jme3.renderer.CameraView.updateFrustumTop(CameraView.java:468)
	}

	/**
	 * Run the void updateLocation(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateLocation_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Vector3f location = new Vector3f();

		fixture.updateLocation(location);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.updateLocation(CameraView.java:481)
	}

	/**
	 * Run the void updateRotation(Quaternion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateRotation_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		Quaternion rotation = new Quaternion();

		fixture.updateRotation(rotation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.Camera.onFrameChange(Camera.java:347)
		//       at com.jme3.renderer.CameraView.updateFrameChange(CameraView.java:931)
		//       at com.jme3.renderer.CameraView.updateRotation(CameraView.java:500)
	}

	/**
	 * Run the void updateViewPortBottom(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateViewPortBottom_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float bottom = 1.0f;

		fixture.updateViewPortBottom(bottom);

		// add additional test code here
	}

	/**
	 * Run the void updateViewPortChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateViewPortChange_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();

		fixture.updateViewPortChange();

		// add additional test code here
	}

	/**
	 * Run the void updateViewPortLeft(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateViewPortLeft_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float left = 1.0f;

		fixture.updateViewPortLeft(left);

		// add additional test code here
	}

	/**
	 * Run the void updateViewPortRight(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateViewPortRight_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float right = 1.0f;

		fixture.updateViewPortRight(right);

		// add additional test code here
	}

	/**
	 * Run the void updateViewPortTop(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testUpdateViewPortTop_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		float top = 1.0f;

		fixture.updateViewPortTop(top);

		// add additional test code here
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_1()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_2()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_3()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_4()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_5()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_6()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_7()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_8()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_9()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_10()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_11()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_12()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_13()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_14()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_15()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Test
	public void testWrite_16()
		throws Exception {
		CameraView fixture = new CameraView(1, 1);
		fixture.setCamera(new Camera());
		fixture.setName("");
		fixture.setParallelProjection(true);
		fixture.setFrustum(new Frustum());
		fixture.updateViewPortChange();
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.renderer.CameraView.write(CameraView.java:1100)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2013-01-13 19:34
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CameraViewTest.class);
	}
}