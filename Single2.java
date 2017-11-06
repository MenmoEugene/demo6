/*
������ȳ�ʼ������
��Ϊ������ʽ
Single��һ���ڴ棬���Ѿ��������˶��󡣿���һ���ö���ʽ����Ϊ����ȫ��Ҳ�򵥡�
class Single
{
         private static Single s = new Single();
         private Single () {}
         public static Single getInstance()
	{
	       return s;
	}
{
*/
//���󷽷�������ʱ���ų�ʼ����Ҳ�����������ʱ���أ���Ϊ������ʽ��
//Single����ڴ棬����û�д��ڣ�ֻ�е�����getInstance����ʱ���Ž�������
class Single
{
       private static Single s = null;
       private Single (){}
       public static Single getInstance()
	{
		if(s==null)
		{
	  	   synchronized (Single.class)
	  	       {
			if(s==null)
			         s = new Single();
	    	         } 
		  } 
		return s;
	}
}
class Single2
{
	public static void main(String[] args)
	{
		Single ss = Single.getInstance();
	}
}