package jme3test.input;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.input.JoystickButton;
import com.jme3.input.event.JoyButtonEvent;

/**
 * The class <code>JoyButtonEventTest</code> contains tests for the class <code>{@link JoyButtonEvent}</code>.
 *
 *
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class JoyButtonEventTest {
	/**
	 * Run the JoyButtonEvent(JoystickButton,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testJoyButtonEvent_1()
		throws Exception {
		JoystickButton button = EasyMock.createMock(JoystickButton.class);
		boolean pressed = true;
		

		EasyMock.replay(button);

		JoyButtonEvent result = new JoyButtonEvent(button, pressed);

		
		EasyMock.verify(button);
		assertNotNull(result);
		assertEquals(true, result.isPressed());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
	}

	/**
	 * Run the JoystickButton getButton() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetButton_1()
		throws Exception {
		JoyButtonEvent fixture = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true);
		fixture.setConsumed();
		fixture.setTime(1L);

		JoystickButton result = fixture.getButton();

		
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the int getButtonIndex() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetButtonIndex_1()
		throws Exception {
		JoyButtonEvent fixture = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true);
		fixture.setConsumed();
		fixture.setTime(1L);

		int result = fixture.getButtonIndex();

		
		assertEquals(0, result);
	}

	/**
	 * Run the int getJoyIndex() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetJoyIndex_1()
		throws Exception {
		JoyButtonEvent fixture = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true);
		fixture.setConsumed();
		fixture.setTime(1L);

		int result = fixture.getJoyIndex();

		assertEquals(0, result);
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
		JoyButtonEvent fixture = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true);
		fixture.setConsumed();
		fixture.setTime(1L);

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
		JoyButtonEvent fixture = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), false);
		fixture.setConsumed();
		fixture.setTime(1L);

		boolean result = fixture.isPressed();

		
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(JoyButtonEventTest.class);
	}
}