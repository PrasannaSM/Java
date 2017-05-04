import java.lang.*;
class nullpointerexcptn
{
	public static void main(String args[])
	{
		try
		{
			String s1="SM",s2=null;
			System.out.println("s1:"+s1);
			System.out.println("s1.length()\n=>"+s1.length());
			System.out.println();
			System.out.println("s2"+s2);
			System.out.println(s2.length());
			System.out.println();
		}
		catch(NullPointerException e)
		{
			System.out.println("s2.length()\n=>"+e);
		}
		finally
		{
			System.out.println("\nfinally block is executed...");
		}
	}
}