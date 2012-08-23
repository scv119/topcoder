import org.junit.Test;
import static org.junit.Assert.*;

public class PillarsTest {
	
	@Test
	public void test0() {
		int w = 1;
		int x = 1;
		int y = 1;
		assertEquals(1.0, new Pillars().getExpectedLength(w, x, y), 1e-9);
	}

	@Test
	public void test1() {
		int w = 1;
		int x = 5;
		int y = 1;
		assertEquals(2.387132965131785, new Pillars().getExpectedLength(w, x, y), 1e-9);
	}

	@Test
	public void test2() {
		int w = 2;
		int x = 3;
		int y = 15;
		assertEquals(6.737191281760445, new Pillars().getExpectedLength(w, x, y), 1e-9);
	}
//
//	@Test
//	public void test3() {
//		int w = 100000;
//		int x = 100000;
//		int y = 100000;
//		assertEquals(12.988608956320535, new Pillars().getExpectedLength(w, x, y), 1e-9);
//	}
}
