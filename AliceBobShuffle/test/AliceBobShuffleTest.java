import org.junit.Test;
import static org.junit.Assert.*;

public class AliceBobShuffleTest {
	
	@Test
	public void test0() {
		int[] AliceStart = new int[] {1, 3};
		int[] BobStart = new int[] {2, 4};
		int[] AliceEnd = new int[] {2, 3};
		int[] BobEnd = new int[] {1, 4};
		assertEquals(4, new AliceBobShuffle().countWays(AliceStart, BobStart, AliceEnd, BobEnd));
	}
	
	@Test
	public void test1() {
		int[] AliceStart = new int[] {1, 2, 1};
		int[] BobStart = new int[] {1, 2};
		int[] AliceEnd = new int[] {1, 2, 1};
		int[] BobEnd = new int[] {2, 1};
		assertEquals(4, new AliceBobShuffle().countWays(AliceStart, BobStart, AliceEnd, BobEnd));
	}
	
	@Test
	public void test2() {
		int[] AliceStart = new int[] {1};
		int[] BobStart = new int[] {2};
		int[] AliceEnd = new int[] {3};
		int[] BobEnd = new int[] {4};
		assertEquals(0, new AliceBobShuffle().countWays(AliceStart, BobStart, AliceEnd, BobEnd));
	}
	
	@Test
	public void test3() {
		int[] AliceStart = new int[] {1, 2};
		int[] BobStart = new int[] {3};
		int[] AliceEnd = new int[] {3};
		int[] BobEnd = new int[] {2, 1};
		assertEquals(0, new AliceBobShuffle().countWays(AliceStart, BobStart, AliceEnd, BobEnd));
	}
	
	@Test
	public void test4() {
		int[] AliceStart = new int[] {3, 3, 2, 4, 1, 3, 1, 2, 1, 1, 5, 5, 1, 2, 3, 1, 2, 1, 2, 1, 1, 1, 2};
		int[] BobStart = new int[] {4, 1, 4, 3, 4, 4, 4, 3, 2, 1, 6, 2, 2, 3, 2, 2, 1, 3, 2, 3};
		int[] AliceEnd = new int[] {4, 1, 4, 3, 4, 4, 4, 1, 3, 1, 2, 2, 2, 3, 2, 1, 2, 1, 2, 2, 2};
		int[] BobEnd = new int[] {3, 3, 2, 3, 4, 2, 1, 2, 1, 1, 5, 6, 5, 1, 3, 1, 2, 3, 1, 1, 1, 3};
		assertEquals(314159265, new AliceBobShuffle().countWays(AliceStart, BobStart, AliceEnd, BobEnd));
	}
}
