import org.junit.Test;
import static org.junit.Assert.*;

public class PairingPawnsTest {
	
	@Test
	public void test0() {
		int[] start = new int[] {0,2};
		assertEquals(1, new PairingPawns().savedPawnCount(start));
	}
	
	@Test
	public void test1() {
		int[] start = new int[] {10,3};
		assertEquals(11, new PairingPawns().savedPawnCount(start));
	}
	
	@Test
	public void test2() {
		int[] start = new int[] {0,0,0,8};
		assertEquals(1, new PairingPawns().savedPawnCount(start));
	}
	
	@Test
	public void test3() {
		int[] start = new int[] {0,1,1,2};
		assertEquals(1, new PairingPawns().savedPawnCount(start));
	}
	
	@Test
	public void test4() {
		int[] start = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,123456};
		assertEquals(0, new PairingPawns().savedPawnCount(start));
	}
	
	@Test
	public void test5() {
		int[] start = new int[] {1000,2000,3000,4000,5000,6000,7000,8000};
		assertEquals(3921, new PairingPawns().savedPawnCount(start));
	}
}
