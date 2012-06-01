import org.junit.Test;
import static org.junit.Assert.*;

public class EllysXorsTest {
	
	@Test
	public void test0() {
		long L = 1L;
		long R = 2L;
		assertEquals(3L, new EllysXors().getXor(L, R));
	}
	
	@Test
	public void test1() {
		long L = 1L;
		long R = 1L;
		assertEquals(1L, new EllysXors().getXor(L, R));
	}
	
	@Test
	public void test2() {
		long L = 13L;
		long R = 42L;
		assertEquals(39L, new EllysXors().getXor(L, R));
	}
	
	@Test
	public void test3() {
		long L = 666L;
		long R = 1337L;
		assertEquals(0L, new EllysXors().getXor(L, R));
	}
	
	@Test
	public void test4() {
		long L = 1234567L;
		long R = 89101112L;
		assertEquals(89998783L, new EllysXors().getXor(L, R));
	}
}
