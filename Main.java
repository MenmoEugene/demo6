/*
public static void main(String[] args)

����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm���á�
���壺
public�������Ÿú�������Ȩ�������ġ�
static������������������ļ��ؾ��Ѿ������ˡ�
void��������û�о���ķ���ֵ��
main�����ǹؼ��֣�����һ������ĵ��ʣ����Ա�jvmʶ��
     ��String[] args��:�����Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ������͵����顣
�������ǹ̶���ʽ�ģ�jvmʶ��
jvm�ڵ���������ʱ���������new String[0]��

cmd: javac Main.java      java Main   X M L
*/
class Main
{
	public static void main(String[] args)
	{
	       
		for(int x=0;x<args.length;x++)
		{
	       		System.out.println(args[x]);
		}System.out.println(args.length);
	}
}