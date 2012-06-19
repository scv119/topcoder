import org.junit.Test;
import static org.junit.Assert.*;

public class IPv444Test {
	
	@Test
	public void test0() {
		String[] request = new String[] {"66.37.210.86"};
		int[] price = new int[] {47};
		assertEquals(47L, new IPv444().getMaximumMoney(request, price));
	}
	
	@Test
	public void test1() {
		String[] request = new String[] {"0.0.0.*", "0.0.0.3", "0.0.0.5"};
		int[] price = new int[] {1, 3, 9};
		assertEquals(1010L, new IPv444().getMaximumMoney(request, price));
	}
	
	@Test
	public void test2() {
		String[] request = new String[] {"*.*.*.*", "123.456.789.0", "434.434.434.434", "999.*.999.*"};
		int[] price = new int[] {1, 5, 3, 6};
		assertEquals(1000005000006L, new IPv444().getMaximumMoney(request, price));
	}
	
	@Test
	public void test3() {
		String[] request = new String[] {"*.*.999.999", "888.888.999.*", "888.888.*.999", "777.777.777.777", "777.*.*.777"};
		int[] price = new int[] {19, 33, 42, 777, 7};
		assertEquals(26075718L, new IPv444().getMaximumMoney(request, price));
	}
	
	@Test
	public void test4() {
		String[] request = new String[] {"127.0.0.1", "*.0.0.*", "*.*.255.255", "192.68.*.*"};
		int[] price = new int[] {999999, 629851, 294016, 438090};
		assertEquals(1361957076132L, new IPv444().getMaximumMoney(request, price));
	}
}
