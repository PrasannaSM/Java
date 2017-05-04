class a
{
	a()
	{
		System.out.println("base class");
	}
	void disp()
	{
		System.out.println("base class-disp()");
	}
}
class b extends a
{
	b()
	{
		System.out.println("Derived class");
	}
	void show()
	{
		System.out.println("base class-show()");
	}
}
public class multilevel extends b
{
	public static void main(String args[])
	{
		b obj=new b();
		obj.disp();
		obj.show();
	}	
}