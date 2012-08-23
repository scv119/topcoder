import org.junit.Test;
import static org.junit.Assert.*;

public class TwoConvexShapesTest {
	
	@Test
	public void test0() {
		String[] grid = new String[] {"??",
 "??"};
		assertEquals(14, new TwoConvexShapes().countWays(grid));
	}
	
	@Test
	public void test1() {
		String[] grid = new String[] {"B?",
 "??"};
		assertEquals(7, new TwoConvexShapes().countWays(grid));
	}
	
	@Test
	public void test2() {
		String[] grid = new String[] {"WWB",
 "WWW",
 "WWW",
 "WWW"};
		assertEquals(1, new TwoConvexShapes().countWays(grid));
	}
	
	@Test
	public void test3() {
		String[] grid = new String[] {"BBBBBB",
 "WWBBBB",
 "WBBBBB"};
		assertEquals(0, new TwoConvexShapes().countWays(grid));
	}
	
	@Test
	public void test4() {
		String[] grid = new String[] {"?BB?",
 "BBBB",
 "?BB?"};
		assertEquals(5, new TwoConvexShapes().countWays(grid));
	}
	
	@Test
	public void test5() {
		String[] grid = new String[] {"?WWWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
 "B?WWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
 "BB?WWWWWWWWWWWWWWWWWWWWWWWWWWWW",
 "BBB?WWWWWWWWWWWWWWWWWWWWWWWWWWW",
 "BBBB?WWWWWWWWWWWWWWWWWWWWWWWWWW",
 "BBBBB?WWWWWWWWWWWWWWWWWWWWWWWWW",
 "BBBBBB?WWWWWWWWWWWWWWWWWWWWWWWW",
 "BBBBBBB?WWWWWWWWWWWWWWWWWWWWWWW",
 "BBBBBBBB?WWWWWWWWWWWWWWWWWWWWWW",
 "BBBBBBBBB?WWWWWWWWWWWWWWWWWWWWW",
 "BBBBBBBBBB?WWWWWWWWWWWWWWWWWWWW",
 "BBBBBBBBBBB?WWWWWWWWWWWWWWWWWWW",
 "BBBBBBBBBBBB?WWWWWWWWWWWWWWWWWW",
 "BBBBBBBBBBBBB?WWWWWWWWWWWWWWWWW",
 "BBBBBBBBBBBBBB?WWWWWWWWWWWWWWWW",
 "BBBBBBBBBBBBBBB?WWWWWWWWWWWWWWW",
 "BBBBBBBBBBBBBBBB?WWWWWWWWWWWWWW",
 "BBBBBBBBBBBBBBBBB?WWWWWWWWWWWWW",
 "BBBBBBBBBBBBBBBBBB?WWWWWWWWWWWW",
 "BBBBBBBBBBBBBBBBBBB?WWWWWWWWWWW",
 "BBBBBBBBBBBBBBBBBBBB?WWWWWWWWWW",
 "BBBBBBBBBBBBBBBBBBBBB?WWWWWWWWW",
 "BBBBBBBBBBBBBBBBBBBBBB?WWWWWWWW",
 "BBBBBBBBBBBBBBBBBBBBBBB?WWWWWWW",
 "BBBBBBBBBBBBBBBBBBBBBBBB?WWWWWW",
 "BBBBBBBBBBBBBBBBBBBBBBBBB?WWWWW",
 "BBBBBBBBBBBBBBBBBBBBBBBBBB?WWWW",
 "BBBBBBBBBBBBBBBBBBBBBBBBBBB?WWW",
 "BBBBBBBBBBBBBBBBBBBBBBBBBBBB?WW",
 "BBBBBBBBBBBBBBBBBBBBBBBBBBBBB?W"};
		assertEquals(73741817, new TwoConvexShapes().countWays(grid));
	}
}
