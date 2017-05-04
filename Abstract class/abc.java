abstract class bike
{
	abstract void run();
}
class hero extends bike
{
	void run()
	{
		System.out.println("bike is running.....");
	}
}
class abc
{
	public static void main(String args[])
	{
		//bike obj=new hero();
		hero obj=new hero();
		obj.run();
	}
}
//	abstract class with an abstract method run()