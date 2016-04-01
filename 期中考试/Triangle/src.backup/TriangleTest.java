import static org.junit.Assert.*;

import org.junit.*;

public class TriangleTest {

	Triangle a;
	Triangle b;
	Triangle c;
	Triangle d;
	Triangle e;
	@Before
	public void setup()
	{
		a = new Triangle(-1,2,2);
		b = new Triangle(1,2,3);
		c = new Triangle(2,2,2);
		d = new Triangle(2,2,3);
		e = new Triangle(2,3,4);
	}
	@Test
	public void testIsTriangle() 
	{
		assertEquals(false,a.isTriangle(a));
		assertEquals(false,b.isTriangle(b));
		assertEquals(true,c.isTriangle(c));
	}

	@Test
	public void testGetType() {
		assertEquals("Illegal",a.getType(a));
		assertEquals("Regular",c.getType(c));
		assertEquals("Isosceles",d.getType(d));
		assertEquals("Scalene",e.getType(e));
	}
	@Test
	public void testGetBorders()
	{
		long [] an = {-1,2,2};
		long [] bn = a.getBorders();
		assertEquals(an[0],bn[0]);
		assertEquals(an[1],bn[1]);
		assertEquals(an[2],bn[2]);
	}

}
