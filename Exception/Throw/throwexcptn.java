import java.util.*;
class ageinvalid extends Exception
{
	ageinvalid()
	{
		System.out.println("age is invalid");
	}
}
class test extends ageinvalid
{
	Scanner s=new Scanner(System.in);
	void process()
	{
		System.out.print("Enter age:");
		int age=s.nextInt();
		try
		{
			if(age>100)
				throw new ageinvalid();
			else
				System.out.println("Age:"+age);
		}
		catch(Exception e)
		{}
	}
}
class throwexcptn
{
	public static void main(String[] args)
	{
		test t=new test();
		t.process();
	}
}
//			throw is used to define a user-defined exception...