class staticblock
{
	static
	{
		System.out.println("Static block....");
	}
	public static void main(String args[])
	{
		System.out.println("main() method block....");
	}
}

//	we can create a class without main() method using static block only in earlier versions of JDK not in jdk1.7.