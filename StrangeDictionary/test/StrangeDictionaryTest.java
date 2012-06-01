import org.junit.Test;
import static org.junit.Assert.*;

public class StrangeDictionaryTest {
	
	@Test
	public void test0() {
		String[] words = new String[] {"hardesttestever"};
		assertArrayEquals(new double[] {0.0 }, new StrangeDictionary().getExpectedPositions(words), 1e-9);
	}
	
	@Test
	public void test1() {
		String[] words = new String[] {"ab", "ba"};
		assertArrayEquals(new double[] {0.5, 0.5 }, new StrangeDictionary().getExpectedPositions(words), 1e-9);
	}
	
	@Test
	public void test2() {
		String[] words = new String[] {"aza", "aab", "bba"};
		assertArrayEquals(new double[] {1.0, 0.8333333333333333, 1.1666666666666665 }, new StrangeDictionary().getExpectedPositions(words), 1e-9);
	}
	
	@Test
	public void test3() {
		String[] words = new String[] {"abababab", "babababa", "acacacac", "cacacaca", "bcbcbcbc", "cbcbcbcb"};
		assertArrayEquals(new double[] {1.0, 1.0, 2.5, 2.5, 4.0, 4.0 }, new StrangeDictionary().getExpectedPositions(words), 1e-9);
	}
}
