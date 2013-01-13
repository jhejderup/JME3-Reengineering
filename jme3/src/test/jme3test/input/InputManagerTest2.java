package jme3test.input;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.cursors.plugins.JmeCursor;
import com.jme3.input.InputManager;
import com.jme3.input.JoyInput;
import com.jme3.input.Joystick;
import com.jme3.input.JoystickAxis;
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
 * @generatedBy CodePro at 2013-01-12 20:45
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class InputManagerTest2 {
	/**
	 * Run the InputManager(MouseInput,KeyInput,JoyInput,TouchInput) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testInputManager_1()
		throws Exception {
		MouseInput mouse = EasyMock.createNiceMock(MouseInput.class);
		KeyInput keys = EasyMock.createNiceMock(KeyInput.class);
		JoyInput joystick = EasyMock.createNiceMock(JoyInput.class);
		TouchInput touch = EasyMock.createNiceMock(TouchInput.class);
		// add mock object expectations here

		EasyMock.replay(mouse);
		EasyMock.replay(keys);
		EasyMock.replay(joystick);
		EasyMock.replay(touch);

		InputManager result = new InputManager(mouse, keys, joystick, touch);

		// add additional test code here
		EasyMock.verify(mouse);
		EasyMock.verify(keys);
		EasyMock.verify(joystick);
		EasyMock.verify(touch);
		assertNotNull(result);
		assertEquals(0.05f, result.getAxisDeadZone(), 1.0f);
		assertEquals(true, result.isCursorVisible());
		assertEquals(null, result.getJoysticks());
		assertEquals(false, result.getSimulateMouse());
	}

	/**
	 * Run the InputManager(MouseInput,KeyInput,JoyInput,TouchInput) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testInputManager_2()
		throws Exception {
		MouseInput mouse = EasyMock.createNiceMock(MouseInput.class);
		KeyInput keys = EasyMock.createNiceMock(KeyInput.class);
		JoyInput joystick = null;
		TouchInput touch = EasyMock.createNiceMock(TouchInput.class);
		// add mock object expectations here

		EasyMock.replay(mouse);
		EasyMock.replay(keys);
		EasyMock.replay(touch);

		InputManager result = new InputManager(mouse, keys, joystick, touch);

		// add additional test code here
		EasyMock.verify(mouse);
		EasyMock.verify(keys);
		EasyMock.verify(touch);
		assertNotNull(result);
		assertEquals(0.05f, result.getAxisDeadZone(), 1.0f);
		assertEquals(true, result.isCursorVisible());
		assertEquals(null, result.getJoysticks());
		assertEquals(false, result.getSimulateMouse());
	}

	/**
	 * Run the InputManager(MouseInput,KeyInput,JoyInput,TouchInput) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testInputManager_3()
		throws Exception {
		MouseInput mouse = EasyMock.createNiceMock(MouseInput.class);
		KeyInput keys = EasyMock.createNiceMock(KeyInput.class);
		JoyInput joystick = EasyMock.createNiceMock(JoyInput.class);
		TouchInput touch = null;
		// add mock object expectations here

		EasyMock.replay(mouse);
		EasyMock.replay(keys);
		EasyMock.replay(joystick);

		InputManager result = new InputManager(mouse, keys, joystick, touch);

		// add additional test code here
		EasyMock.verify(mouse);
		EasyMock.verify(keys);
		EasyMock.verify(joystick);
		assertNotNull(result);
		assertEquals(0.05f, result.getAxisDeadZone(), 1.0f);
		assertEquals(true, result.isCursorVisible());
		assertEquals(null, result.getJoysticks());
		assertEquals(false, result.getSimulateMouse());
	}

	/**
	 * Run the InputManager(MouseInput,KeyInput,JoyInput,TouchInput) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testInputManager_4()
		throws Exception {
		MouseInput mouse = EasyMock.createNiceMock(MouseInput.class);
		KeyInput keys = EasyMock.createNiceMock(KeyInput.class);
		JoyInput joystick = null;
		TouchInput touch = null;
		// add mock object expectations here

		EasyMock.replay(mouse);
		EasyMock.replay(keys);

		InputManager result = new InputManager(mouse, keys, joystick, touch);

		// add additional test code here
		EasyMock.verify(mouse);
		EasyMock.verify(keys);
		assertNotNull(result);
		assertEquals(0.05f, result.getAxisDeadZone(), 1.0f);
		assertEquals(true, result.isCursorVisible());
		assertEquals(null, result.getJoysticks());
		assertEquals(false, result.getSimulateMouse());
	}

	/**
	 * Run the InputManager(MouseInput,KeyInput,JoyInput,TouchInput) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testInputManager_5()
		throws Exception {
		MouseInput mouse = EasyMock.createNiceMock(MouseInput.class);
		KeyInput keys = null;
		JoyInput joystick = EasyMock.createNiceMock(JoyInput.class);
		TouchInput touch = EasyMock.createNiceMock(TouchInput.class);
		// add mock object expectations here

		EasyMock.replay(mouse);
		EasyMock.replay(joystick);
		EasyMock.replay(touch);

		InputManager result = new InputManager(mouse, keys, joystick, touch);

		// add additional test code here
		EasyMock.verify(mouse);
		EasyMock.verify(joystick);
		EasyMock.verify(touch);
		assertNotNull(result);
	}

	/**
	 * Run the InputManager(MouseInput,KeyInput,JoyInput,TouchInput) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testInputManager_6()
		throws Exception {
		MouseInput mouse = null;
		KeyInput keys = EasyMock.createNiceMock(KeyInput.class);
		JoyInput joystick = EasyMock.createNiceMock(JoyInput.class);
		TouchInput touch = EasyMock.createNiceMock(TouchInput.class);
		// add mock object expectations here

		EasyMock.replay(keys);
		EasyMock.replay(joystick);
		EasyMock.replay(touch);

		InputManager result = new InputManager(mouse, keys, joystick, touch);

		// add additional test code here
		EasyMock.verify(keys);
		EasyMock.verify(joystick);
		EasyMock.verify(touch);
		assertNotNull(result);
	}

	/**
	 * Run the void addListener(InputListener,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddListener_1()
		throws Exception {
		KeyInput keys = EasyMock.createNiceMock(KeyInput.class);
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), keys, EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		
	//	EasyMock.expect(keys.getInputTimeNanos()).andReturn((Long) EasyMock.anyObject()).anyTimes();
	//	EasyMock.expectLastCall();
	//	EasyMock.replay(keys);
		
	//	//fixture.update(1.0f);
		
	//EasyMock.verify(keys);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.addListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addListener(InputListener,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddListener_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
//		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
//		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.addListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addListener(InputListener,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddListener_3()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
//		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.addListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addListener(InputListener,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddListener_4()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.addListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addListener(InputListener,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddListener_5()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.addListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
//		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
//		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_3()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_4()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
//		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_5()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_6()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_7()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_8()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_9()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
	//	//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addMapping(String,Trigger[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddMapping_10()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
	//	//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
//		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		fixture.addMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void addRawInputListener(RawInputListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testAddRawInputListener_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		RawInputListener listener = EasyMock.createMock(RawInputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.addRawInputListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void beginInput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testBeginInput_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		fixture.beginInput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void clearMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testClearMappings_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		fixture.clearMappings();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void clearRawInputListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testClearRawInputListeners_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));

		fixture.clearRawInputListeners();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void deleteMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testDeleteMapping_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

	//fixture.deleteMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void deleteMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testDeleteMapping_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

	//	fixture.deleteMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void deleteMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testDeleteMapping_3()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

	//	fixture.deleteMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void deleteTrigger(String,Trigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testDeleteTrigger_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";
		Trigger trigger = EasyMock.createMock(Trigger.class);
		// add mock object expectations here

		EasyMock.replay(trigger);

	//	fixture.deleteTrigger(mappingName, trigger);

		// add additional test code here
		EasyMock.verify(trigger);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void deleteTrigger(String,Trigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testDeleteTrigger_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";
		Trigger trigger = EasyMock.createMock(Trigger.class);
		// add mock object expectations here

		EasyMock.replay(trigger);

//		fixture.deleteTrigger(mappingName, trigger);

		// add additional test code here
		EasyMock.verify(trigger);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void endInput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testEndInput_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		fixture.endInput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the float getAxisDeadZone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testGetAxisDeadZone_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		float result = fixture.getAxisDeadZone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the Vector2f getCursorPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testGetCursorPosition_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		Vector2f result = fixture.getCursorPosition();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertNotNull(result);
	}

	/**
	 * Run the Joystick[] getJoysticks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testGetJoysticks_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		Joystick[] result = fixture.getJoysticks();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getSimulateMouse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testGetSimulateMouse_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		boolean result = fixture.getSimulateMouse();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertTrue(result);
	}

	/**
	 * Run the boolean getSimulateMouse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testGetSimulateMouse_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		boolean result = fixture.getSimulateMouse();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testHasMapping_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		boolean result = fixture.hasMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testHasMapping_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		String mappingName = "";

		boolean result = fixture.hasMapping(mappingName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertTrue(result);
	}

	/**
	 * Run the boolean isCursorVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testIsCursorVisible_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		boolean result = fixture.isCursorVisible();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertTrue(result);
	}

	/**
	 * Run the boolean isCursorVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testIsCursorVisible_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		boolean result = fixture.isCursorVisible();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
		assertTrue(result);
	}

	/**
	 * Run the void onJoyAxisEvent(JoyAxisEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnJoyAxisEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		JoyAxisEvent evt = new JoyAxisEvent(EasyMock.createNiceMock(JoystickAxis.class), 1.0f);

		//fixture.onJoyAxisEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onJoyAxisEvent(JoyAxisEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnJoyAxisEvent_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		JoyAxisEvent evt = new JoyAxisEvent(EasyMock.createNiceMock(JoystickAxis.class), 1.0f);

		//fixture.onJoyAxisEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onJoyButtonEvent(JoyButtonEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnJoyButtonEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		JoyButtonEvent evt = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true);

		//fixture.onJoyButtonEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onJoyButtonEvent(JoyButtonEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnJoyButtonEvent_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		JoyButtonEvent evt = new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true);

		//fixture.onJoyButtonEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onKeyEvent(KeyInputEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnKeyEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		KeyInputEvent evt = new KeyInputEvent(1, '', true, true);

		//fixture.onKeyEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onKeyEvent(KeyInputEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnKeyEvent_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		KeyInputEvent evt = new KeyInputEvent(1, '', true, true);

		//fixture.onKeyEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onMouseButtonEvent(MouseButtonEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnMouseButtonEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		MouseButtonEvent evt = new MouseButtonEvent(1, true, 1, 1);

		// fixture.onMouseButtonEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onMouseButtonEvent(MouseButtonEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnMouseButtonEvent_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		MouseButtonEvent evt = new MouseButtonEvent(1, true, 1, 1);

		// fixture.onMouseButtonEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onMouseMotionEvent(MouseMotionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnMouseMotionEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		MouseMotionEvent evt = new MouseMotionEvent(1, 1, 1, 1, 1, 1);

		//fixture.onMouseMotionEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onMouseMotionEvent(MouseMotionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnMouseMotionEvent_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		MouseMotionEvent evt = new MouseMotionEvent(1, 1, 1, 1, 1, 1);

		//fixture.onMouseMotionEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEvent(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();

		//fixture.onTouchEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEvent(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEvent_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();

		//fixture.onTouchEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEventQueued(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEventQueued_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();
		evt.setKeyCode(1);

		fixture.onTouchEventQueued(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEventQueued(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEventQueued_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();
		evt.setKeyCode(1);

		fixture.onTouchEventQueued(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEventQueued(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEventQueued_3()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();
		evt.setKeyCode(1);

		fixture.onTouchEventQueued(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEventQueued(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEventQueued_4()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();
		evt.setKeyCode(1);

		fixture.onTouchEventQueued(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void onTouchEventQueued(TouchEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testOnTouchEventQueued_5()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		TouchEvent evt = new TouchEvent();
		evt.setKeyCode(1);

		fixture.onTouchEventQueued(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void removeListener(InputListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testRemoveListener_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.removeListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void removeListener(InputListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testRemoveListener_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputListener listener = EasyMock.createMock(InputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.removeListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void removeRawInputListener(RawInputListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testRemoveRawInputListener_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		RawInputListener listener = EasyMock.createMock(RawInputListener.class);
		// add mock object expectations here

		EasyMock.replay(listener);

		fixture.removeRawInputListener(listener);

		// add additional test code here
		EasyMock.verify(listener);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testReset_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));

		fixture.reset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void setAxisDeadZone(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSetAxisDeadZone_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		float deadZone = 1.0f;

		fixture.setAxisDeadZone(deadZone);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void setCursorVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSetCursorVisible_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		boolean visible = true;

		fixture.setCursorVisible(visible);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void setCursorVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSetCursorVisible_2()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		boolean visible = true;

		fixture.setCursorVisible(visible);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void setMouseCursor(JmeCursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSetMouseCursor_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		JmeCursor jmeCursor = new JmeCursor();

		fixture.setMouseCursor(jmeCursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void setSimulateKeyboard(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSetSimulateKeyboard_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		boolean value = true;

		fixture.setSimulateKeyboard(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void setSimulateMouse(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSetSimulateMouse_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		boolean value = true;

		fixture.setSimulateMouse(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void simulateEvent(InputEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testSimulateEvent_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		InputEvent evt = new TouchEvent();

		fixture.simulateEvent(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		InputManager fixture = new InputManager(EasyMock.createNiceMock(MouseInput.class), EasyMock.createNiceMock(KeyInput.class), EasyMock.createNiceMock(JoyInput.class), EasyMock.createNiceMock(TouchInput.class));
		//fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		//fixture.onJoyButtonEvent(new JoyButtonEvent(EasyMock.createNiceMock(JoystickButton.class), true));
		fixture.addRawInputListener(EasyMock.createNiceMock(RawInputListener.class));
		float tpf = 1.0f;

		// fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call getInputTimeNanos()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at $Proxy82.getInputTimeNanos(Unknown Source)
		//       at com.jme3.input.InputManager.update(InputManager.java:870)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-12 20:45
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
	 * @generatedBy CodePro at 2013-01-12 20:45
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
	 * @generatedBy CodePro at 2013-01-12 20:45
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InputManagerTest.class);
	}
}