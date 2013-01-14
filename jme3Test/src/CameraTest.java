

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.math.Matrix4f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.jme3.renderer.Frustum;

/**
 * The class <code>CameraTest</code> contains tests for the class <code>{@link Camera}</code>.
 *
 * @generatedBy CodePro at 2013-01-13 20:15
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class CameraTest {
	/**
	 * Run the Camera() constructor test.
	 * Tests the default constructor
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testCamera_1()
		throws Exception {

		Camera result = new Camera();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getProjectionMatrixOverride());
		//verify the location vertex
		assertEquals(0.0f,result.getLocation().getX(),0.1f);
		assertEquals(0.0f,result.getLocation().getX(),0.1f);
		assertEquals(0.0f,result.getLocation().getX(),0.1f);
		//verify the rotation matrix
		assertEquals(1.0f,result.getRotation().getW(),0.1f);
		assertEquals(0.0f,result.getRotation().getX(),0.1f);
		assertEquals(0.0f,result.getRotation().getY(),0.1f);
		assertEquals(0.0f,result.getRotation().getZ(),0.1f);
	}

	/**
	 * Run the Vector3f getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetDirection_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Vector3f result = fixture.getDirection();

		assertNotNull(result);
		assertEquals("(0.0, 0.0, 1.0)", result.toString());
		assertEquals(1.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 0.1f);
		assertEquals(0.0f, result.getX(), 0.1f);
		assertEquals(1.0f, result.getZ(), 0.1f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(true, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getDirection(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetDirection_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getDirection(store);

	
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 1.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.1f);
		assertEquals(0.0f, result.getY(), 0.1f);
		assertEquals(0.0f, result.getX(), 0.1f);
		assertEquals(1.0f, result.getZ(), 0.1f);
		assertEquals(1.0f, result.lengthSquared(), 0.1f);
		assertEquals(true, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetLeft_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Vector3f result = fixture.getLeft();

		assertNotNull(result);
		assertEquals("(1.0, 0.0, 0.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.1f);
		assertEquals(0.0f, result.getY(), 0.1f);
		assertEquals(1.0f, result.getX(), 0.1f);
		assertEquals(0.0f, result.getZ(), 0.1f);
		assertEquals(1.0f, result.lengthSquared(), 0.1f);
		assertEquals(true, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getLeft(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetLeft_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getLeft(store);

		assertNotNull(result);
		assertEquals("(1.0, 0.0, 0.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.1f);
		assertEquals(0.0f, result.getY(), 0.1f);
		assertEquals(1.0f, result.getX(), 0.1f);
		assertEquals(0.0f, result.getZ(), 0.1f);
		assertEquals(1.0f, result.lengthSquared(), 0.1f);
		assertEquals(true, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f(-1,-1,-1));
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Vector3f result = fixture.getLocation();

		
		assertNotNull(result);
		assertEquals("(-1.0, -1.0, -1.0)", result.toString());
		assertEquals(1.74f, result.length(), 0.3f);
		assertEquals(-1.0f, result.getY(), 0.1f);
		assertEquals(-1.0f, result.getX(), 0.1f);
		assertEquals(-1.0f, result.getZ(), 0.1f);
		assertEquals(3.0f, result.lengthSquared(), 0.1f);
		assertEquals(false, result.isUnitVector());
	}

	/**
	 * Run the Matrix4f getProjectionMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetProjectionMatrix_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Matrix4f result = fixture.getProjectionMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Matrix4f\n[\n 1.0  0.0  0.0  0.0 \n 0.0  1.0  0.0  0.0 \n 0.0  0.0  1.0  0.0 \n 0.0  0.0  0.0  1.0 \n]", result.toString());
		assertEquals(true, result.isIdentity());
		assertEquals(0.0f, result.determinant(), 1.0f);
	}

	/**
	 * Run the Matrix4f getProjectionMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetProjectionMatrix_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride((Matrix4f) null);
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Matrix4f result = fixture.getProjectionMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Matrix4f\n[\n 1.0  0.0  0.0  0.0 \n 0.0  1.0  0.0  0.0 \n 0.0  0.0  1.0  0.0 \n 0.0  0.0  0.0  1.0 \n]", result.toString());
		assertEquals(true, result.isIdentity());
		assertEquals(0.0f, result.determinant(), 1.0f);
	}

	/**
	 * Run the Matrix4f getProjectionMatrixOverride() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetProjectionMatrixOverride_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Matrix4f result = fixture.getProjectionMatrixOverride();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Matrix4f\n[\n 1.0  0.0  0.0  0.0 \n 0.0  1.0  0.0  0.0 \n 0.0  0.0  1.0  0.0 \n 0.0  0.0  0.0  1.0 \n]", result.toString());
		assertEquals(true, result.isIdentity());
		assertEquals(0.0f, result.determinant(), 1.0f);
	}

	/**
	 * Run the Quaternion getRotation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetRotation_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Quaternion result = fixture.getRotation();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0, 1.0)", result.toString());
		assertEquals(0.0f, result.getY(), 0.1f);
		assertEquals(0.0f, result.getX(), 0.1f);
		assertEquals(true, result.isIdentity());
		assertEquals(0.0f, result.getZ(), 0.1f);
		assertEquals(1.0f, result.getW(), 0.1f);
		assertEquals(1.0f, result.norm(), 0.1f);
	}

	/**
	 * Run the Vector3f getUp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetUp_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Vector3f result = fixture.getUp();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.0, 1.0, 0.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.1f);
		assertEquals(1.0f, result.getY(), 0.1f);
		assertEquals(0.0f, result.getX(), 0.1f);
		assertEquals(0.0f, result.getZ(), 0.1f);
		assertEquals(1.0f, result.lengthSquared(), 0.1f);
		assertEquals(true, result.isUnitVector());
	}

	/**
	 * Run the Vector3f getUp(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetUp_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getUp(store);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.0, 1.0, 0.0)", result.toString());
		assertEquals(1.0f, result.length(), 0.1f);
		assertEquals(1.0f, result.getY(), 0.1f);
		assertEquals(0.0f, result.getX(), 0.1f);
		assertEquals(0.0f, result.getZ(), 0.1f);
		assertEquals(1.0f, result.lengthSquared(), 0.1f);
		assertEquals(true, result.isUnitVector());
	}

	/**
	 * Run the Matrix4f getViewMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetViewMatrix_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Matrix4f result = fixture.getViewMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Matrix4f\n[\n 1.0  0.0  0.0  0.0 \n 0.0  1.0  0.0  0.0 \n 0.0  0.0  1.0  0.0 \n 0.0  0.0  0.0  1.0 \n]", result.toString());
		assertEquals(true, result.isIdentity());
		assertEquals(0.0f, result.determinant(), 1.0f);
	}

	/**
	 * Run the Matrix4f getViewProjectionMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testGetViewProjectionMatrix_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		Matrix4f result = fixture.getViewProjectionMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Matrix4f\n[\n 1.0  0.0  0.0  0.0 \n 0.0  1.0  0.0  0.0 \n 0.0  0.0  1.0  0.0 \n 0.0  0.0  0.0  1.0 \n]", result.toString());
		assertEquals(true, result.isIdentity());
		assertEquals(0.0f, result.determinant(), 1.0f);
	}

	/**
	 * Run the void lookAtDirection(Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testLookAtDirection_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Vector3f direction = new Vector3f();
		Vector3f up = new Vector3f();

		fixture.lookAtDirection(direction, up);

	
	}

	/**
	 * Run the void normalize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testNormalize_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		fixture.normalize();

	}

	/**
	 * Run the void onFrameChange(Frustum,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testOnFrameChange_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Frustum frustum = new Frustum();
		frustum.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		frustum.setCoeffRight(new float[2]);
		frustum.setCoeffTop(new float[2]);
		frustum.setCoeffBottom(new float[2]);
		frustum.setCoeffLeft(new float[2]);
		boolean isParallelProjection = true;

		fixture.onFrameChange(frustum, isParallelProjection);

	}

	/**
	 * Run the void onFrameChange(Frustum,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testOnFrameChange_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Frustum frustum = new Frustum();
		frustum.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		frustum.setCoeffRight(new float[2] );
		frustum.setCoeffTop(new float[2] );
		frustum.setCoeffBottom(new float[2] );
		frustum.setCoeffLeft(new float[2] );
		boolean isParallelProjection = false;

		fixture.onFrameChange(frustum, isParallelProjection);

	 
	}

	/**
	 * Run the void setAxes(Quaternion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetAxes_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Quaternion axes = new Quaternion();

		fixture.setAxes(axes);

		// add additional test code here
	}

	/**
	 * Run the void setAxes(Vector3f,Vector3f,Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetAxes_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Vector3f left = new Vector3f();
		Vector3f up = new Vector3f();
		Vector3f direction = new Vector3f();

		fixture.setAxes(left, up, direction);

		// add additional test code here
	}

	/**
	 * Run the void setLocation(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Vector3f location = new Vector3f();

		fixture.setLocation(location);

		// add additional test code here
	}

	/**
	 * Run the void setProjectionMatrix(Matrix4f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetProjectionMatrix_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Matrix4f projMatrix = new Matrix4f();

		fixture.setProjectionMatrix(projMatrix);

		// add additional test code here
	}

	/**
	 * Run the void setProjectionMatrixOverride(Matrix4f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetProjectionMatrixOverride_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Matrix4f projectionMatrixOverride = new Matrix4f();

		fixture.setProjectionMatrixOverride(projectionMatrixOverride);

		// add additional test code here
	}

	/**
	 * Run the void setRotation(Quaternion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetRotation_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Quaternion rotation = new Quaternion();

		fixture.setRotation(rotation);

		// add additional test code here
	}

	/**
	 * Run the void setViewMatrix(Matrix4f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetViewMatrix_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Matrix4f viewMatrix = new Matrix4f();

		fixture.setViewMatrix(viewMatrix);

		// add additional test code here
	}

	/**
	 * Run the void setViewProjectionMatrix(Matrix4f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testSetViewProjectionMatrix_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());
		Matrix4f viewset = new Matrix4f();

		fixture.setViewProjectionMatrix(viewset);

		// add additional test code here
	}

	/**
	 * Run the void updateViewProjection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testUpdateViewProjection_1()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride((Matrix4f) null);
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		fixture.updateViewProjection();

		// add additional test code here
	}

	/**
	 * Run the void updateViewProjection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	@Test
	public void testUpdateViewProjection_2()
		throws Exception {
		Camera fixture = new Camera();
		fixture.setLocation(new Vector3f());
		fixture.setProjectionMatrixOverride(new Matrix4f());
		fixture.setViewMatrix(new Matrix4f());
		fixture.setRotation(new Quaternion());
		fixture.setViewProjectionMatrix(new Matrix4f());
		fixture.setProjectionMatrix(new Matrix4f());

		fixture.updateViewProjection();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-13 20:15
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
	 * @generatedBy CodePro at 2013-01-13 20:15
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
	 * @generatedBy CodePro at 2013-01-13 20:15
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CameraTest.class);
	}
}