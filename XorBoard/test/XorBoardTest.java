import org.junit.Test;
import static org.junit.Assert.*;

public class XorBoardTest {
	
	@Test
	public void test0() {
		int H = 5;
		int W = 5;
		int Rcount = 3;
		int Ccount = 2;
		int S = 5;
		assertEquals(4, new XorBoard().count(H, W, Rcount, Ccount, S));
	}
	
	@Test
	public void test1() {
		int H = 2;
		int W = 2;
		int Rcount = 0;
		int Ccount = 0;
		int S = 1;
		assertEquals(0, new XorBoard().count(H, W, Rcount, Ccount, S));
	}
	
	@Test
	public void test2() {
		int H = 10;
		int W = 20;
		int Rcount = 50;
		int Ccount = 40;
		int S = 200;
		assertEquals(333759825, new XorBoard().count(H, W, Rcount, Ccount, S));
	}
	
	@Test
	public void test3() {
		int H = 1200;
		int W = 1000;
		int Rcount = 800;
		int Ccount = 600;
		int S = 4000;
		assertEquals(96859710, new XorBoard().count(H, W, Rcount, Ccount, S));
	}
	
	@Test
	public void test4() {
		int H = 555;
		int W = 555;
		int Rcount = 555;
		int Ccount = 555;
		int S = 5550;
		assertEquals(549361755, new XorBoard().count(H, W, Rcount, Ccount, S));
	}
}
