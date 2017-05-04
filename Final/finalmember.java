class bike 
{
	final int speed=90;
	void run()
	{
		//speed=60;
		System.out.println("speed:"+speed);
	}
}
class finalmember
{
	public static void main(String srgs[])
	{
		bike s=new bike();
		s.run();
	}
}
//cannot assign a value to a final variable