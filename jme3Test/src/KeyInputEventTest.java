

import org.junit.*;

import com.jme3.input.event.KeyInputEvent;

import static org.junit.Assert.*;

/**
 * The class <code>KeyInputEventTest</code> contains tests for the class <code>{@link KeyInputEvent}</code>.
 *
 * TODO: test onEvent and extend with more tests
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class KeyInputEventTest {
	/**
	 * Run the KeyInputEvent(int,char,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testKeyInputEvent_1()
		throws Exception {
		int keyCode = 1;
		char keyChar = '';
		boolean pressed = true;
		boolean repeating = true;

		KeyInputEvent result = new KeyInputEvent(keyCode, keyChar, pressed, repeating);

		
		assertNotNull(result);
		assertEquals("Key(CODE=1, CHAR=, REPEATING)", result.toString());
		assertEquals(true, result.isPressed());
		assertEquals('', result.getKeyChar());
		assertEquals(1, result.getKeyCode());
		assertEquals(true, result.isRepeating());
		assertEquals(false, result.isReleased());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
	}

	/**
	 * Run the char getKeyChar() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetKeyChar_1()
		throws Exception {
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, true);
		fixture.setTime(1L);
		fixture.setConsumed();

		char result = fixture.getKeyChar();

		
		assertEquals('', result);
	}

	/**
	 * Run the int getKeyCode() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetKeyCode_1()
		throws Exception {
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, true);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getKeyCode();

		
		assertEquals(1, result);
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
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, true);
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
		KeyInputEvent fixture = new KeyInputEvent(1, '', false, true);
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
		KeyInputEvent fixture = new KeyInputEvent(1, '', false, true);
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
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, true);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isReleased();

		
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRepeating() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsRepeating_1()
		throws Exception {
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, true);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isRepeating();

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isRepeating() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsRepeating_2()
		throws Exception {
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, false);
		fixture.setTime(1L);
		fixture.setConsumed();

		boolean result = fixture.isRepeating();

		
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
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, true);
		fixture.setTime(1L);
		fixture.setConsumed();

		String result = fixture.toString();

		
		assertEquals("Key(CODE=1, CHAR=, REPEATING)", result);
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
		KeyInputEvent fixture = new KeyInputEvent(1, '', true, false);
		fixture.setTime(1L);
		fixture.setConsumed();

		String result = fixture.toString();

		
		assertEquals("Key(CODE=1, CHAR=, PRESSED)", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testToString_3()
		throws Exception {
		KeyInputEvent fixture = new KeyInputEvent(1, ' ', false, false);
		fixture.setTime(1L);
		fixture.setConsumed();

		String result = fixture.toString();

		
		assertEquals("Key(CODE=1, RELEASED)", result);
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
		new org.junit.runner.JUnitCore().run(KeyInputEventTest.class);
	}
}