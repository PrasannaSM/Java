interface intf
{
	void disp();
}
class A implements intf
{
	public void disp()
	{
		System.out.println("Hi");
	}
}
class intrfcecls
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.disp();
	}
}