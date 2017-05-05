import java.io.*;
class cnsl
{
	public static void main(String args[]) throws Exception
	{
		Console c=System.console();
		System.out.print("Enter name:");
		//String name=c.readLine();
		System.out.print("Welcome "+c.readLine()+"!!!!!");
	}
}