import org.junit.Test;
import static org.junit.Assert.*;

public class SuminatorTest {
	
	@Test
	public void test0() {
		int[] program = new int[] {9,-1,0};
		int wantedResult = 10;
		assertEquals(1, new Suminator().findMissing(program, wantedResult));
	}
	
	@Test
	public void test1() {
		int[] program = new int[] {100, 200, 300, 0, 100, -1};
		int wantedResult = 600;
		assertEquals(0, new Suminator().findMissing(program, wantedResult));
	}
	
	@Test
	public void test2() {
		int[] program = new int[] {-1, 7, 3, 0, 1, 2, 0, 0};
		int wantedResult = 13;
		assertEquals(0, new Suminator().findMissing(program, wantedResult));
	}
	
	@Test
	public void test3() {
		int[] program = new int[] {-1, 8, 4, 0, 1, 2, 0, 0};
		int wantedResult = 16;
		assertEquals(-1, new Suminator().findMissing(program, wantedResult));
	}
	
	@Test
	public void test4() {
		int[] program = new int[] {1000000000, 1000000000, 1000000000,  1000000000, -1, 0, 0, 0, 0};
		int wantedResult = 1000000000;
		assertEquals(-1, new Suminator().findMissing(program, wantedResult));
	}
	
	@Test
	public void test5() {
		int[] program = new int[] {7, -1, 3, 0};
		int wantedResult = 3;
		assertEquals(-1, new Suminator().findMissing(program, wantedResult));
	}
}
