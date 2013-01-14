

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.bounding.BoundingBox;
import com.jme3.bounding.BoundingVolume;
import com.jme3.math.Plane;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Frustum;

/**
 * The class <code>FrustumTest</code> contains tests for the class <code>{@link Frustum}</code>.
 *
 * @generatedBy CodePro at 2013-01-13 20:02
 * @author Joseph
 * @version $Revision: 1.0 $
 * TODO: We need a case with FrustumIntersect.Outside
 * 
 */
public class FrustumTest {
	
	/**
	 * Run the Frustum(boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testFrustum_1()
		throws Exception {
		boolean a = true;

		Frustum result = new Frustum();

		// add additional test code here
		assertNotNull(result);
		assertEquals(6, result.getMaxWorldPlanes());
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
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testClone_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		Object result = fixture.clone();
		
		Frustum result2 = (Frustum) result;
		/*
		//coeffs
		assertEquals(fixture.getCoeffLeft().clone(),result2.getCoeffLeft());
		assertEquals(fixture.getCoeffRight(),result2.getCoeffRight());
		assertEquals(fixture.getCoeffTop(),result2.getCoeffTop());
		assertEquals(fixture.getCoeffBottom(),result2.getCoeffBottom());
		
		//frusum planes
		assertEquals(fixture.getFrustumFar(),result2.getFrustumFar(),0.1f);
		assertEquals(fixture.getFrustumNear(),result2.getFrustumNear(),0.1f);
		assertEquals(fixture.getFrustumLeft(),result2.getFrustumLeft(),0.1f);
		assertEquals(fixture.getFrustumRight(),result2.getFrustumRight(),0.1f);
		
		assertEquals(fixture.getViewPortBottom(),result2.getViewPortBottom(),0.1f);
		assertEquals(fixture.getViewPortTop(),result2.getViewPortTop(),0.1f);
		assertEquals(fixture.getViewPortLeft(),result2.getViewPortLeft(),0.1f);
		assertEquals(fixture.getViewPortRight(),result2.getViewPortRight(),0.1f);
		*/
		assertEquals(1,result2.getPlaneState());
		assertNotNull(result);
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testClone_2()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		Object result = fixture.clone();

		Frustum result2 = (Frustum)result;
		
		/*//coeffs
		assertEquals(fixture.getCoeffLeft(),result2.getCoeffLeft());
		assertEquals(fixture.getCoeffRight(),result2.getCoeffRight());
		assertEquals(fixture.getCoeffTop(),result2.getCoeffTop());
		assertEquals(fixture.getCoeffBottom(),result2.getCoeffBottom());
		assertEquals(fixture.getPlaneState(),result2.getPlaneState());
		//frusum planes
		assertEquals(fixture.getFrustumFar(),result2.getFrustumFar(),0.1f);
		assertEquals(fixture.getFrustumNear(),result2.getFrustumNear(),0.1f);
		assertEquals(fixture.getFrustumLeft(),result2.getFrustumLeft(),0.1f);
		assertEquals(fixture.getFrustumRight(),result2.getFrustumRight(),0.1f);
		
		assertEquals(fixture.getViewPortBottom(),result2.getViewPortBottom(),0.1f);
		assertEquals(fixture.getViewPortTop(),result2.getViewPortTop(),0.1f);
		assertEquals(fixture.getViewPortLeft(),result2.getViewPortLeft(),0.1f);
		assertEquals(fixture.getViewPortRight(),result2.getViewPortRight(),0.1f);
		*/
		assertEquals(1,result2.getPlaneState());
		assertNotNull(result);
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
//	@Test(expected = java.lang.AssertionError.class)
	@Test
	public void testClone_3()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		Object result = fixture.clone();

		
/*		//coeffs
		assertEquals(fixture.getCoeffLeft(),result2.getCoeffLeft());
		assertEquals(fixture.getCoeffRight(),result2.getCoeffRight());
		assertEquals(fixture.getCoeffTop(),result2.getCoeffTop());
		assertEquals(fixture.getCoeffBottom(),result2.getCoeffBottom());
		assertEquals(fixture.getPlaneState(),result2.getPlaneState());
		//frusum planes
		assertEquals(fixture.getFrustumFar(),result2.getFrustumFar(),0.1f);
		assertEquals(fixture.getFrustumNear(),result2.getFrustumNear(),0.1f);
		assertEquals(fixture.getFrustumLeft(),result2.getFrustumLeft(),0.1f);
		assertEquals(fixture.getFrustumRight(),result2.getFrustumRight(),0.1f);
		
		assertEquals(fixture.getViewPortBottom(),result2.getViewPortBottom(),0.1f);
		assertEquals(fixture.getViewPortTop(),result2.getViewPortTop(),0.1f);
		assertEquals(fixture.getViewPortLeft(),result2.getViewPortLeft(),0.1f);
		assertEquals(fixture.getViewPortRight(),result2.getViewPortRight(),0.1f);
		// add additional test code here*/
		assertNotNull(result);
	}

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = null;

		Frustum.FrustumIntersect result = fixture.contains(bound);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Inside", result.name());
		assertEquals("Inside", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2] );
		fixture.setCoeffTop(new float[2] );
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2] );
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2] );
		BoundingVolume bound = new BoundingBox();

		Frustum.FrustumIntersect result = fixture.contains(bound);
		assertEquals("Intersects", result.name());
		assertEquals("Intersects", result.toString());
		assertEquals(2, result.ordinal());
	
		assertNotNull(result);
	}

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testContains_3()
		throws Exception {
		Frustum fixture = new Frustum();
		
		fixture.setPlaneState(1);
	
		fixture.setGuiBounding(new BoundingBox());
	
		BoundingVolume bound = new BoundingBox(new Vector3f(21,45,33),new Vector3f(-5,4,5));
		Frustum.FrustumIntersect result = fixture.contains(bound);
		assertEquals("Intersects", result.name());
		assertEquals("Intersects", result.toString());
		assertEquals(2, result.ordinal());
		
		assertNotNull(result);
	}

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
/*	@Test
	public void testContains_4()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = new BoundingBox();

		Frustum.FrustumIntersect result = fixture.contains(bound);
		assertEquals("Inside", result.name());
		assertEquals("Inside", result.toString());
		assertEquals(1, result.ordinal());
	
		assertNotNull(result);
	}*/

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
/*	@Test
	public void testContains_5()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = new BoundingBox();

		Frustum.FrustumIntersect result = fixture.contains(bound);
		assertEquals("Inside", result.name());
		assertEquals("Inside", result.toString());
		assertEquals(1, result.ordinal());
		
		assertNotNull(result);
	}*/

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
/*	@Test
	public void testContains_6()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = new BoundingBox();

		Frustum.FrustumIntersect result = fixture.contains(bound);
		assertEquals("Inside", result.name());
		assertEquals("Inside", result.toString());
		assertEquals(1, result.ordinal());
	
		assertNotNull(result);
	}*/

	/**
	 * Run the Frustum.FrustumIntersect contains(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
/*	@Test
	public void testContains_7()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = new BoundingBox();

		Frustum.FrustumIntersect result = fixture.contains(bound);
		assertEquals("Inside", result.name());
		assertEquals("Inside", result.toString());
		assertEquals(1, result.ordinal());
		
		assertNotNull(result);
	}*/

	/**
	 * Run the boolean containsGui(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testContainsGui_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = new BoundingBox();

		boolean result = fixture.containsGui(bound);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean containsGui(BoundingVolume) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testContainsGui_2()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingVolume bound = new BoundingBox();

		boolean result = fixture.containsGui(bound);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the float distanceToNearPlane(Vector3f) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testDistanceToNearPlane_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		Vector3f pos = new Vector3f();

		float result = fixture.distanceToNearPlane(pos);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at com.jme3.renderer.Frustum.distanceToNearPlane(Frustum.java:127)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float[] getCoeffBottom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetCoeffBottom_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float[] result = fixture.getCoeffBottom();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
	}

	/**
	 * Run the float[] getCoeffLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetCoeffLeft_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float[] result = fixture.getCoeffLeft();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
	}

	/**
	 * Run the float[] getCoeffRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetCoeffRight_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float[] result = fixture.getCoeffRight();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
	}

	/**
	 * Run the float[] getCoeffTop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetCoeffTop_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float[] result = fixture.getCoeffTop();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
	}

	/**
	 * Run the float getFrustumBottom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetFrustumBottom_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getFrustumBottom();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getFrustumFar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetFrustumFar_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getFrustumFar();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getFrustumLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetFrustumLeft_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getFrustumLeft();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getFrustumNear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetFrustumNear_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getFrustumNear();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getFrustumRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetFrustumRight_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getFrustumRight();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getFrustumTop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetFrustumTop_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getFrustumTop();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the BoundingBox getGuiBounding() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetGuiBounding_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		BoundingBox result = fixture.getGuiBounding();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BoundingBox [Center: (0.0, 0.0, 0.0)  xExtent: 0.0  yExtent: 0.0  zExtent: 0.0]", result.toString());
		assertEquals(0.0f, result.getXExtent(), 1.0f);
		assertEquals(0.0f, result.getYExtent(), 1.0f);
		assertEquals(0.0f, result.getZExtent(), 1.0f);
		assertEquals(0.0f, result.getVolume(), 1.0f);
		assertEquals(0, result.getCheckPlane());
	}

	/**
	 * Run the int getMaxWorldPlanes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetMaxWorldPlanes_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		int result = fixture.getMaxWorldPlanes();

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * Run the int getPlaneState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetPlaneState_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		int result = fixture.getPlaneState();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the float getViewPortBottom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetViewPortBottom_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getViewPortBottom();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getViewPortLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetViewPortLeft_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getViewPortLeft();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getViewPortRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetViewPortRight_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getViewPortRight();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getViewPortTop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetViewPortTop_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		float result = fixture.getViewPortTop();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the Plane[] getWorldPlane() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testGetWorldPlane_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);

		Plane[] result = fixture.getWorldPlane();

		assertNotNull(result);
		assertEquals(6, result.length);
	}
	/**
	 * Run the void onFrustrumChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testOnFrustrumChange_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		boolean isParallelProjection = true;

		fixture.onFrustrumChange(isParallelProjection);

	}

	/**
	 * Run the void onFrustrumChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testOnFrustrumChange_2()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		boolean isParallelProjection = false;

		fixture.onFrustrumChange(isParallelProjection);

	}

	/**
	 * Run the void setCoeffBottom(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffBottom_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float[] coeffBottom = new float[2];

		fixture.setCoeffBottom(coeffBottom);

		
	}
	/**
	 * Run the void setCoeffBottom(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test(expected = java.lang.Exception.class)
	public void testSetCoeffBottom_2()
		throws Exception {
		Frustum fixture = new Frustum();
		float[] coeffBottom = new float[]{};

		fixture.setCoeffBottom(coeffBottom);

	}

	/**
	 * Run the void setCoeffBottomAssignValue(int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffBottomAssignValue_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int index = 1;
		float value = 1.0f;

		fixture.setCoeffBottomAssignValue(index, value);

		
	}

	/**
	 * Run the void setCoeffLeft(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffLeft_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float[] floats = new float[2];

		fixture.setCoeffLeft(floats);

		// add additional test code here
	}
	/**
	 * Run the void setCoeffLeft(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test(expected = java.lang.Exception.class)
	public void testSetCoeffLeft_2()
		throws Exception {
		Frustum fixture = new Frustum();
		float[] coeffLeft = new float[]{};

		fixture.setCoeffLeft(coeffLeft);

	}
	/**
	 * Run the void setCoeffRight(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test(expected = java.lang.Exception.class)
	public void testSetCoeffRight_2()
		throws Exception {
		Frustum fixture = new Frustum();
		float[] coeffRight = new float[]{};
		fixture.setCoeffRight(coeffRight);

	}
	/**
	 * Run the void setCoeffTop(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test(expected = java.lang.Exception.class)
	public void testSetCoeffTop_2()
		throws Exception {
		Frustum fixture = new Frustum();
		float[] coeffTop = new float[]{};
		fixture.setCoeffTop(coeffTop);

	}
	
	
	/**
	 * Run the void setCoeffLeftAssignValue(int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testSetCoeffLeftAssignValue_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int index = 3;
		float value = 1.0f;

		fixture.setCoeffLeftAssignValue(index, value);

	
	}

	/**
	 * Run the void setCoeffRight(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffRight_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float[] floats = new float[2];

		fixture.setCoeffRight(floats);

		// add additional test code here
	}

	/**
	 * Run the void setCoeffRightAssignValue(int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffRightAssignValue_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int index = 1;
		float value = 1.0f;

		fixture.setCoeffRightAssignValue(index, value);

		
	}

	/**
	 * Run the void setCoeffTop(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffTop_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float[] coeffTop = new float[2];

		fixture.setCoeffTop(coeffTop);

	}

	/**
	 * Run the void setCoeffTopAssignValue(int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetCoeffTopAssignValue_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int index = 1;
		float value = 1.0f;

		fixture.setCoeffTopAssignValue(index, value);

	
	}

	/**
	 * Run the void setFrustum(float,float,float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustum_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float near = 1.0f;
		float far = 1.0f;
		float left = 1.0f;
		float right = 1.0f;
		float top = 1.0f;
		float bottom = 1.0f;

		fixture.setFrustum(near, far, left, right, top, bottom);

		
	}

	/**
	 * Run the void setFrustumBottom(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumBottom_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float frustumBottom = 1.0f;

		fixture.setFrustumBottom(frustumBottom);

	
	}

	/**
	 * Run the void setFrustumFar(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumFar_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float frustumFar = 1.0f;

		fixture.setFrustumFar(frustumFar);

	
	}

	/**
	 * Run the void setFrustumLeft(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumLeft_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float frustumLeft = 1.0f;

		fixture.setFrustumLeft(frustumLeft);

	}

	/**
	 * Run the void setFrustumNear(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumNear_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float frustumNear = 1.0f;

		fixture.setFrustumNear(frustumNear);

	}

	/**
	 * Run the void setFrustumPerspective(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumPerspective_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float fovY = 1.0f;
		float aspect = 1.0f;
		float near = 1.0f;
		float far = 1.0f;

		fixture.setFrustumPerspective(fovY, aspect, near, far);

	}

	/**
	 * Run the void setFrustumPerspective(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumPerspective_2()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float fovY = 1.0f;
		float aspect = 1.0f;
		float near = 1.0f;
		float far = 1.0f;

		fixture.setFrustumPerspective(fovY, aspect, near, far);

		// add additional test code here
	}

	/**
	 * Run the void setFrustumPerspective(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumPerspective_3()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float fovY = 1.0f;
		float aspect = 1.0f;
		float near = 1.0f;
		float far = 1.0f;

		fixture.setFrustumPerspective(fovY, aspect, near, far);

		// add additional test code here
	}

	/**
	 * Run the void setFrustumRight(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumRight_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float frustumRight = 1.0f;

		fixture.setFrustumRight(frustumRight);

		// add additional test code here
	}

	/**
	 * Run the void setFrustumTop(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetFrustumTop_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float frustumTop = 1.0f;

		fixture.setFrustumTop(frustumTop);

		// add additional test code here
	}

	/**
	 * Run the void setGuiBounding(BoundingBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetGuiBounding_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		BoundingBox guiBounding = new BoundingBox();

		fixture.setGuiBounding(guiBounding);

		// add additional test code here
	}

	/**
	 * Run the void setGuiBounding(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetGuiBounding_2()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int width = 1;
		int height = 1;

		fixture.setGuiBounding(width, height);

		// add additional test code here
	}

	/**
	 * Run the void setPlaneState(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetPlaneState_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int planeState = 1;

		fixture.setPlaneState(planeState);

		// add additional test code here
	}

	/**
	 * Run the void setViewPort(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetViewPort_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float left = 1.0f;
		float right = 1.0f;
		float bottom = 1.0f;
		float top = 1.0f;

		fixture.setViewPort(left, right, bottom, top);

		// add additional test code here
	}

	/**
	 * Run the void setViewPortBottom(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetViewPortBottom_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float bottom = 1.0f;

		fixture.setViewPortBottom(bottom);

		// add additional test code here
	}

	/**
	 * Run the void setViewPortLeft(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetViewPortLeft_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float left = 1.0f;

		fixture.setViewPortLeft(left);

		// add additional test code here
	}

	/**
	 * Run the void setViewPortRight(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetViewPortRight_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float right = 1.0f;

		fixture.setViewPortRight(right);

		// add additional test code here
	}

	/**
	 * Run the void setViewPortTop(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetViewPortTop_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		float top = 1.0f;

		fixture.setViewPortTop(top);

		// add additional test code here
	}

	/**
	 * Run the void setWorldPlane(Plane[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetWorldPlane_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		Plane[] worldPlane = new Plane[] {};

		fixture.setWorldPlane(worldPlane);

		// add additional test code here
	}

	/**
	 * Run the void setWorldPlaneValue(int,Plane) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	@Test
	public void testSetWorldPlaneValue_1()
		throws Exception {
		Frustum fixture = new Frustum();
		fixture.setFrustum(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setViewPort(1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setCoeffLeft(new float[2]);
		fixture.setCoeffTop(new float[2]);
		
		fixture.setPlaneState(1);
		fixture.setCoeffBottom(new float[2]);
		fixture.setGuiBounding(new BoundingBox());
		fixture.setCoeffRight(new float[2]);
		int index = 1;
		Plane plane = new Plane();

		fixture.setWorldPlaneValue(index, plane);

		
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-13 20:02
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
	 * @generatedBy CodePro at 2013-01-13 20:02
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
	 * @generatedBy CodePro at 2013-01-13 20:02
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FrustumTest.class);
	}
}