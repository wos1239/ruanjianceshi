package 测试1;

import org.junit.*;

public class sjxTest {
	sjx s;
	@Before
	public void SetUp()
	{
		s = new sjx();
	}
	
	@Test 
	public void tests()
	{
		Assert.assertEquals("不能判断是否为三角形","不是三角形",s.f(1,1,2));
		Assert.assertEquals("不能判断是否为等边三角形","等边三角形",s.f(1,1,1));
		Assert.assertEquals("不能判断是否为等腰三角形","等腰三角形",s.f(2,2,3));
		Assert.assertEquals("不能判断是否为一般三角形","一般三角形",s.f(3,4,6));
	}

}
