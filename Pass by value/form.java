class passbyvalue
{
	String name,sex;
	int age,sal,exp;
	void set(String a,int b,String c,int d,int e)
	{
		name=a;
		age=b;
		sex=c;
		exp=d;
		sal=e;
	}
	void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Sex:"+sex);
		System.out.println("Experience:"+exp);
		System.out.println("Salary:"+sal);
	}
}
class form
{
	public static void main(String args[])
	{
		passbyvalue f=new passbyvalue();
		f.set("SM",18,"MALE",3,99999);
		f.print();
	}
}
