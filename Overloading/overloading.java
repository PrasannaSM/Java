class methoverload
{
	void demo(int a)
	{
		System.out.println("a: "+a);
	}
	void demo(int a,int b)
	{
		System.out.println("a: "+a+"\tb: "+b);
	}
	double demo(double x)
	{
		return x*x;
	}
}
class overloading
{
	public static void main(String args[])
	{
		methoverload obj=new methoverload();
		obj.demo(2);
		obj.demo(2,3);
		double sqr=obj.demo(2.1);
		System.out.println("SQUARE OF 2.1:"+sqr);
	}
}