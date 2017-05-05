import java.io.*;
class isr
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(x);
		System.out.print("Enter name:");
		String name=b.readLine();
		System.out.print("Welcome "+name+"!!!!!");
		x.close();
		b.close();
	}
}