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
 * @generatedBy CodePro at 2013-01-13 23:52
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class LineSegmentTest {
	/**
	 * Run the LineSegment() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testLineSegment_1()
		throws Exception {

		LineSegment result = new LineSegment();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment(LineSegment) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testLineSegment_2()
		throws Exception {
		LineSegment ls = new LineSegment();

		LineSegment result = new LineSegment(ls);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment(Vector3f,Vector3f) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testLineSegment_3()
		throws Exception {
		Vector3f start = new Vector3f(1.0f, 1.0f, 1.0f);
		Vector3f end = new Vector3f(1.0f, 1.0f, 1.0f);

		LineSegment result = new LineSegment(start, end);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment(Vector3f,Vector3f,float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testLineSegment_4()
		throws Exception {
		Vector3f origin = new Vector3f();
		Vector3f direction = new Vector3f();
		float extent = 1.0f;

		LineSegment result = new LineSegment(origin, direction, extent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testClone_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		LineSegment result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the LineSegment clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testClone_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		LineSegment result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1.0f, result.getExtent(), 1.0f);
	}

	/**
	 * Run the float distance(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistance_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment ls = new LineSegment();

		float result = fixture.distance(ls);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distance(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistance_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();

		float result = fixture.distance(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distance(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistance_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distance(point);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_4()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_5()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_6()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_7()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_8()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_9()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_10()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_11()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_12()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_13()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_14()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_15()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_16()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment test = new LineSegment();

		float result = fixture.distanceSquared(test);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_17()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_18()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_19()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_20()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_21()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_22()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_23()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_24()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_25()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), Float.MAX_VALUE);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_26()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_27()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_28()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_29()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_30()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_31()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Ray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_32()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Ray r = new Ray();
		r.direction = new Vector3f();
		r.origin = new Vector3f();

		float result = fixture.distanceSquared(r);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_33()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distanceSquared(point);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_34()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distanceSquared(point);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float distanceSquared(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testDistanceSquared_35()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		float result = fixture.distanceSquared(point);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the Vector3f getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetDirection_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		Vector3f result = fixture.getDirection();

		// add additional test code here
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetExtent_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		float result = fixture.getExtent();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the Vector3f getNegativeEnd(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetNegativeEnd_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = null;

		Vector3f result = fixture.getNegativeEnd(store);

		// add additional test code here
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetNegativeEnd_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getNegativeEnd(store);

		// add additional test code here
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetOrigin_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);

		Vector3f result = fixture.getOrigin();

		// add additional test code here
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetPositiveEnd_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = null;

		Vector3f result = fixture.getPositiveEnd(store);

		// add additional test code here
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testGetPositiveEnd_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f store = new Vector3f();

		Vector3f result = fixture.getPositiveEnd(store);

		// add additional test code here
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testIsPointInsideBounds_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		boolean result = fixture.isPointInsideBounds(point);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testIsPointInsideBounds_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f();

		boolean result = fixture.isPointInsideBounds(point);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testIsPointInsideBounds_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testIsPointInsideBounds_4()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testIsPointInsideBounds_5()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPointInsideBounds(Vector3f,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testIsPointInsideBounds_6()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f point = new Vector3f(1.0f, 1.0f, 1.0f);
		float error = 1.0f;

		boolean result = fixture.isPointInsideBounds(point, error);

		// add additional test code here
		assertEquals(true, result);
	}
/*
	*//**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testRead_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.read(LineSegment.java:587)
	}

	*//**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testRead_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.read(LineSegment.java:587)
	}

	*//**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testRead_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.read(LineSegment.java:587)
	}

	*//**
	 * Run the void read(JmeImporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testRead_4()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeImporter e = EasyMock.createMock(JmeImporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.read(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.read(LineSegment.java:587)
	}*/

	/**
	 * Run the void set(LineSegment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testSet_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		LineSegment ls = new LineSegment();

		fixture.set(ls);

		// add additional test code here
	}

	/**
	 * Run the void setDirection(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testSetDirection_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f direction = new Vector3f();

		fixture.setDirection(direction);

		// add additional test code here
	}

	/**
	 * Run the void setExtent(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testSetExtent_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		float extent = 1.0f;

		fixture.setExtent(extent);

		// add additional test code here
	}

	/**
	 * Run the void setOrigin(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	@Test
	public void testSetOrigin_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		Vector3f origin = new Vector3f();

		fixture.setOrigin(origin);

		// add additional test code here
	}

/*	*//**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testWrite_1()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.write(LineSegment.java:580)
	}

	*//**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testWrite_2()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.write(LineSegment.java:580)
	}

	*//**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testWrite_3()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.write(LineSegment.java:580)
	}

	*//**
	 * Run the void write(JmeExporter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
	 *//*
	@Test
	public void testWrite_4()
		throws Exception {
		LineSegment fixture = new LineSegment(new Vector3f(), new Vector3f(), 1.0f);
		JmeExporter e = EasyMock.createMock(JmeExporter.class);
		// add mock object expectations here

		EasyMock.replay(e);

		fixture.write(e);

		// add additional test code here
		EasyMock.verify(e);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.math.LineSegment.write(LineSegment.java:580)
	}*/

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-13 23:52
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
	 * @generatedBy CodePro at 2013-01-13 23:52
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
	 * @generatedBy CodePro at 2013-01-13 23:52
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LineSegmentTest.class);
	}
}