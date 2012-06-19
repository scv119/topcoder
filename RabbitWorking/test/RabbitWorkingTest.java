import org.junit.Test;
import static org.junit.Assert.*;

public class RabbitWorkingTest {
	
	@Test
	public void test0() {
		String[] profit = new String[] { "071", 
  "702", 
  "120" }
;
		assertEquals(0.017676767676767676, new RabbitWorking().getMaximum(profit), 1e-9);
	}
	
	@Test
	public void test1() {
		String[] profit = new String[] { "061", 
  "602", 
  "120" }
;
		assertEquals(0.015228426395939087, new RabbitWorking().getMaximum(profit), 1e-9);
	}
	
	@Test
	public void test2() {
		String[] profit = new String[] { "0" }
;
		assertEquals(0.0, new RabbitWorking().getMaximum(profit), 1e-9);
	}
	
	@Test
	public void test3() {
		String[] profit = new String[] { "013040", 
  "100010", 
  "300060", 
  "000008", 
  "416000", 
  "000800" }
;
		assertEquals(0.021996615905245348, new RabbitWorking().getMaximum(profit), 1e-9);
	}
	
	@Test
	public void test4() {
		String[] profit = new String[] { "06390061", 
  "60960062", 
  "39090270", 
  "96900262", 
  "00000212", 
  "00222026", 
  "66761201", 
  "12022610" }
;
		assertEquals(0.06871794871794872, new RabbitWorking().getMaximum(profit), 1e-9);
	}
}
