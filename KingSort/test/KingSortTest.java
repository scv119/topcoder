import org.junit.Test;
import static org.junit.Assert.*;

public class KingSortTest {
	
	@Test
	public void test0() {
		String[] kings = new String[] {"Louis IX", "Louis VIII"};
		assertArrayEquals(new String[] {"Louis VIII", "Louis IX" }, new KingSort().getSortedList(kings));
	}
	
	@Test
	public void test1() {
		String[] kings = new String[] {"Louis IX", "Philippe II"};
		assertArrayEquals(new String[] {"Louis IX", "Philippe II" }, new KingSort().getSortedList(kings));
	}
	
	@Test
	public void test2() {
		String[] kings = new String[] {"Richard III", "Richard I", "Richard II"};
		assertArrayEquals(new String[] {"Richard I", "Richard II", "Richard III" }, new KingSort().getSortedList(kings));
	}
	
	@Test
	public void test3() {
		String[] kings = new String[] {"John X", "John I", "John L", "John V"};
		assertArrayEquals(new String[] {"John I", "John V", "John X", "John L" }, new KingSort().getSortedList(kings));
	}
	
	@Test
	public void test4() {
		String[] kings = new String[] {"Philippe VI", "Jean II", "Charles V", "Charles VI", "Charles VII", "Louis XI"};
		assertArrayEquals(new String[] {"Charles V", "Charles VI", "Charles VII", "Jean II", "Louis XI", "Philippe VI" }, new KingSort().getSortedList(kings));
	}
	
	@Test
	public void test5() {
		String[] kings = new String[] {"Philippe II", "Philip II"};
		assertArrayEquals(new String[] {"Philip II", "Philippe II" }, new KingSort().getSortedList(kings));
	}
}
