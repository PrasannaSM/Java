class a
{
	int x,y;
	a()
	{
		x=1;
		y=2;
	}
	int add()
	{
		return (x+y);
	}
	void msg()
	{
		System.out.println("ADDITION OPERATION");
	}
	void disp(int z)
	{
		System.out.println("Addition result:"+z);
	}
}
class defa
{
	public static void main(String args[])
	{
		a obj=new a();//default constructor
		obj.msg();//method calling
		int c=obj.add();//method with return type
		obj.disp(c);//method with parameters
	}
}