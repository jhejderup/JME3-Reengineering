

import org.junit.*;

import com.jme3.input.event.MouseButtonEvent;

import static org.junit.Assert.*;

/**
 * The class <code>MouseButtonEventTest</code> contains tests for the class <code>{@link MouseButtonEvent}</code>.
 *
 * TODO: Add more test cases for different scenarios 
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class MouseButtonEventTest {
	/**
	 * Run the MouseButtonEvent(int,boolean,int,int) constructor test.
	 * Test default constructor
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testMouseButtonEvent_1()
		throws Exception {
		int btnIndex = 1;
		boolean pressed = true;
		int x = 1;
		int y = 1;

		MouseButtonEvent result = new MouseButtonEvent(btnIndex, pressed, x, y);

		
		assertNotNull(result);
		assertEquals("MouseButton(BTN=1, PRESSED)", result.toString());
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(true, result.isPressed());
		assertEquals(false, result.isReleased());
		assertEquals(1, result.getButtonIndex());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
	}

	/**
	 * Run the int getButtonIndex() method test.
	 * Check button index
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetButtonIndex_1()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(2, true, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getButtonIndex();

		
		assertEquals(2, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, 5, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getX();

		
		assertEquals(5, result);
	}
	/**
	 * Run the int getX() method test.
	 * Negative test case
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetX_2()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, -5, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getX();

		
		assertEquals(-5, result);
	}
	
	
	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, 1, 10);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getY();

		
		assertEquals(10, result);
	}
	/**
	 * Run the int getY() method test.
	 * Negative case
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetY_2()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, 1, -10);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getY();

		
		assertEquals(-10, result);
	}
	
	
	/**
	 * Run the boolean isPressed() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPressed_1()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isPressed();

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPressed() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsPressed_2()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, false, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isPressed();

		
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isReleased() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsReleased_1()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, false, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isReleased();

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isReleased() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsReleased_2()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isReleased();

		
		assertEquals(false, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, true, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		String result = fixture.toString();

		
		assertEquals("MouseButton(BTN=1, PRESSED)", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testToString_2()
		throws Exception {
		MouseButtonEvent fixture = new MouseButtonEvent(1, false, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		String result = fixture.toString();

		
		assertEquals("MouseButton(BTN=1, RELEASED)", result);
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
	
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MouseButtonEventTest.class);
	}
}