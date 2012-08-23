import org.junit.Test;
import static org.junit.Assert.*;

public class RollingDiceDivOneTest {
	
	@Test
	public void test0() {
		int[] dice = new int[] {6, 6, 8};
		assertEquals(11L, new RollingDiceDivOne().mostLikely(dice));
	}
	
	@Test
	public void test1() {
		int[] dice = new int[] {10};
		assertEquals(1L, new RollingDiceDivOne().mostLikely(dice));
	}
	
	@Test
	public void test2() {
		int[] dice = new int[] {2, 3, 4, 5};
		assertEquals(9L, new RollingDiceDivOne().mostLikely(dice));
	}
	
	@Test
	public void test3() {
		int[] dice = new int[] {1, 10, 1};
		assertEquals(3L, new RollingDiceDivOne().mostLikely(dice));
	}
	
	@Test
	public void test4() {
		int[] dice = new int[] {382828264, 942663792, 291832707, 887961277, 546603677, 545185615, 146267547, 6938117, 167567032, 84232402,
700781193, 452172304, 816532384, 951089120, 448136091, 280899512, 256093435, 39595226, 631504901, 154772240};
		assertEquals(4366828428L, new RollingDiceDivOne().mostLikely(dice));
	}
}
