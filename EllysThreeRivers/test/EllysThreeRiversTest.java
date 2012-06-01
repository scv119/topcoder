import org.junit.Test;
import static org.junit.Assert.*;

public class EllysThreeRiversTest {
	
	@Test
	public void test0() {
		int length = 10;
		int walk = 8;
		int[] width = new int[] {5, 2, 3};
		int[] swim = new int[] {5, 2, 7};
		assertEquals(3.2063518370413364, new EllysThreeRivers().getMin(length, walk, width, swim), 1e-9);
	}
	
	@Test
	public void test1() {
		int length = 1000;
		int walk = 100;
		int[] width = new int[] {91, 911, 85};
		int[] swim = new int[] {28, 97, 19};
		assertEquals(21.549321613601297, new EllysThreeRivers().getMin(length, walk, width, swim), 1e-9);
	}
	
	@Test
	public void test2() {
		int length = 666;
		int walk = 4;
		int[] width = new int[] {777, 888, 999};
		int[] swim = new int[] {11, 12, 13};
		assertEquals(228.26633673141083, new EllysThreeRivers().getMin(length, walk, width, swim), 1e-9);
	}
	
	@Test
	public void test3() {
		int length = 6;
		int walk = 100;
		int[] width = new int[] {2, 3, 4};
		int[] swim = new int[] {77, 88, 99};
		assertEquals(0.12049782476139667, new EllysThreeRivers().getMin(length, walk, width, swim), 1e-9);
	}
	
	@Test
	public void test4() {
		int length = 873;
		int walk = 54;
		int[] width = new int[] {444, 588, 263};
		int[] swim = new int[] {67, 97, 26};
		assertEquals(26.365540023205206, new EllysThreeRivers().getMin(length, walk, width, swim), 1e-9);
	}
}
