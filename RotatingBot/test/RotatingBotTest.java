import org.junit.Test;
import static org.junit.Assert.*;

public class RotatingBotTest {
	
//	@Test
//	public void test0() {
//		int[] moves = new int[] {15};
//		assertEquals(16, new RotatingBot().minArea(moves));
//	}
//
//	@Test
//	public void test1() {
//		int[] moves = new int[] {3,10};
//		assertEquals(44, new RotatingBot().minArea(moves));
//	}
//
//	@Test
//	public void test2() {
//		int[] moves = new int[] {1,1,1,1};
//		assertEquals(-1, new RotatingBot().minArea(moves));
//	}
//
//	@Test
//	public void test3() {
//		int[] moves = new int[] {9,5,11,10,11,4,10};
//		assertEquals(132, new RotatingBot().minArea(moves));
//	}
//
//	@Test
//	public void test4() {
//		int[] moves = new int[] {12,1,27,14,27,12,26,11,25,10,24,9,23,8,22,7,21,6,20,5,19,4,18,3,17,2,16,1,15};
//		assertEquals(420, new RotatingBot().minArea(moves));
//	}
//
	@Test
	public void test5() {
		int[] moves = new int[] {8,6,6,1};
		assertEquals(-1, new RotatingBot().minArea(moves));
	}
	
	@Test
	public void test6() {
		int[] moves = new int[] {8,6,6};
		assertEquals(63, new RotatingBot().minArea(moves));
	}
	
	@Test
	public void test7() {
		int[] moves = new int[] {5,4,5,3,3};
		assertEquals(30, new RotatingBot().minArea(moves));
	}
}
