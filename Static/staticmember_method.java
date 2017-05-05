class staticmember_method
{
	static int a=42,b=99;
	static void call()
	{
		System.out.println("a:"+a);
	}
	public static void main(String args[])
	{
		staticmember_method.call();
		System.out.println("b:"+staticmember_method.b);
	}
}
// static methods and static members are called using the class name but not object.No need for object.