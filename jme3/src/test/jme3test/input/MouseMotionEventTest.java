package jme3test.input;

import org.easymock.classextension.EasyMock;
import org.junit.*;

import com.jme3.input.RawInputListener;
import com.jme3.input.event.MouseMotionEvent;

import static org.junit.Assert.*;

/**
 * The class <code>MouseMotionEventTest</code> contains tests for the class <code>{@link MouseMotionEvent}</code>.
 * TODO: More tests needs to be added to test different scenarios like negative cases
 * @author Joseph
 * @version $Revision: 1.0 $
 */
public class MouseMotionEventTest {
	/**
	 * Run the MouseMotionEvent(int,int,int,int,int,int) constructor test.
	 * Test the default constructor
	 * @throws Exception
	 *
	 */
	@Test
	public void testMouseMotionEvent_1()
		throws Exception {
		int x = 1;
		int y = 1;
		int dx = 1;
		int dy = 1;
		int wheel = 1;
		int deltaWheel = 1;

		MouseMotionEvent result = new MouseMotionEvent(x, y, dx, dy, wheel, deltaWheel);

		
		assertNotNull(result);
		assertEquals("MouseMotion(X=1, Y=1, DX=1, DY=1)", result.toString());
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getDX());
		assertEquals(1, result.getDY());
		assertEquals(1, result.getDeltaWheel());
		assertEquals(1, result.getWheel());
		assertEquals(0L, result.getTime());
		assertEquals(false, result.isConsumed());
	}

	/**
	 * Run the int getDX() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetDX_1()
		throws Exception {
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getDX();

		
		assertEquals(1, result);
	}

	/**
	 * Run the int getDY() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetDY_1()
		throws Exception {
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getDY();

		
		assertEquals(1, result);
	}

	/**
	 * Run the int getDeltaWheel() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetDeltaWheel_1()
		throws Exception {
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getDeltaWheel();

		
		assertEquals(1, result);
	}

	/**
	 * Run the int getWheel() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetWheel_1()
		throws Exception {
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getWheel();

		
		assertEquals(1, result);
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
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getX();

		
		assertEquals(1, result);
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
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		int result = fixture.getY();

		
		assertEquals(1, result);
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
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		String result = fixture.toString();

		
		assertEquals("MouseMotion(X=1, Y=1, DX=1, DY=1)", result);
	}
	
	/**
	 * Run the void OnEvent() method test.
	 * TODO: complete the mocking so tha we see that the call to
	 *  onMouseMotionEvent is called(void)
	 * @throws Exception
	 */
	@Test
	public void testOnEvent_1()
	throws Exception {
		
		MouseMotionEvent fixture = new MouseMotionEvent(1, 1, 1, 1, 1, 1);
		fixture.setTime(1L);
		fixture.setConsumed();

		RawInputListener listener = EasyMock.createNiceMock(RawInputListener.class);
	
		
		fixture.onEvent(listener);

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
		new org.junit.runner.JUnitCore().run(MouseMotionEventTest.class);
	}
}