import org.junit.Test;
import static org.junit.Assert.*;

public class EllysFiveFriendsTest {
	
	@Test
	public void test0() {
		int[] numbers = new int[] {8792, 9483, 6787, 9856, 6205};
		assertEquals(165501353, new EllysFiveFriends().getZero(numbers));
	}
	
	@Test
	public void test1() {
		int[] numbers = new int[] {2, 1, 1, 1, 2};
		assertEquals(0, new EllysFiveFriends().getZero(numbers));
	}
	
	@Test
	public void test2() {
		int[] numbers = new int[] {3, 4, 1, 4, 5};
		assertEquals(520, new EllysFiveFriends().getZero(numbers));
	}
	
	@Test
	public void test3() {
		int[] numbers = new int[] {42, 666, 1337, 666, 42};
		assertEquals(549119981, new EllysFiveFriends().getZero(numbers));
	}
	
	@Test
	public void test4() {
		int[] numbers = new int[] {8792, 9483, 6787, 9856, 6205};
		assertEquals(165501353, new EllysFiveFriends().getZero(numbers));
	}
	
	@Test
	public void test5() {
		int[] numbers = new int[] {10000, 10000, 10000, 10000, 10000};
		assertEquals(952019520, new EllysFiveFriends().getZero(numbers));
	}
}
