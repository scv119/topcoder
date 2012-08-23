import org.junit.Test;
import static org.junit.Assert.*;

public class KingdomAndTreesTest {
	
	@Test
	public void test0() {
		int[] heights = new int[] {1,1};
		assertEquals(1, new KingdomAndTrees().minLevel(heights));
	}
	
	@Test
	public void test1() {
		int[] heights = new int[] {5, 8};
		assertEquals(0, new KingdomAndTrees().minLevel(heights));
	}
	
	@Test
	public void test2() {
		int[] heights = new int[] {2, 1, 1, 1, 1, 1};
		assertEquals(5, new KingdomAndTrees().minLevel(heights));
	}
	
	@Test
	public void test3() {
		int[] heights = new int[] {548, 47, 58, 250, 2012};
		assertEquals(251, new KingdomAndTrees().minLevel(heights));
	}
}
