import org.junit.Test;
import static org.junit.Assert.*;

public class StrangeDictionary2Test {
	
//	@Test
//	public void test0() {
//		String[] words = new String[] {"hardesttestever"};
//		assertArrayEquals(new double[] {1.0 }, new StrangeDictionary2().getProbabilities(words), 1e-9);
//	}
//
//	@Test
//	public void test1() {
//		String[] words = new String[] {"ab", "ba"};
//		assertArrayEquals(new double[] {0.5, 0.5 }, new StrangeDictionary2().getProbabilities(words), 1e-9);
//	}
//
	@Test
	public void test2() {
		String[] words = new String[] {"bba", "aza", "aab", };
		assertArrayEquals(new double[] {0.16666666666666666, 0.3333333333333333, 0.5 }, new StrangeDictionary2().getProbabilities(words), 1e-9);
	}
	
	@Test
	public void test3() {
		String[] words = new String[] {"abababab", "babababa", "acacacac", "cacacaca", "bcbcbcbc", "cbcbcbcb"};
		assertArrayEquals(new double[] {0.5, 0.5, 0.0, 0.0, 0.0, 0.0 }, new StrangeDictionary2().getProbabilities(words), 1e-9);
	}
}
