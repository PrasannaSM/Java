class staticmethodaccess
{
	int a=10;
	public static void main(String args[])
	{
		System.out.println(a);
	}
}
/*		non-static variable cannot be referenced from a static context
			so   change 		int a=10; 
					to		static int a=10;			*/