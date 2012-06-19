import org.junit.Test;
import static org.junit.Assert.*;

public class ImportantSequenceTest {
	
	@Test
	public void test0() {
		int[] B = new int[] {3, -1, 7};
		String operators = "+-+";
		assertEquals(2, new ImportantSequence().getCount(B, operators));
	}
	
	@Test
	public void test1() {
		int[] B = new int[] {1};
		String operators = "-";
		assertEquals(-1, new ImportantSequence().getCount(B, operators));
	}
	
	@Test
	public void test2() {
		int[] B = new int[] {1};
		String operators = "+";
		assertEquals(0, new ImportantSequence().getCount(B, operators));
	}
	
	@Test
	public void test3() {
		int[] B = new int[] {10};
		String operators = "+";
		assertEquals(9, new ImportantSequence().getCount(B, operators));
	}
	
	@Test
	public void test4() {
		int[] B = new int[] {540, 2012, 540, 2012, 540, 2012, 540};
		String operators = "-+-+-+-";
		assertEquals(1471, new ImportantSequence().getCount(B, operators));
	}
}
