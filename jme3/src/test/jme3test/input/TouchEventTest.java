package jme3test.input;

import org.junit.*;

import com.jme3.input.event.TouchEvent;
import com.jme3.input.event.TouchEvent.Type;

import static org.junit.Assert.*;

/**
 * The class <code>TouchEventTest</code> contains tests for the class <code>{@link TouchEvent}</code>.
 *
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class TouchEventTest {
	/**
	 * Run the TouchEvent() constructor test.
	 * Testing the default constructor and assure that the default values
	 * are initiated 
	 * @throws Exception
	 *
	 */
	@Test
	public void testTouchEvent_1()
		throws Exception {

		TouchEvent result = new TouchEvent();

		assertNotNull(result);
		assertEquals(Type.IDLE,result.getType());
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals("", result.getCharacters());
		assertEquals(0, result.getKeyCode());
		assertEquals(0.0f, result.getDeltaX(), 1.0f);
		assertEquals(0.0f, result.getDeltaY(), 1.0f);
		assertEquals(0.0f, result.getPressure(), 1.0f);
		assertEquals(0, result.getPointerId());
		assertEquals(0.0f, result.getScaleFactor(), 1.0f);
		assertEquals(0.0f, result.getScaleSpan(), 1.0f);
		assertEquals(0.0f, result.getDeltaScaleSpan(), 1.0f);
		assertEquals(false, result.isScaleSpanInProgress());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
		
	
	}

	/**
	 * Run the TouchEvent(Type,float,float,float,float) constructor test.
	 * Testing the second constructor and the type set to DoubleTap
	 * @throws Exception
	 *
	 */
	@Test
	public void testTouchEvent_2()
		throws Exception {
		TouchEvent.Type type = TouchEvent.Type.DOUBLETAP;
		float x = 1.0f;
		float y = 1.0f;
		float deltax = 1.0f;
		float deltay = 1.0f;

		TouchEvent result = new TouchEvent(type, x, y, deltax, deltay);

		
		assertNotNull(result);
		assertEquals(TouchEvent.Type.DOUBLETAP,result.getType());
		assertEquals(1.0f, result.getY(), 1.0f);
		assertEquals(1.0f, result.getX(), 1.0f);
		assertEquals("", result.getCharacters());
		assertEquals(0, result.getKeyCode());
		assertEquals(1.0f, result.getDeltaX(), 1.0f);
		assertEquals(1.0f, result.getDeltaY(), 1.0f);
		assertEquals(0.0f, result.getPressure(), 1.0f);
		assertEquals(0, result.getPointerId());
		assertEquals(0.0f, result.getScaleFactor(), 1.0f);
		assertEquals(0.0f, result.getScaleSpan(), 1.0f);
		assertEquals(0.0f, result.getDeltaScaleSpan(), 1.0f);
		assertEquals(false, result.isScaleSpanInProgress());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
	}

	/**
	 * Run the String getCharacters() method test.
	 * The gerCharacter method under test 
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetCharacters_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("hello123");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);
		
		String result = fixture.getCharacters();


		assertEquals("hello123", result);
	}

	/**
	 * Run the float getDeltaScaleSpan() method test.
	 * testing the setScaleSpan method
	 * @throws Exception
	 *
	
	 */
	@Test
	public void testGetDeltaScaleSpan_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		
		fixture.setDeltaScaleSpan(1.0f);
		
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getDeltaScaleSpan();

	
		assertEquals(1.0f, result, 0.1f);
	}
	/**
	 * Run the float getDeltaScaleSpan() method test.
	 * testing the setScaleSpan method with negative value
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetDeltaScaleSpan_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		
		fixture.setDeltaScaleSpan(-1.0f);
		
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getDeltaScaleSpan();

	
		assertEquals(-1.0f, result, 0.1f);
	}

	/**
	 * Run the float getDeltaX() method test.
	 * Test using getDeltaMethod 
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetDeltaX_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getDeltaX();


		assertEquals(1.0f, result, 0.1f);
	}
	/**
	 * Run the float getDeltaX() method test.
	 * Test using getDeltaMethod 
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetDeltaX_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getDeltaX();

		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getDeltaY() method test.
	 * Test using getDeltaY method 
	 * positive case
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetDeltaY_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getDeltaY();

		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the int getKeyCode() method test.
	 * Verify keycode
	 * positive case
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetKeyCode_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(45);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		int result = fixture.getKeyCode();

		assertEquals(45, result);
	}
	/**
	 * Run the int getKeyCode() method test.
	 * Verify keycode
	 * negative case
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetKeyCode_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(-45);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		int result = fixture.getKeyCode();

		assertEquals(-45, result);
	}
	/**
	 * Run the int getPointerId() method test.
	 * positive integer
	 * @throws Exception
	 */
	@Test
	public void testGetPointerId_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(34);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		int result = fixture.getPointerId();

		assertEquals(34, result);
	}
	/**
	 * Run the int getPointerId() method test.
	 * negative integer
	 * @throws Exception
	 */
	@Test
	public void testGetPointerId_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(-34);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		int result = fixture.getPointerId();

		assertEquals(-34, result);
	}

	/**
	 * Run the float getPressure() method test.
	 * Using postive float values
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetPressure_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(34.0f);
		fixture.setTime(1L);

		float result = fixture.getPressure();

		assertEquals(34.0f, result, 0.1f);
	}
	/**
	 * Run the float getPressure() method test.
	 * Using negative float values
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetPressure_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(-34.0f);
		fixture.setTime(1L);

		float result = fixture.getPressure();

		assertEquals(-34.0f, result, 0.1f);
	}
	/**
	 * Run the float getPressure() method test.
	 * Using large float values
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetPressure_3()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(3434.0f);
		fixture.setTime(1L);

		float result = fixture.getPressure();

		assertEquals(3434.0f, result, 0.1f);
	}

	/**
	 * Run the float getScaleFactor() method test.
	 * Using positive float value
	 * @throws Exception
	 */
	@Test
	public void testGetScaleFactor_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getScaleFactor();


		assertEquals(1.0f, result, 0.1f);
	}
	/**
	 * Run the float getScaleFactor() method test.
	 * Using negative float value
	 * @throws Exception
	 */
	@Test
	public void testGetScaleFactor_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(-1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getScaleFactor();


		assertEquals(-1.0f, result, 0.1f);
	}
	/**
	 * Run the float getScaleFactor() method test.
	 * Using large float value
	 * @throws Exception
	 */
	@Test
	public void testGetScaleFactor_3()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(111.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getScaleFactor();


		assertEquals(111.0f, result, 0.1f);
	}

	/**
	 * Run the float getScaleSpan() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetScaleSpan_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		
		fixture.setScaleSpan(1.0f);
		
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getScaleSpan();

		
		assertEquals(1.0f, result, 0.1f);
	}
	/**
	 * Run the float getScaleSpan() method test.
	 * negative float value
	 * @throws Exception
	 */
	@Test
	public void testGetScaleSpan_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		
		fixture.setScaleSpan(-1.0f);
		
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getScaleSpan();

		
		assertEquals(-1.0f, result, 0.1f);
	}
	/**
	 * Run the float getScaleSpan() method test.
	 * large float value
	 * @throws Exception
	 */
	@Test
	public void testGetScaleSpan_3()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		
		fixture.setScaleSpan(678.0f);
		
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getScaleSpan();

		
		assertEquals(678.0f, result, 0.1f);
	}
	/**
	 * Run the TouchEvent.Type getType() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		TouchEvent.Type result = fixture.getType();

		
		assertNotNull(result);
		assertEquals("DOUBLETAP", result.name());
		assertEquals("DOUBLETAP", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the float getX() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 2.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getX();

		
		assertEquals(2.0f, result, 0.1f);
	}

	/**
	 * Run the float getY() method test.
	 *
	 * @throws Exception
	 *
	
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 2.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		float result = fixture.getY();

		
		assertEquals(2.0f, result, 0.1f);
	}

	/**
	 * Run the boolean isScaleSpanInProgress() method test.
	 * using boolean value true
	 * @throws Exception
	 *
	 */
	@Test
	public void testIsScaleSpanInProgress_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		boolean result = fixture.isScaleSpanInProgress();

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isScaleSpanInProgress() method test.
	 * using boolean value false
	 * @throws Exception
	 *
	 */
	@Test
	public void testIsScaleSpanInProgress_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(false);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);

		boolean result = fixture.isScaleSpanInProgress();

		
		assertEquals(false, result);
	}

	/**
	 * Run the void set(Type) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSet_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);
		TouchEvent.Type type = TouchEvent.Type.DOUBLETAP;
		fixture.set(type);
		
		assertEquals(TouchEvent.Type.DOUBLETAP,fixture.getType());
	}

	/**
	 * Run the void set(Type,float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSet_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.set(TouchEvent.Type.DOUBLETAP, 1.0f, 1.0f, 1.0f, 1.0f);
		fixture.setScaleFactor(1.0f);
		fixture.setDeltaScaleSpan(1.0f);
		fixture.setPointerId(1);
		fixture.setScaleSpanInProgress(true);
		fixture.setKeyCode(1);
		fixture.setCharacters("");
		fixture.setScaleSpan(1.0f);
		fixture.setPressure(1.0f);
		fixture.setTime(1L);
		TouchEvent.Type type = TouchEvent.Type.DOUBLETAP;
		float x = 1.0f;
		float y = 1.0f;
		float deltax = 1.0f;
		float deltay = 1.0f;

		fixture.set(type, x, y, deltax, deltay);
		
		//verify that things are set
		assertEquals(1.0f,fixture.getX(), 0.1f);
		assertEquals(1.0f,fixture.getY(), 0.1f);
		assertEquals(1.0f, fixture.getDeltaX(), 0.1f);
		assertEquals(1.0f, fixture.getDeltaY(), 0.1f);
		assertEquals(TouchEvent.Type.DOUBLETAP,fixture.getType());
		
	}
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
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
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TouchEventTest.class);
	}
}