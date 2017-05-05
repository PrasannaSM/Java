class base
{
	public void methoverride()   //void methoverride()
	{
		System.out.println("Base method");
	}
}
class derived extends base
{
	public void methoverride()   //void methoverride()
	{
		System.out.println("Derived method");
	}
}
class test 
{
	public static void main(String args[])
	{
		base obj=new derived();  //method overriding using reference variable
		obj.methoverride();
	}
}