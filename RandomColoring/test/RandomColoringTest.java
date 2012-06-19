import org.junit.Test;
import static org.junit.Assert.*;

public class RandomColoringTest {
	
//	@Test
//	public void test0() {
//		int N = 2;
//		int maxR = 5;
//		int maxG = 1;
//		int maxB = 1;
//		int startR = 2;
//		int startG = 0;
//		int startB = 0;
//		int d1 = 0;
//		int d2 = 1;
//		assertEquals(0.0, new RandomColoring().getProbability(N, maxR, maxG, maxB, startR, startG, startB, d1, d2), 1e-9);
//	}
//
	@Test
	public void test1() {
		int N = 3;
		int maxR = 5;
		int maxG = 1;
		int maxB = 1;
		int startR = 2;
		int startG = 0;
		int startB = 0;
		int d1 = 0;
		int d2 = 1;
		assertEquals(0.22222222222222227, new RandomColoring().getProbability(N, maxR, maxG, maxB, startR, startG, startB, d1, d2), 1e-9);
	}
//
//	@Test
//	public void test2() {
//		int N = 7;
//		int maxR = 4;
//		int maxG = 2;
//		int maxB = 2;
//		int startR = 0;
//		int startG = 0;
//		int startB = 0;
//		int d1 = 3;
//		int d2 = 3;
//		assertEquals(1.0, new RandomColoring().getProbability(N, maxR, maxG, maxB, startR, startG, startB, d1, d2), 1e-9);
//	}
//
//	@Test
//	public void test3() {
//		int N = 10;
//		int maxR = 7;
//		int maxG = 8;
//		int maxB = 9;
//		int startR = 1;
//		int startG = 2;
//		int startB = 3;
//		int d1 = 0;
//		int d2 = 10;
//		assertEquals(0.0, new RandomColoring().getProbability(N, maxR, maxG, maxB, startR, startG, startB, d1, d2), 1e-9);
//	}
	
//	@Test
//	public void test4() {
//		int N = 10;
//		int maxR = 7;
//		int maxG = 8;
//		int maxB = 9;
//		int startR = 1;
//		int startG = 2;
//		int startB = 3;
//		int d1 = 4;
//		int d2 = 10;
//		assertEquals(0.37826245943967396, new RandomColoring().getProbability(N, maxR, maxG, maxB, startR, startG, startB, d1, d2), 1e-9);
//	}
	
	@Test
	public void test5() {
		int N = 3;
		int maxR = 3;
		int maxG = 2;
		int maxB = 2;
		int startR = 1;
		int startG = 0;
		int startB = 0;
		int d1 = 1;
		int d2 = 2;
		assertEquals(0.09090909090909148, new RandomColoring().getProbability(N, maxR, maxG, maxB, startR, startG, startB, d1, d2), 1e-9);
	}
}
