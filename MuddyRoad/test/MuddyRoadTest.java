import org.junit.Test;
import static org.junit.Assert.*;

public class MuddyRoadTest {
	
	@Test
	public void test0() {
		int[] road = new int[] {0, 60, 60, 0};
		assertEquals(0.36, new MuddyRoad().getExpectedValue(road), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] road = new int[] {0, 50, 50, 50, 50, 0};
		assertEquals(0.5625, new MuddyRoad().getExpectedValue(road), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] road = new int[] {0, 0, 100, 100, 100, 100, 100, 100, 0, 0, 100, 0};
		assertEquals(3.0, new MuddyRoad().getExpectedValue(road), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] road = new int[] {0, 12, 34, 56, 78, 91, 23, 45, 67, 89, 0};
		assertEquals(1.7352539420031923, new MuddyRoad().getExpectedValue(road), 1e-9);
	}
	
	@Test
	public void test4() {
		int[] road = new int[] {0, 50, 50, 100, 50, 100, 50, 50, 100, 66, 0};
		assertEquals(2.288125, new MuddyRoad().getExpectedValue(road), 1e-9);
	}
}
