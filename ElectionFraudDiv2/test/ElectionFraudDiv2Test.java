import org.junit.Test;
import static org.junit.Assert.*;

public class ElectionFraudDiv2Test {
	
//	@Test
//	public void test0() {
//		int[] percentages = new int[] {100};
//		assertEquals("NO", new ElectionFraudDiv2().IsFraudulent(percentages));
//	}
//
//	@Test
//	public void test1() {
//		int[] percentages = new int[] {34, 34, 34};
//		assertEquals("YES", new ElectionFraudDiv2().IsFraudulent(percentages));
//	}
//
//	@Test
//	public void test2() {
//		int[] percentages = new int[] {12, 12, 12, 12, 12, 12, 12, 12};
//		assertEquals("YES", new ElectionFraudDiv2().IsFraudulent(percentages));
//	}
//
//	@Test
//	public void test3() {
//		int[] percentages = new int[] {13, 13, 13, 13, 13, 13, 13, 13};
//		assertEquals("NO", new ElectionFraudDiv2().IsFraudulent(percentages));
//	}
//
//	@Test
//	public void test4() {
//		int[] percentages = new int[] {0, 1, 100};
//		assertEquals("NO", new ElectionFraudDiv2().IsFraudulent(percentages));
//	}
	
	@Test
	public void test5() {
		int[] percentages = new int[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8};
		assertEquals("NO", new ElectionFraudDiv2().IsFraudulent(percentages));
	}
}
