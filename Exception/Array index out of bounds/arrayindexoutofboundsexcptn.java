import java.lang.*;
class arrayindexoutofboundsexcptn
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			for(int i=0;i<5;i++)
				a[i]=i;
			for(int b:a)
				System.out.println("a["+b+"]=>"+b);			
			System.out.println("\ntrying a[5]=5.....\n=>");
			a[5]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("\nfinally block is executed...");
		}
	}
}