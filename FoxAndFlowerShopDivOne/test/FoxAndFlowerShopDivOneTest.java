import org.junit.Test;
import static org.junit.Assert.*;

public class FoxAndFlowerShopDivOneTest {
	
	@Test
	public void test0() {
		String[] flowers = new String[] {"LLL",
 "PPP",
 "LLL"};
		int maxDiff = 1;
		assertEquals(7, new FoxAndFlowerShopDivOne().theMaxFlowers(flowers, maxDiff));
	}
	
	@Test
	public void test1() {
		String[] flowers = new String[] {"LLL",
 "PPP",
 "LLL"};
		int maxDiff = 0;
		assertEquals(6, new FoxAndFlowerShopDivOne().theMaxFlowers(flowers, maxDiff));
	}
	
	@Test
	public void test2() {
		String[] flowers = new String[] {"...",
 "...",
 "..."};
		int maxDiff = 3;
		assertEquals(0, new FoxAndFlowerShopDivOne().theMaxFlowers(flowers, maxDiff));
	}
	
	@Test
	public void test3() {
		String[] flowers = new String[] {"LLPL.LPP",
 "PLPPPPLL",
 "L.P.PLLL",
 "LPL.PP.L",
 ".LLL.P.L",
 "PPLP..PL"};
		int maxDiff = 2;
		assertEquals(38, new FoxAndFlowerShopDivOne().theMaxFlowers(flowers, maxDiff));
	}
	
	@Test
	public void test4() {
		String[] flowers = new String[] {"LLLLLLLLLL",
 "LLLLLLLLLL",
 "LLLLLLLLLL",
 "LLLLLLLLLL",
 "LLLLLLLLLL"};
		int maxDiff = 0;
		assertEquals(-1, new FoxAndFlowerShopDivOne().theMaxFlowers(flowers, maxDiff));
	}
	
	@Test
	public void test5() {
		String[] flowers = new String[] {"LLLP..LLP.PLL.LL..LP",
 "L.PL.L.LLLL.LPLLPLP.",
 "PLL.LL.LLL..PL...L..",
 ".LPPP.PPPLLLLPLP..PP",
 "LP.P.PPL.L...P.L.LLL",
 "L..LPLPP.PP...PPPL..",
 "PP.PLLL.LL...LP..LP.",
 "PL...P.PPPL..PLP.L..",
 "P.PPPLPLP.LL.L.LLLPL",
 "PLLPLLP.LLL.P..P.LPL",
 "..LLLPLPPPLP.P.LP.LL",
 "..LP..L..LLPPP.LL.LP",
 "LPLL.PLLPPLP...LL..P",
 "LL.....PLL.PLL.P....",
 "LLL...LPPPPL.PL...PP",
 ".PLPLLLLP.LPP...L...",
 "LL...L.LL.LLLPLPPPP.",
 "PLPLLLL..LP.LLPLLLL.",
 "PP.PLL..L..LLLPPL..P",
 ".LLPL.P.PP.P.L.PLPLL"};
		int maxDiff = 9;
		assertEquals(208, new FoxAndFlowerShopDivOne().theMaxFlowers(flowers, maxDiff));
	}
}
