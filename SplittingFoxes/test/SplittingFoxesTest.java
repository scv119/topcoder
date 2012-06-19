import org.junit.Test;
import static org.junit.Assert.*;

public class SplittingFoxesTest {
	
	@Test
	public void test0() {
		long n = 58L;
		int S = 2;
		int L = 0;
		int R = 0;
		assertEquals(0, new SplittingFoxes().sum(n, S, L, R));
	}
	
	@Test
	public void test1() {
		long n = 3L;
		int S = 1;
		int L = 1;
		int R = 0;
		assertEquals(1, new SplittingFoxes().sum(n, S, L, R));
	}
	
	@Test
	public void test2() {
		long n = 5L;
		int S = 1;
		int L = 3;
		int R = 2;
		assertEquals(34, new SplittingFoxes().sum(n, S, L, R));
	}
	
	@Test
	public void test3() {
		long n = 5L;
		int S = 1;
		int L = 2;
		int R = 3;
		assertEquals(999999973, new SplittingFoxes().sum(n, S, L, R));
	}
	
	@Test
	public void test4() {
		long n = 123456789L;
		int S = 987654321;
		int L = 544;
		int R = 544;
		assertEquals(0, new SplittingFoxes().sum(n, S, L, R));
	}
	
	@Test
	public void test5() {
		long n = 65536L;
		int S = 1024;
		int L = 512;
		int R = 4096;
		assertEquals(371473914, new SplittingFoxes().sum(n, S, L, R));
	}
}
