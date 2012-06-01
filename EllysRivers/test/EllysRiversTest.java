import org.junit.Test;
import static org.junit.Assert.*;

public class EllysRiversTest {
	
	@Test
	public void test0() {
		int length = 10;
		int walk = 3;
		int[] width = new int[] {5, 2, 3};
		int[] speed = new int[] {5, 2, 7};
		assertEquals(3.231651964071508, new EllysRivers().getMin(length, walk, width, speed), 1e-9);
	}
	
	@Test
	public void test1() {
		int length = 10000;
		int walk = 211;
		int[] width = new int[] {911};
		int[] speed = new int[] {207};
		assertEquals(48.24623664712219, new EllysRivers().getMin(length, walk, width, speed), 1e-9);
	}
	
	@Test
	public void test2() {
		int length = 1337;
		int walk = 2;
		int[] width = new int[] {100, 200, 300, 400};
		int[] speed = new int[] {11, 12, 13, 14};
		assertEquals(128.57830549575695, new EllysRivers().getMin(length, walk, width, speed), 1e-9);
	}
	
	@Test
	public void test3() {
		int length = 77;
		int walk = 119;
		int[] width = new int[] {11, 12, 13, 14};
		int[] speed = new int[] {100, 200, 300, 400};
		assertEquals(0.3842077071089629, new EllysRivers().getMin(length, walk, width, speed), 1e-9);
	}
	
	@Test
	public void test4() {
		int length = 7134;
		int walk = 1525;
		int[] width = new int[] {11567, 19763, 11026, 10444, 24588, 22263, 17709, 11181, 15292, 28895, 15039, 18744, 19985, 13795, 26697, 18812, 25655, 13620, 28926, 12393};
		int[] speed = new int[] {1620, 1477, 2837, 2590, 1692, 2270, 1655, 1078, 2683, 1475, 1383, 1153, 1862, 1770, 1671, 2318, 2197, 1768, 1979, 1057};
		assertEquals(214.6509731258811, new EllysRivers().getMin(length, walk, width, speed), 1e-9);
	}
}
