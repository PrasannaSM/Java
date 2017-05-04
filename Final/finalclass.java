final class A
{
	void run()
	{
		System.out.println("run() method in final base class....");
	}
}
class B extends A
{
	void run()
	{
		System.out.println("run() method in derived class....");
	}
}
class C
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.run();
	}
}
//		final class cannot be inherited...