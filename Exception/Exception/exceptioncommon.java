//import java.lang.*;
class exceptioncommon
{
	public static void main(String args[])
	{
		try
		{
			int a;
			System.out.println("a=25/0");
			a=25/0;
		}
		catch(Exception e)
		{
			System.out.println("=>");
			e.printStackTrace();		// To print the line number of statement that invokes exception
		}
		finally
		{
			System.out.println("\nfinally block is executed...");
		}
	}
}
