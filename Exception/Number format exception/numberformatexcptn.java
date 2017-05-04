import java.lang.*;
class numberformatexcptn
{
	private static final String s="abc";
	public static void main(String args[])
	{
		try
		{
			System.out.println("s=abc\n=>"+s);
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("\ni=Integer.parseInt(s)\n=>"+e);
		}
		finally
		{
			System.out.println("\nfinally block is executed...");
		}
	}
}