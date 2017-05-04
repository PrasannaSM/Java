abstract class motorvehicle
{
	motorvehicle()
	{
		System.out.println("Motor vehicle is running...");
	}
	abstract void run();
	void gear()
	{
		System.out.print("Gear is changed");
	}
}
class car extends motorvehicle
{
	void run()
	{
		System.out.println("Running vehicle is car...");
	}
}
class xyz
{
	public static void main(String args[])
	{
		car obj=new car();
		obj.run();
		obj.gear();
	}
}
//		abstract class with an abstract method and concerte method