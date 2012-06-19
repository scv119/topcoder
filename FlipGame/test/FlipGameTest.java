import org.junit.Test;
import static org.junit.Assert.*;

public class FlipGameTest {
	
//	@Test
//	public void test0() {
//		String[] board = new String[] {"1000",
// "1110",
// "1111"};
//		assertEquals(1, new FlipGame().minOperations(board));
//	}
//
//	@Test
//	public void test1() {
//		String[] board = new String[] {"1111",
// "1111",
// "1111"};
//		assertEquals(1, new FlipGame().minOperations(board));
//	}
	
	@Test
	public void test2() {
		String[] board = new String[] {"00",
 "00",
 "00"};
		assertEquals(0, new FlipGame().minOperations(board));
	}
	
	@Test
	public void test3() {
		String[] board = new String[] {"00000000",
 "00100000",
 "01000000",
 "00001000",
 "00000000"};
		assertEquals(4, new FlipGame().minOperations(board));
	}
	
	@Test
	public void test4() {
		String[] board = new String[] {"000000000000001100000000000000",
 "000000000000011110000000000000",
 "000000000000111111000000000000",
 "000000000001111111100000000000",
 "000000000011111111110000000000",
 "000000000111111111111000000000",
 "000000001100111111001100000000",
 "000000011000011110000110000000",
 "000000111100111111001111000000",
 "000001111111111111111111100000",
 "000011111111111111111111110000",
 "000111111111000000111111111000",
 "001111111111100001111111111100",
 "011111111111110011111111111110",
 "111111111111111111111111111111"};
		assertEquals(29, new FlipGame().minOperations(board));
	}
}
