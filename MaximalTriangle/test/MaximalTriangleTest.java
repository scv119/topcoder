import org.junit.Test;
import static org.junit.Assert.*;

public class MaximalTriangleTest {
	
	@Test
	public void test0() {
		int n = 4;
		int z = 1000000000;
		assertEquals(0, new MaximalTriangle().howMany(n, z));
	}
	
	@Test
	public void test1() {
		int n = 5;
		int z = 100;
		assertEquals(5, new MaximalTriangle().howMany(n, z));
	}
	
	@Test
	public void test2() {
		int n = 6;
		int z = 1000003;
		assertEquals(2, new MaximalTriangle().howMany(n, z));
	}
	
	@Test
	public void test3() {
		int n = 10;
		int z = 1000000000;
		assertEquals(1010, new MaximalTriangle().howMany(n, z));
	}
	
	@Test
	public void test4() {
		int n = 15;
		int z = 1000000000;
		assertEquals(714340, new MaximalTriangle().howMany(n, z));
	}
	
	@Test
	public void test5() {
		int n = 100;
		int z = 987654321;
		assertEquals(308571232, new MaximalTriangle().howMany(n, z));
	}
}
