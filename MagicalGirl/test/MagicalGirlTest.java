import org.junit.Test;
import static org.junit.Assert.*;

public class MagicalGirlTest {
	
	@Test
	public void test0() {
		int M = 2;
		int[] day = new int[] {1};
		int[] win = new int[] {75};
		int[] gain = new int[] {1};
		assertEquals(2.5, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
	
	@Test
	public void test1() {
		int M = 10;
		int[] day = new int[] {5,5,5,5};
		int[] win = new int[] {100,100,100,100};
		int[] gain = new int[] {1,1,1,1};
		assertEquals(14.0, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
	
	@Test
	public void test2() {
		int M = 10;
		int[] day = new int[] {5,5,5,5,5};
		int[] win = new int[] {40,80,60,20,0};
		int[] gain = new int[] {10,10,10,10,10};
		assertEquals(13.0, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
	
	@Test
	public void test3() {
		int M = 2;
		int[] day = new int[] {2};
		int[] win = new int[] {100};
		int[] gain = new int[] {2};
		assertEquals(2.0, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
	
	@Test
	public void test4() {
		int M = 20;
		int[] day = new int[] {2,13,8,7,9,4,6,21};
		int[] win = new int[] {18,83,75,23,45,23,10,98};
		int[] gain = new int[] {10,9,8,10,7,16,13,20};
		assertEquals(35.908, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
	
	@Test
	public void test5() {
		int M = 11;
		int[] day = new int[] {10,20,30,40,50,60,70,80,90};
		int[] win = new int[] {100,100,100,100,100,100,100,100,100};
		int[] gain = new int[] {10,10,10,10,10,10,10,10,10};
		assertEquals(101.0, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
	
	@Test
	public void test6() {
		int M = 100000;
		int[] day = new int[] {1000000};
		int[] win = new int[] {100};
		int[] gain = new int[] {100000};
		assertEquals(100000.0, new MagicalGirl().maxExpectation(M, day, win, gain), 1e-9);
	}
}
