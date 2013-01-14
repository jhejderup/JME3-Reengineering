

import org.junit.*;

import com.jme3.input.event.InputEvent;
import com.jme3.input.event.TouchEvent;

import static org.junit.Assert.*;

/**
 * The class <code>InputEventTest</code> contains tests for the class <code>{@link InputEvent}</code>.
 * In this case we have only used the TouchEvent class to test the code
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class InputEventTest {
	/**
	 *Run the long getTime() method test.
	 *Creates a new TouchEvent object and 
	 *sets the time to 1L
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetTime_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.setTime(1L);

		long result = fixture.getTime();
		assertEquals(1L, result);
	}
	/**
	 *Run the long getTime() method test.
	 *Creates a new TouchEvent object and 
	 *sets the time to -1L and it should pass
	 *but semantically it should fail
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetTime_2()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.setTime(-1L);

		long result = fixture.getTime();
		assertEquals(-1L, result);
	}

	/**
	 * Run the boolean isConsumed() method test.
	 * This method is used ing general for to indicate whether
	 * anevent has been handled or not
	 * @throws Exception
	 *
	 */
	@Test
	public void testIsConsumed_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.setTime(1L);

		boolean result = fixture.isConsumed();

		assertEquals(false, result);
	}
	/**
	 * Run the void setConsumed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 14:28
	 */
	@Test
	public void testSetConsumed_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.setTime(1L);

		fixture.setConsumed();

		assertEquals(true,fixture.isConsumed());
	}

	/**
	 * Run the void setTime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2013-01-13 14:28
	 */
	@Test
	public void testSetTime_1()
		throws Exception {
		TouchEvent fixture = new TouchEvent();
		fixture.setTime(1L);
		long time = 1L;

		fixture.setTime(time);

		assertEquals(1L,fixture.getTime());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2013-01-13 14:28
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
	 * @generatedBy CodePro at 2013-01-13 14:28
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
	 * @generatedBy CodePro at 2013-01-13 14:28
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InputEventTest.class);
	}
}