import org.junit.Test;
import static org.junit.Assert.*;

public class EllysTSPTest {
	
	@Test
	public void test0() {
		String places = "CVVVC";
		assertEquals(5, new EllysTSP().getMax(places));
	}
	
	@Test
	public void test1() {
		String places = "VVV";
		assertEquals(1, new EllysTSP().getMax(places));
	}
	
	@Test
	public void test2() {
		String places = "VVVVCVV";
		assertEquals(3, new EllysTSP().getMax(places));
	}
	
	@Test
	public void test3() {
		String places = "CVCVCVC";
		assertEquals(7, new EllysTSP().getMax(places));
	}
	
	@Test
	public void test4() {
		String places = "V";
		assertEquals(1, new EllysTSP().getMax(places));
	}
}
