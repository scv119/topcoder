import org.junit.Test;
import static org.junit.Assert.*;

public class DengklekPaintingSquaresTest {
	
	@Test
	public void test0() {
		int N = 1;
		int M = 1;
		assertEquals(2, new DengklekPaintingSquares().numSolutions(N, M));
	}
	
	@Test
	public void test1() {
		int N = 2;
		int M = 2;
		assertEquals(8, new DengklekPaintingSquares().numSolutions(N, M));
	}
	
	@Test
	public void test2() {
		int N = 1;
		int M = 3;
		assertEquals(5, new DengklekPaintingSquares().numSolutions(N, M));
	}
	
	@Test
	public void test3() {
		int N = 47;
		int M = 7;
		assertEquals(944149920, new DengklekPaintingSquares().numSolutions(N, M));
	}
}
