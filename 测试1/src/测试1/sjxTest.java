package ����1;

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
		Assert.assertEquals("�����ж��Ƿ�Ϊ������","����������",s.f(1,1,2));
		Assert.assertEquals("�����ж��Ƿ�Ϊ�ȱ�������","�ȱ�������",s.f(1,1,1));
		Assert.assertEquals("�����ж��Ƿ�Ϊ����������","����������",s.f(2,2,3));
		Assert.assertEquals("�����ж��Ƿ�Ϊһ��������","һ��������",s.f(3,4,6));
	}

}
