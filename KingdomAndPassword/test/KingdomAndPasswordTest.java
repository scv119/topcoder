import org.junit.Test;
import static org.junit.Assert.*;

public class KingdomAndPasswordTest {
	
	@Test
	public void test0() {
		long oldPassword = 548L;
		int[] restrictedDigits = new int[] {5, 1, 8};
		assertEquals(485L, new KingdomAndPassword().newPassword(oldPassword, restrictedDigits));
	}
	
	@Test
	public void test1() {
		long oldPassword = 7777L;
		int[] restrictedDigits = new int[] {4, 7, 4, 7};
		assertEquals(-1L, new KingdomAndPassword().newPassword(oldPassword, restrictedDigits));
	}
	
	@Test
	public void test2() {
		long oldPassword = 58L;
		int[] restrictedDigits = new int[] {4, 7};
		assertEquals(58L, new KingdomAndPassword().newPassword(oldPassword, restrictedDigits));
	}
	
	@Test
	public void test3() {
		long oldPassword = 172L;
		int[] restrictedDigits = new int[] {4, 7, 4};
		assertEquals(127L, new KingdomAndPassword().newPassword(oldPassword, restrictedDigits));
	}
	
	@Test
	public void test4() {
		long oldPassword = 241529363573463L;
		int[] restrictedDigits = new int[] {1, 4, 5, 7, 3, 9, 8, 1, 7, 6, 3, 2, 6, 4, 5};
		assertEquals(239676554423331L, new KingdomAndPassword().newPassword(oldPassword, restrictedDigits));
	}
}
