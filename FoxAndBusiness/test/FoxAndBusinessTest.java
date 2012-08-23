import org.junit.Test;
import static org.junit.Assert.*;

public class FoxAndBusinessTest {
	
	@Test
	public void test0() {
		int K = 1;
		int totalWork = 10;
		int[] a = new int[] {10};
		int[] p = new int[] {20};
		assertEquals(3800.0, new FoxAndBusiness().minimumCost(K, totalWork, a, p), 1e-9);
	}
	
	@Test
	public void test1() {
		int K = 1;
		int totalWork = 100;
		int[] a = new int[] {50, 60};
		int[] p = new int[] {1000, 2000};
		assertEquals(107200.0, new FoxAndBusiness().minimumCost(K, totalWork, a, p), 1e-9);
	}
	
	@Test
	public void test2() {
		int K = 2;
		int totalWork = 300;
		int[] a = new int[] {10, 20, 47};
		int[] p = new int[] {15, 20, 98765};
		assertEquals(77500.0, new FoxAndBusiness().minimumCost(K, totalWork, a, p), 1e-9);
	}
	
	@Test
	public void test3() {
		int K = 4;
		int totalWork = 1000;
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] p = new int[] {20, 30, 40, 58, 60, 70, 80, 90, 100, 150};
		assertEquals(531764.705882353, new FoxAndBusiness().minimumCost(K, totalWork, a, p), 1e-9);
	}
}
