import org.junit.Test;
import static org.junit.Assert.*;

public class KleofasTailTest {
	
	@Test
	public void test0() {
		long K = 3L;
		long A = 4L;
		long B = 8L;
		assertEquals(2L, new KleofasTail().countGoodSequences(K, A, B));
	}
	
	@Test
	public void test1() {
		long K = 1L;
		long A = 23457L;
		long B = 123456L;
		assertEquals(100000L, new KleofasTail().countGoodSequences(K, A, B));
	}
	
	@Test
	public void test2() {
		long K = 1234567890123456L;
		long A = 10L;
		long B = 1000000L;
		assertEquals(0L, new KleofasTail().countGoodSequences(K, A, B));
	}
	
	@Test
	public void test3() {
		long K = 0L;
		long A = 0L;
		long B = 2L;
		assertEquals(3L, new KleofasTail().countGoodSequences(K, A, B));
	}
	
	@Test
	public void test4() {
		long K = 2L;
		long A = 3L;
		long B = 3L;
		assertEquals(1L, new KleofasTail().countGoodSequences(K, A, B));
	}
	
	@Test
	public void test5() {
		long K = 13L;
		long A = 12345L;
		long B = 67890123L;
		assertEquals(8387584L, new KleofasTail().countGoodSequences(K, A, B));
	}
}
