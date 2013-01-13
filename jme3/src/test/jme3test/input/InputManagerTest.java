package jme3test.input;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.cursors.plugins.JmeCursor;
import com.jme3.input.InputManager;
import com.jme3.input.JoyInput;
import com.jme3.input.Joystick;
import com.jme3.input.JoystickButton;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.RawInputListener;
import com.jme3.input.TouchInput;
import com.jme3.input.controls.InputListener;
import com.jme3.input.controls.Trigger;
import com.jme3.input.event.InputEvent;
import com.jme3.input.event.JoyAxisEvent;
import com.jme3.input.event.JoyButtonEvent;
import com.jme3.input.event.KeyInputEvent;
import com.jme3.input.event.MouseButtonEvent;
import com.jme3.input.event.MouseMotionEvent;
import com.jme3.input.event.TouchEvent;
import com.jme3.math.Vector2f;

/**
 * The class <code>InputManagerTest</code> contains tests for the class <code>{@link InputManager}</code>.
 *
 *
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class InputManagerTest {
	
	/**
	 * An instance of the class being tested.
	 *
	 * @see InputManager
	 *
	 *
	 */
	private InputManager fixture;
	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see InputManager
	 *
	 *
	 */
	public InputManager getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		}
		return fixture;
	}
	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testUpdate_fixture_1()
		throws Exception {
		
		KeyInput fixtureKeyInput = EasyMock.createNiceMock(KeyInput.class);
		InputManager fixtureInputManager = new InputManager(EasyMock.createNiceMock(MouseInput.class), fixtureKeyInput, EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		InputManager fixture2 = getFixture();
		float tpf = -0.985f;
		
		EasyMock.expect(fixtureKeyInput.getInputTimeNanos()).andReturn(1L);
		EasyMock.replay(fixtureInputManager);
		fixtureInputManager.update(tpf);
		EasyMock.verify(fixtureInputManager);
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testUpdate_fixture_2()
		throws Exception {
		InputManager fixture2 = getFixture();
		float tpf = 0.015f;
		
		EasyMock.expect(EasyMock.createNiceMock(KeyInput.class).getInputTimeNanos()).andReturn(EasyMock.anyLong());

		fixture2.update(tpf);
		
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
		new org.junit.runner.JUnitCore().run(InputManagerTest.class);
	}
}