class A
{
	int x,y;
	A(int a,int b)
	{
		x=a;
		y=b;
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
class para
{
	public static void main(String args[])
	{
		A obj=new A(2,3);//parameterised constructor
		obj.msg();//method calling
		int c=obj.add();//method with return type
		obj.disp(c);//method with parameters
	}
}