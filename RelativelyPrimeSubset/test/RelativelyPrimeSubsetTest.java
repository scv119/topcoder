import org.junit.Test;
import static org.junit.Assert.*;

public class RelativelyPrimeSubsetTest {
	
	@Test
	public void test0() {
		int[] S = new int[] {2,3,7,11,4};
		assertEquals(4, new RelativelyPrimeSubset().findSize(S));
	}
	
	@Test
	public void test1() {
		int[] S = new int[] {4,8,12,16};
		assertEquals(1, new RelativelyPrimeSubset().findSize(S));
	}
	
	@Test
	public void test2() {
		int[] S = new int[] {100,17,81,82};
		assertEquals(3, new RelativelyPrimeSubset().findSize(S));
	}
	
	@Test
	public void test3() {
		int[] S = new int[] {2,3,4,5,6};
		assertEquals(3, new RelativelyPrimeSubset().findSize(S));
	}
}
