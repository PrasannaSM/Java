//method overriding using super keyword
class vehicle
{
	void move()
	{
		System.out.println("Vehicle is moving");
	}
}
class car extends vehicle
{
	void move()
	{
		super.move();
		System.out.println("Car is moving");
	}
}
class testcar
{
	public static void main(String args[])
	{
		vehicle s=new car();  //base varible pointing derived class i.e.., using reference variable
		s.move();
	}
}
