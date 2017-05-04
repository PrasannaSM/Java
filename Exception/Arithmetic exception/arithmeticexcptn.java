import java.lang.*;
class arithmeticexcptn
{
	public static void main(String args[])
	{
		try
		{
			int a=25/5;
			System.out.println("a=25/5\t=>"+a);
			int b=25/0;
		} 
		catch(ArithmeticException e)
		{
			System.out.println("b=25/0\n=>"+e);
		}
	}
}
