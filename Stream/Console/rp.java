import java.io.*;
class rp
{
	public static void main(String args[]) throws Exception
	{
		Console c=System.console();
		System.out.println("Enter password:");
		char[] ch=c.readPassword();
		System.out.println("Password:");
		for(char ch1:ch)
			System.out.print(ch1);
	}
}