package ����1;

public class sjx {
	public String f(int a,int b,int c)
	{
		if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a) return "����������";
		if(a == b&&b == c) return "�ȱ�������";
		else if(a == b||b == c) return "����������";
		else return "һ��������";
	}
}
