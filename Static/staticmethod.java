class staticmethod
{
	static int cube(int x)
	{
		return x*x*x;
	}
	public static void main(String args[])
	{
		int result=staticmethod.cube(5);
		System.out.print("Cube of 5:"+result);
	}
}
