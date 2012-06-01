import org.junit.Test;
import static org.junit.Assert.*;

public class ElectionFraudDiv1Test {
	
	@Test
	public void test0() {
		int[] percentages = new int[] {33, 33, 33};
		assertEquals(3, new ElectionFraudDiv1().MinimumVoters(percentages));
	}
	
	@Test
	public void test1() {
		int[] percentages = new int[] {29, 29, 43};
		assertEquals(7, new ElectionFraudDiv1().MinimumVoters(percentages));
	}
	
	@Test
	public void test2() {
		int[] percentages = new int[] {12, 12, 12, 12, 12, 12, 12, 12};
		assertEquals(-1, new ElectionFraudDiv1().MinimumVoters(percentages));
	}
	
	@Test
	public void test3() {
		int[] percentages = new int[] {13, 13, 13, 13, 13, 13, 13, 13};
		assertEquals(8, new ElectionFraudDiv1().MinimumVoters(percentages));
	}
	
	@Test
	public void test4() {
		int[] percentages = new int[] {0, 1, 100};
		assertEquals(200, new ElectionFraudDiv1().MinimumVoters(percentages));
	}
	
	@Test
	public void test5() {
		int[] percentages = new int[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4};
		assertEquals(97, new ElectionFraudDiv1().MinimumVoters(percentages));
	}
}
