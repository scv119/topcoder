import org.junit.Test;
import static org.junit.Assert.*;

public class KingdomAndDucksTest {
	
	@Test
	public void test0() {
		int[] duckTypes = new int[] {5, 8};
		assertEquals(2, new KingdomAndDucks().minDucks(duckTypes));
	}
	
	@Test
	public void test1() {
		int[] duckTypes = new int[] {4, 7, 4, 7, 4};
		assertEquals(6, new KingdomAndDucks().minDucks(duckTypes));
	}
	
	@Test
	public void test2() {
		int[] duckTypes = new int[] {17, 17, 19, 23, 23, 19, 19, 17, 17};
		assertEquals(12, new KingdomAndDucks().minDucks(duckTypes));
	}
	
	@Test
	public void test3() {
		int[] duckTypes = new int[] {50};
		assertEquals(1, new KingdomAndDucks().minDucks(duckTypes));
	}
	
	@Test
	public void test4() {
		int[] duckTypes = new int[] {10, 10, 10, 10, 10};
		assertEquals(5, new KingdomAndDucks().minDucks(duckTypes));
	}
}
