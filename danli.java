/*
�������ģʽ�����һ�������ڴ�ֻ����һ������

˼·����Ҫ��֤����Ψһ��
1��Ϊ�˱�������������ཨ�����������Ҫ�Ƚ�ֹ�����������������
2����Ϊ��������������Է��ʵ��������ֻ���ڱ������Զ���һ������
3��Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

���ʵ���������Ĵ���
1�������캯��˽�л���
2�������д���һ���������
3���ṩһ���������Ի�ȡ���ö���
*/

class Single
{
       private int num;
       public void setNum(int num)
	{
	      this.num = num;
	}
       public int getNum()
	{
	      return num;
	}
       private Single(){}
       private static Single s = new Single();
       public static Single getInstance()
       {
	return  s;
       }
}

class danli
{
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setNum(23);
		s2.setNum(21);
		System.out.println(s2.getNum());
		System.out.println(s1.getNum());
	}
}








































