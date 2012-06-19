import org.junit.Test;
import static org.junit.Assert.*;

public class AkariDaisukiDiv1Test {
	
	@Test
	public void test0() {
		String Waai = "a";
		String Akari = "b";
		String Daisuki = "c";
		String S = "x";
		String F = "axb";
		int k = 2;
		assertEquals(2, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
	
	@Test
	public void test1() {
		String Waai = "a";
		String Akari = "b";
		String Daisuki = "c";
		String S = "x";
		String F = "abcdefghij";
		int k = 1;
		assertEquals(0, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
	
	@Test
	public void test2() {
		String Waai = "a";
		String Akari = "a";
		String Daisuki = "a";
		String S = "b";
		String F = "aba";
		int k = 2;
		assertEquals(4, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
	
	@Test
	public void test3() {
		String Waai = "a";
		String Akari = "b";
		String Daisuki = "c";
		String S = "d";
		String F = "baadbdcbadbdccccbaaaadbdcbadbdccbaadbdcba";
		int k = 58;
		assertEquals(191690599, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
	
	@Test
	public void test4() {
		String Waai = "a";
		String Akari = "x";
		String Daisuki = "y";
		String S = "b";
		String F = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		int k = 49;
		assertEquals(1, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
	
	@Test
	public void test5() {
		String Waai = "waai";
		String Akari = "akari";
		String Daisuki = "daisuki";
		String S = "usushio";
		String F = "id";
		int k = 10000000;
		assertEquals(127859200, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
	
	@Test
	public void test6() {
		String Waai = "vfsebgjfyfgerkqlr";
		String Akari = "ezbiwls";
		String Daisuki = "kjerx";
		String S = "jbmjvaawoxycfndukrjfg";
		String F = "bgjfyfgerkqlrvfsebgjfyfgerkqlrvfsebgjfyfgerkqlrvfs";
		int k = 1575724;
		assertEquals(483599313, new AkariDaisukiDiv1().countF(Waai, Akari, Daisuki, S, F, k));
	}
}
