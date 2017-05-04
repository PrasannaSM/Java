class simple
{
	void show()
	{
		System.out.println("Hi, this is my second java program");
		System.out.println("single main class,another class(type 2)....");
	}
}
class type2
{
	public static void main(String args[])
	{
			simple obj=new simple();
			obj.show();
	}
}