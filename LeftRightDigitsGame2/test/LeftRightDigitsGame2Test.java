import org.junit.Test;
import static org.junit.Assert.*;

public class LeftRightDigitsGame2Test {
	
	@Test
	public void test0() {
		String digits = "565";
		String lowerBound = "556";
		assertEquals("556", new LeftRightDigitsGame2().minNumber(digits, lowerBound));
	}
	
	@Test
	public void test1() {
		String digits = "565";
		String lowerBound = "566";
		assertEquals("655", new LeftRightDigitsGame2().minNumber(digits, lowerBound));
	}
	
	@Test
	public void test2() {
		String digits = "565";
		String lowerBound = "656";
		assertEquals("", new LeftRightDigitsGame2().minNumber(digits, lowerBound));
	}
	
	@Test
	public void test3() {
		String digits = "9876543210";
		String lowerBound = "5565565565";
		assertEquals("5678943210", new LeftRightDigitsGame2().minNumber(digits, lowerBound));
	}
	
	@Test
	public void test4() {
		String digits = "8016352";
		String lowerBound = "1000000";
		assertEquals("1086352", new LeftRightDigitsGame2().minNumber(digits, lowerBound));
	}
}
