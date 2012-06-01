import org.junit.Test;
import static org.junit.Assert.*;

public class BoardSplittingTest {
	
	@Test
	public void test0() {
		int desiredLength = 16;
		int desiredCount = 11;
		int actualLength = 11;
		assertEquals(10, new BoardSplitting().minimumCuts(desiredLength, desiredCount, actualLength));
	}
	
	@Test
	public void test1() {
		int desiredLength = 6;
		int desiredCount = 100;
		int actualLength = 3;
		assertEquals(0, new BoardSplitting().minimumCuts(desiredLength, desiredCount, actualLength));
	}
	
	@Test
	public void test2() {
		int desiredLength = 500;
		int desiredCount = 5;
		int actualLength = 1000;
		assertEquals(3, new BoardSplitting().minimumCuts(desiredLength, desiredCount, actualLength));
	}
	
	@Test
	public void test3() {
		int desiredLength = 314;
		int desiredCount = 159;
		int actualLength = 26;
		assertEquals(147, new BoardSplitting().minimumCuts(desiredLength, desiredCount, actualLength));
	}
}
