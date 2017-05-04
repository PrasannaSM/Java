class bike
{
	final void run();
	{
		System.out.println("base class final method run()...");
	}
}
class hero extends bike
{
	void run()
	{
		System.out.println("Derived class method run() overriding base class final method run()...");
	}
}
class finalmethod
{
	public static void main(String args[])
	{
		hero obj=new hero();
		obj.run();
	}
}
//		final method cannot be overridden