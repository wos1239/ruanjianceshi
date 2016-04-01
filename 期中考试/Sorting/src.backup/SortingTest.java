import static org.junit.Assert.*;

import org.junit.*;


public class SortingTest {
	
	Sorting s;
	
	@Before
	public void setup()
	{
		s = new Sorting();
	}
	@Test
	public void testSwapReferences()
	{
		String [] an = {"2","1"};
		String [] bn = {"1","2"};
		s.swapReferences(an, 0, 1);
		assertEquals("½»»»´íÎó",bn,an);
		
	}
	@Test
	public void testIsSorted()
	{
		int [] an = {1,2,2,3};
		int [] bn = {1,2,3,2};
		assertEquals("ÅĞ¶ÏÊÇ·ñÅÅĞò´íÎó",true,s.isSorted(an));
		assertEquals("ÅĞ¶ÏÊÇ·ñÅÅĞò´íÎó",false,s.isSorted(bn));
	}
	
	@Test
	public void testInsertionSort() 
	{
		int [] an = {10,3,5,7,2};
		assertEquals(false,s.isSorted(an));
		s.insertionSort(an);
		assertEquals("²åÈëÅÅĞò´íÎó",true,s.isSorted(an));
	}
	@Test
	public void testQuicksort()
	{
		int [] an = {22,4,5,3,21,8,13,6,7,5,2,9,10,11,3,5,7,9,2};
		assertEquals(false,s.isSorted(an));
		s.quicksort(an);
		assertEquals("¿ìËÙÅÅĞò´íÎó",true,s.isSorted(an));
	}

}
