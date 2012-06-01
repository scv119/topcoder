import org.junit.Test;
import static org.junit.Assert.*;

public class NonXorLifeTest {
	
	@Test
	public void test0() {
		String[] field = new String[] {"oo"
,"o."};
		int K = 3;
		assertEquals(36, new NonXorLife().countAliveCells(field, K));
	}
	
	@Test
	public void test1() {
		String[] field = new String[] {".."
,".."};
		int K = 23;
		assertEquals(0, new NonXorLife().countAliveCells(field, K));
	}
	
	@Test
	public void test2() {
		String[] field = new String[] {"o"};
		int K = 1000;
		assertEquals(2002001, new NonXorLife().countAliveCells(field, K));
	}
	
	@Test
	public void test3() {
		String[] field = new String[] {"o.oo.ooo"
,"o.o.o.oo"
,"ooo.oooo"
,"o.o..o.o"
,"o.o..o.o"
,"o..oooo."
,"..o.o.oo"
,"oo.ooo.o"};
		int K = 1234;
		assertEquals(3082590, new NonXorLife().countAliveCells(field, K));
	}
}
