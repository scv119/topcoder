import org.junit.Test;
import static org.junit.Assert.*;

public class PatrolRouteTest {
	
	@Test
	public void test0() {
		int X = 3;
		int Y = 3;
		int minT = 1;
		int maxT = 20000;
		assertEquals(6, new PatrolRoute().countRoutes(X, Y, minT, maxT));
	}
	
	@Test
	public void test1() {
		int X = 3;
		int Y = 3;
		int minT = 4;
		int maxT = 7;
		assertEquals(0, new PatrolRoute().countRoutes(X, Y, minT, maxT));
	}
	
	@Test
	public void test2() {
		int X = 4;
		int Y = 6;
		int minT = 9;
		int maxT = 12;
		assertEquals(264, new PatrolRoute().countRoutes(X, Y, minT, maxT));
	}
	
	@Test
	public void test3() {
		int X = 7;
		int Y = 5;
		int minT = 13;
		int maxT = 18;
		assertEquals(1212, new PatrolRoute().countRoutes(X, Y, minT, maxT));
	}
	
	@Test
	public void test4() {
		int X = 4000;
		int Y = 4000;
		int minT = 4000;
		int maxT = 14000;
		assertEquals(859690013, new PatrolRoute().countRoutes(X, Y, minT, maxT));
	}
}
