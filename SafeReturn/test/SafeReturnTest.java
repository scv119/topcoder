import org.junit.Test;
import static org.junit.Assert.*;

public class SafeReturnTest {
	
	@Test
	public void test0() {
		int N = 3;
		String[] streets = new String[] {"-234",
 "2---",
 "3---",
 "4---"};
		assertEquals(3, new SafeReturn().minRisk(N, streets));
	}
	
	@Test
	public void test1() {
		int N = 2;
		String[] streets = new String[] {"-12",
 "1-1",
 "21-"};
		assertEquals(1, new SafeReturn().minRisk(N, streets));
	}
	
	@Test
	public void test2() {
		int N = 3;
		String[] streets = new String[] {"-----7",
 "--1---",
 "-1-5--",
 "--5-1-",
 "---1-3",
 "7---3-"};
		assertEquals(1, new SafeReturn().minRisk(N, streets));
	}
	
	@Test
	public void test3() {
		int N = 2;
		String[] streets = new String[] {"-11",
 "1-1",
 "11-"};
		assertEquals(2, new SafeReturn().minRisk(N, streets));
	}
}
