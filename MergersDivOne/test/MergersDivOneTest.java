import org.junit.Test;
import static org.junit.Assert.*;

public class MergersDivOneTest {
	
//	@Test
//	public void test0() {
//		int[] revenues = new int[] {5, -7, 3};
//		assertEquals(1.5, new MergersDivOne().findMaximum(revenues), 1e-9);
//	}
//
//	@Test
//	public void test1() {
//		int[] revenues = new int[] {10, -17};
//		assertEquals(-3.5, new MergersDivOne().findMaximum(revenues), 1e-9);
//	}
//
//	@Test
//	public void test2() {
//		int[] revenues = new int[] {12, 12, 12, 12, 12};
//		assertEquals(12.0, new MergersDivOne().findMaximum(revenues), 1e-9);
//	}
//
//	@Test
//	public void test3() {
//		int[] revenues = new int[] {0, 0, 0, 0, 0, 100};
//		assertEquals(50.0, new MergersDivOne().findMaximum(revenues), 1e-9);
//	}
	
	@Test
	public void test4() {
		int[] revenues = new int[] {10, -10, 100, -100, 1000, -1000};
		assertEquals(491.25, new MergersDivOne().findMaximum(revenues), 1e-9);
	}
}
