import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.*;

public class ScheduleTest {
	Schedule s;
	Work a = new Work("a",1,3);
	Work b = new Work("b",2,2);
	Work c = new Work("c",3,2);
	Work d = new Work("d",3,1);
	List<Work> l,l2;
	@Before
	public void setup()
	{
		s = new Schedule();
		l = new ArrayList<Work>();
		l.add(a);
		l.add(b);
		l.add(c);
		l2 = new ArrayList<Work>();
		l2.add(c);
		l2.add(b);
		l2.add(d);
	}
	@Test
	public void testFCFS() 
	{
		List<Double> ll = new ArrayList<Double>();
		ll.add(4.0);ll.add(1.8333333333333333);
		List<Double> ld = s.FCFS(l);
		Iterator<Double> j = ll.iterator();
		for(Iterator<Double> i = ld.iterator();i.hasNext(); ){
			assertEquals(j.next(),i.next());
			}
	}

	@Test
	public void testSJF() {
		List<Double> ll = new ArrayList<Double>();
		ll.add(2.6666666666666665);ll.add(1.6666666666666667);
		List<Double> ld = s.SJF(l2);
		Iterator<Double> j = ll.iterator();
		for(Iterator<Double> i = ld.iterator();i.hasNext(); ){
			assertEquals(j.next(),i.next());
			}
	}
	@Test
	public void testGetPriority()
	{
		assertEquals(0,a.getPriority());
	}

}
