package com.jme3.input;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.app.AndroidHarness;
import jme3test.helloworld.HelloCollision;
import android.content.Context;
import com.jme3.cursors.plugins.JmeCursor;
import com.jme3.input.android.AndroidInput;
import android.view.View;
import com.jme3.input.controls.InputListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.Trigger;
import com.jme3.input.event.InputEvent;
import com.jme3.input.event.JoyAxisEvent;
import com.jme3.input.event.JoyButtonEvent;
import com.jme3.input.event.KeyInputEvent;
import com.jme3.input.event.MouseButtonEvent;
import com.jme3.input.event.MouseMotionEvent;
import com.jme3.input.event.TouchEvent;
import com.jme3.input.jogl.NewtKeyInput;
import com.jme3.input.jogl.NewtMouseInput;
import com.jme3.input.lwjgl.JInputJoyInput;
import com.jme3.math.Vector2f;

/**
 * The class <code>InputManagerTest</code> contains tests for the class <code>{@link InputManager}</code>.
 *
 * @generatedBy CodePro at 2013-01-14 00:01
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class InputManagerTest {

	/**
	 * Run the void update(float) method test.
	 * In order to run this test the onMouseButtenEvent method
	 * needs have this on: eventPermitted=true;
	 * it won't otherwise permit this call
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-14 00:01
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		InputManager fixture = new InputManager(new NewtMouseInput(), new NewtKeyInput(), null, null);
		fixture.update(1.0f);
		fixture.setAxisDeadZone(1.0f);
		fixture.onMouseButtonEvent(new MouseButtonEvent(1, true, 1, 1));
		fixture.addRawInputListener(new InputManager(new NewtMouseInput(), new NewtKeyInput(), null, null));
		float tpf = 1.0f;

		fixture.update(tpf);

		
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-14 00:01
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
	 * @generatedBy CodePro at 2013-01-14 00:01
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
	 * @generatedBy CodePro at 2013-01-14 00:01
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InputManagerTest.class);
	}
}