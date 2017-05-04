class multiplecatches
{
	public static void main(String args[])
	{
		try
		{
			int a[]={0,1,2,3};
			int b=25/0;
			a[4]=4;
		}
		catch(ArithmeticException e)
		{
			System.out.println("b=25/0\n=>"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("a[4]=4\n=>"+e);
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}     */
		finally
		{
			System.out.println("\nfinally block is executed...");
		}
	}
}