import org.junit.Test;
import static org.junit.Assert.*;

public class FractionInDifferentBasesTest {
	
	@Test
	public void test0() {
		long P = 1L;
		long Q = 2L;
		long A = 10L;
		long B = 10L;
		assertEquals(0L, new FractionInDifferentBases().getNumberOfGoodBases(P, Q, A, B));
	}
	
	@Test
	public void test1() {
		long P = 1L;
		long Q = 9L;
		long A = 9L;
		long B = 10L;
		assertEquals(1L, new FractionInDifferentBases().getNumberOfGoodBases(P, Q, A, B));
	}
	
	@Test
	public void test2() {
		long P = 5L;
		long Q = 6L;
		long A = 2L;
		long B = 10L;
		assertEquals(8L, new FractionInDifferentBases().getNumberOfGoodBases(P, Q, A, B));
	}
	
	@Test
	public void test3() {
		long P = 2662L;
		long Q = 540L;
		long A = 2L;
		long B = 662L;
		assertEquals(639L, new FractionInDifferentBases().getNumberOfGoodBases(P, Q, A, B));
	}
	
	@Test
	public void test4() {
		long P = 650720L;
		long Q = 7032600L;
		long A = 2012L;
		long B = 2012540L;
		assertEquals(2010495L, new FractionInDifferentBases().getNumberOfGoodBases(P, Q, A, B));
	}
}
