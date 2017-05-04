class e
{
	enum a{sm,qw,as}
	a b;
}
class enumeration
{
	public static void main(String args[])
	{
		e obj=new e();
		obj.b=e.a.sm;
		System.out.println("b:"+obj.b);
	}
}
//			enumeration only  for strings