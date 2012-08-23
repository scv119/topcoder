import org.junit.Test;
import static org.junit.Assert.*;

public class FoxPaintingBallsTest {
	
	@Test
	public void test0() {
		long R = 2L;
		long G = 2L;
		long B = 2L;
		int N = 3;
		assertEquals(1L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
	
	@Test
	public void test1() {
		long R = 1L;
		long G = 2L;
		long B = 3L;
		int N = 3;
		assertEquals(0L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
	
	@Test
	public void test2() {
		long R = 8L;
		long G = 6L;
		long B = 6L;
		int N = 4;
		assertEquals(2L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
	
	@Test
	public void test3() {
		long R = 7L;
		long G = 6L;
		long B = 7L;
		int N = 4;
		assertEquals(2L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
	
	@Test
	public void test4() {
		long R = 100L;
		long G = 100L;
		long B = 100L;
		int N = 4;
		assertEquals(30L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
	
	@Test
	public void test5() {
		long R = 19330428391852493L;
		long G = 48815737582834113L;
		long B = 11451481019198930L;
		int N = 3456;
		assertEquals(5750952686L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
	
	@Test
	public void test6() {
		long R = 1L;
		long G = 1L;
		long B = 1L;
		int N = 1;
		assertEquals(3L, new FoxPaintingBalls().theMax(R, G, B, N));
	}
}
