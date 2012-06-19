import org.junit.Test;
import static org.junit.Assert.*;

public class AntsMeetTest {
	
	@Test
	public void test0() {
		int[] x = new int[] {0,10,20,30};
		int[] y = new int[] {0,10,20,30};
		String direction = "NWNE";
		assertEquals(2, new AntsMeet().countAnts(x, y, direction));
	}
	
	@Test
	public void test1() {
		int[] x = new int[] {-10,0,0,10};
		int[] y = new int[] {0,-10,10,0};
		String direction = "NEWS";
		assertEquals(0, new AntsMeet().countAnts(x, y, direction));
	}
	
	@Test
	public void test2() {
		int[] x = new int[] {-1,-1,-1,0,0,0,1,1,1};
		int[] y = new int[] {-1,0,1,-1,0,1,-1,0,1};
		String direction = "ESEWNNEWW";
		assertEquals(4, new AntsMeet().countAnts(x, y, direction));
	}
	
	@Test
	public void test3() {
		int[] x = new int[] {4,7,6,2,6,5,7,7,8,4,7,8,8,8,5,4,8,9,1,5,9,3,4,0,0,1,0,7,2,6,9,6,3,0,5,5,1,2,0,4,9,7,7,1,8,1,9,2,7,3};
		int[] y = new int[] {2,3,0,6,8,4,9,0,5,0,2,4,3,8,1,5,0,7,3,7,0,9,8,1,9,4,7,8,1,1,6,6,6,2,8,5,1,9,0,1,1,1,7,0,2,5,4,7,5,3};
		String direction = "SSNWSWSENSWSESWEWSWSENWNNNESWSWSWWSSWEEWWNWWWNWENN" ;
		assertEquals(25, new AntsMeet().countAnts(x, y, direction));
	}
	
	@Test
	public void test4() {
		int[] x = new int[] {478,-664,759,434,-405,513,565,-396,311,-174,56,993,251,-341,993,-112,242,129,383,513,-78,-341,-148,129,423
,493,434,-405,478,-148,929,251,56,242,929,-78,423,-664,802,251,759,383,-112,-591,-591,-248,660,660,735,493};
		int[] y = new int[] {-186,98,948,795,289,-678,948,-170,-195,290,-354,-424,289,-157,-166,150,706,-678,684,-294,-234,36,36,-294,-216
,-234,427,945,265,-157,265,715,275,715,-186,337,798,-170,427,706,754,961,286,-216,798,286,961,684,-424,337};
		String direction = "WNSNNSSWWWEENWESNSWSWSEWWEWEWWWNWESNSSNNSNNWWWNESE";
		assertEquals(44, new AntsMeet().countAnts(x, y, direction));
	}
}
