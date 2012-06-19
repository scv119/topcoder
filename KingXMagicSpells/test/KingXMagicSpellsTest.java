import org.junit.Test;
import static org.junit.Assert.*;

public class KingXMagicSpellsTest {
	
	@Test
	public void test0() {
		int[] ducks = new int[] {5, 3, 7};
		int[] spellOne = new int[] {1, 7, 4};
		int[] spellTwo = new int[] {1, 0, 2};
		int K = 1;
		assertEquals(3.5, new KingXMagicSpells().expectedNumber(ducks, spellOne, spellTwo, K), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] ducks = new int[] {5, 8};
		int[] spellOne = new int[] {53, 7};
		int[] spellTwo = new int[] {1, 0};
		int K = 2;
		assertEquals(21.5, new KingXMagicSpells().expectedNumber(ducks, spellOne, spellTwo, K), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] ducks = new int[] {123, 456, 789, 1234, 56789};
		int[] spellOne = new int[] {0, 0, 0, 0, 0};
		int[] spellTwo = new int[] {0, 1, 2, 3, 4};
		int K = 50;
		assertEquals(123.0, new KingXMagicSpells().expectedNumber(ducks, spellOne, spellTwo, K), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] ducks = new int[] {83291232, 3124231, 192412, 3813249, 629231, 9998989};
		int[] spellOne = new int[] {58, 37, 44, 66, 72, 19};
		int[] spellTwo = new int[] {2, 0, 1, 5, 4, 3};
		int K = 11;
		assertEquals(2.888186784716797E7, new KingXMagicSpells().expectedNumber(ducks, spellOne, spellTwo, K), 1e-9);
	}
}
