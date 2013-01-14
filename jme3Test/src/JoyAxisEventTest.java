

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.input.JoystickAxis;
import com.jme3.input.event.JoyAxisEvent;

/**
 * The class <code>JoyAxisEventTest</code> contains tests for the class <code>{@link JoyAxisEvent}</code>.
 *
*
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class JoyAxisEventTest {
	/**
	 * Run the JoyAxisEvent(JoystickAxis,float) constructor test.
	 *
	 * @throws Exception
	 *
	*
	 */
	@Test
	public void testJoyAxisEvent_1()
		throws Exception {
		JoystickAxis axis = EasyMock.createNiceMock(JoystickAxis.class);
		float value = 1.0f;
		

	//	EasyMock.replay(axis);

		JoyAxisEvent result = new JoyAxisEvent(axis, value);
//		EasyMock.expect(result.getAxisIndex()).andReturn(0);
		
		
	//	EasyMock.verify(axis);
		
		assertNotNull(result);
		assertEquals(1.0f, result.getValue(), 1.0f);
		assertEquals(0, result.getAxisIndex());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
	}

	/**
	 * Run the JoystickAxis getAxis() method test.
	 *
	 * @throws Exception
	 *
	*
	 */
	@Test
	public void testGetAxis_1()
		throws Exception {
		JoyAxisEvent fixture = new JoyAxisEvent(EasyMock.createNiceMock(JoystickAxis.class), 1.0f);
		fixture.setConsumed();
		fixture.setTime(1L);

		JoystickAxis result = fixture.getAxis();

		
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the int getAxisIndex() method test.
	 *
	 * @throws Exception
	 *
	*
	 */
	@Test
	public void testGetAxisIndex_1()
		throws Exception {
		JoyAxisEvent fixture = new JoyAxisEvent(EasyMock.createNiceMock(JoystickAxis.class), 1.0f);
		fixture.setConsumed();
		fixture.setTime(1L);

		int result = fixture.getAxisIndex();

		
		assertEquals(0, result);
	}

	/**
	 * Run the int getJoyIndex() method test.
	 *
	 * @throws Exception
	 *
	 * Not working, there is no current wat of setting the joyindex
	 */
	/*@Test
	public void testGetJoyIndex_1()
		throws Exception {
		JoyAxisEvent fixture = new JoyAxisEvent(EasyMock.createNiceMock(JoystickAxis.class), 1.0f);
		fixture.setConsumed();
		fixture.setTime(1L);

	
		
		int result = fixture.getJoyIndex();

		assertEquals(0, result);
	}*/

	/**
	 * Run the float getValue() method test.
	 *
	 * @throws Exception
	 *
	*
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		JoyAxisEvent fixture = new JoyAxisEvent(EasyMock.createNiceMock(JoystickAxis.class), 1.0f);
		fixture.setConsumed();
		fixture.setTime(1L);

		float result = fixture.getValue();

		
		assertEquals(1.0f, result, 0.1f);
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
		new org.junit.runner.JUnitCore().run(JoyAxisEventTest.class);
	}
}