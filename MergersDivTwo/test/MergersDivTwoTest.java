import org.junit.Test;
import static org.junit.Assert.*;

public class MergersDivTwoTest {
	
	@Test
	public void test0() {
		int[] revenues = new int[] {5, -7, 3};
		int k = 2;
		assertEquals(1.5, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] revenues = new int[] {5, -7, 3};
		int k = 3;
		assertEquals(0.3333333333333333, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] revenues = new int[] {1, 2, 2, 3, -10, 7};
		int k = 3;
		assertEquals(2.9166666666666665, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] revenues = new int[] {-10, -651, -950, -576, -44, -951, -10, -46, -86, -650, -990, -950, 64, -18, 31, -7, 85, -48, -652, -39, -957, -650, -777, 6, 8, 1, 546, -350, -349, 247, -2, -8, -31, -47, -956, -657, -947, 97, -947, 494, -53, -653, 9, -47, -352};

		int k = 6;
		assertEquals(247.798616894746, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test4() {
		int[] revenues = new int[] {869, 857, -938, -290, 79, -901, 32, -907, 256, -167, 510, -965, -826, 808, 890,
 -233, -881, 255, -709, 506, 334, -184, 726, -406, 204, -912, 325, -445, 440, -368};
		int k = 7;
		assertEquals(706.0369290573373, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
}
