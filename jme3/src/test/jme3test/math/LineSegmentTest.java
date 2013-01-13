package jme3test.math;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.math.LineSegment;
import com.jme3.math.Ray;
import com.jme3.math.Vector3f;

/**
 * The class <code>LineSegmentTest</code> contains tests for the class <code>{@link LineSegment}</code>.
 *
 * TODO: Add cases which test both negative and big values also make some changes in current one to have varity

 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class LineSegmentTest {
	/**
	 * Run the LineSegment() constructor test.
	 * Default constructor 
	 * @throws Exception
	 */
	@Test
	public void testLineSegment_1()
		throws Exception {

		LineSegment result = new LineSegment();

		
		assertNotNull(result);
		assertEquals(0.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment(LineSegment) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testLineSegment_2()
		throws Exception {
		
		LineSegment ls = new LineSegment();
		LineSegment result = new LineSegment(ls);
		assertNotNull(result);
		assertEquals(0.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment(Vector3f,Vector3f) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testLineSegment_3()
		throws Exception {
		Vector3f start = new Vector3f(1.0f, 1.0f, 1.0f);
		Vector3f end = new Vector3f(1.0f, 1.0f, 1.0f);

		LineSegment result = new LineSegment(start, end);

		
		assertNotNull(result);
		assertEquals(0.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment(Vector3f,Vector3f,float) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testLineSegment_4()
		throws Exception {
		Vector3f origin = new Vector3f();
		Vector3f direction = new Vector3f();
		float extent = 1.0f;

		LineSegment result = new LineSegment(origin, direction, extent);

		
		assertNotNull(result);
		assertEquals(1.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment clone() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testClone_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		LineSegment result = fixture.clone();

		
		assertNotNull(result);
		assertEquals(1.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment clone() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testClone_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		LineSegment result = fixture.clone();

		
		assertNotNull(result);
		assertEquals(1.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the float distance(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistance_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment ls = new LineSegment();

		float result = fixture.distance(ls);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distance(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistance_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();

		float result = fixture.distance(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distance(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistance_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distance(point);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_4()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_5()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_6()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_7()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_8()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_9()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_10()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.origin = new Vector3f();
		r.direction = new Vector3f();

		float result = fixture.distanceSquared(r);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_11()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distanceSquared(point);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_12()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distanceSquared(point);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDistanceSquared_13()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distanceSquared(point);

		
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the Vector3f getDirection() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetDirection_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		Vector3f result = fixture.getDirection();

		
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0)", result.toString());
		assertEquals(0.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(false, result.isUnitVector());
		assertEquals(-0.0f, result.getZ(), 1.0f);
	}

	/**
	 * Run the float getExtent() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetExtent_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		float result = fixture.getExtent();

		
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the Vector3f getNegativeEnd(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetNegativeEnd_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = null;

		Vector3f result = fixture.getNegativeEnd(store);

		
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0)", result.toString());
		assertEquals(0.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(false, result.isUnitVector());
		assertEquals(-0.0f, result.getZ(), 1.0f);
	}

	/**
	 * Run the Vector3f getNegativeEnd(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetNegativeEnd_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getNegativeEnd(store);

		
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0)", result.toString());
		assertEquals(0.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(false, result.isUnitVector());
		assertEquals(-0.0f, result.getZ(), 1.0f);
	}

	/**
	 * Run the Vector3f getOrigin() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetOrigin_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		Vector3f result = fixture.getOrigin();

		
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0)", result.toString());
		assertEquals(0.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(false, result.isUnitVector());
		assertEquals(-0.0f, result.getZ(), 1.0f);
	}

	/**
	 * Run the Vector3f getPositiveEnd(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetPositiveEnd_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = null;

		Vector3f result = fixture.getPositiveEnd(store);

		
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0)", result.toString());
		assertEquals(0.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(false, result.isUnitVector());
		assertEquals(-0.0f, result.getZ(), 1.0f);
	}

	/**
	 * Run the Vector3f getPositiveEnd(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetPositiveEnd_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getPositiveEnd(store);

		
		assertNotNull(result);
		assertEquals("(0.0, 0.0, 0.0)", result.toString());
		assertEquals(0.0f, result.length(), 1.0f);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.lengthSquared(), 1.0f);
		assertEquals(false, result.isUnitVector());
		assertEquals(-0.0f, result.getZ(), 1.0f);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPointInsideBounds_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		boolean result = fixture.isPointInsideBounds(point);

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPointInsideBounds_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		boolean result = fixture.isPointInsideBounds(point);

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPointInsideBounds_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPointInsideBounds_4()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPointInsideBounds_5()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPointInsideBounds_6()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		
		assertEquals(true, result);
	}

	/**
	 * Run the void set(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSet_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment ls = new LineSegment();

		fixture.set(ls);

		
	}

	/**
	 * Run the void setDirection(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetDirection_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f direction = new Vector3f();

		fixture.setDirection(direction);

		
	}

	/**
	 * Run the void setExtent(float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetExtent_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		float extent = 1.0f;

		fixture.setExtent(extent);

		
	}

	/**
	 * Run the void setOrigin(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetOrigin_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f origin = new Vector3f();

		fixture.setOrigin(origin);

		
	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 *
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
	 *
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
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LineSegmentTest.class);
	}
}