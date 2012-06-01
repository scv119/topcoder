import org.junit.Test;
import static org.junit.Assert.*;

public class DengklekMakingChainsTest {
	
	@Test
	public void test0() {
		String[] chains = new String[] {".15", "7..", "402", "..3"};
		assertEquals(19, new DengklekMakingChains().maxBeauty(chains));
	}
	
	@Test
	public void test1() {
		String[] chains = new String[] {"..1", "7..", "567", "24.", "8..", "234"};
		assertEquals(36, new DengklekMakingChains().maxBeauty(chains));
	}
	
	@Test
	public void test2() {
		String[] chains = new String[] {"...", "..."};
		assertEquals(0, new DengklekMakingChains().maxBeauty(chains));
	}
	
	@Test
	public void test3() {
		String[] chains = new String[] {"16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111"};
		assertEquals(28, new DengklekMakingChains().maxBeauty(chains));
	}
	
	@Test
	public void test4() {
		String[] chains = new String[] {"..1", "3..", "2..", ".7."};
		assertEquals(7, new DengklekMakingChains().maxBeauty(chains));
	}
	
	@Test
	public void test5() {
		String[] chains = new String[] {"412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46"};
		assertEquals(58, new DengklekMakingChains().maxBeauty(chains));
	}
}
