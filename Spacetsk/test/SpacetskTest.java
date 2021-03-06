import org.junit.Test;
import static org.junit.Assert.*;

public class SpacetskTest {
	
//	@Test
//	public void test0() {
//		int L = 1;
//		int H = 1;
//		int K = 2;
//		assertEquals(4, new Spacetsk().countsets(L, H, K));
//	}
//
//	@Test
//	public void test1() {
//		int L = 1;
//		int H = 1;
//		int K = 1;
//		assertEquals(4, new Spacetsk().countsets(L, H, K));
//	}
//
//	@Test
//	public void test2() {
//		int L = 2;
//		int H = 2;
//		int K = 1;
//		assertEquals(9, new Spacetsk().countsets(L, H, K));
//	}
	
	@Test
	public void test3() {
		int L = 2;
		int H = 2;
		int K = 2;
		assertEquals(23, new Spacetsk().countsets(L, H, K));
	}
	
	@Test
	public void test4() {
		int L = 5;
		int H = 5;
		int K = 3;
		assertEquals(202, new Spacetsk().countsets(L, H, K));
	}
	
	@Test
	public void test5() {
		int L = 561;
		int H = 394;
		int K = 20;
		assertEquals(786097180, new Spacetsk().countsets(L, H, K));
	}
}
