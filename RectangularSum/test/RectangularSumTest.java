import org.junit.Test;
import static org.junit.Assert.*;

public class RectangularSumTest {
	
	@Test
	public void test0() {
		int height = 2;
		int width = 3;
		long S = 8L;
		assertEquals(4L, new RectangularSum().minimalArea(height, width, S));
	}

	@Test
	public void test1() {
		int height = 3;
		int width = 3;
		long S = 10L;
		assertEquals(-1L, new RectangularSum().minimalArea(height, width, S));
	}

	@Test
	public void test2() {
		int height = 3;
		int width = 3;
		long S = 36L;
		assertEquals(9L, new RectangularSum().minimalArea(height, width, S));
	}

	@Test
	public void test3() {
		int height = 25;
		int width = 25;
		long S = 16000L;
		assertEquals(32L, new RectangularSum().minimalArea(height, width, S));
	}

	@Test
	public void test4() {
		int height = 1000000;
		int width = 1000000;
		long S = 1L<<40;
		assertEquals(2L, new RectangularSum().minimalArea(height, width, S));
	}
}
