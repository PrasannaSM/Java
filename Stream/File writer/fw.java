import java.io.*;
class fw
{
	public static void main(String args[]) throws Exception
	{
		FileWriter x=new FileWriter("a.txt");
		x.write("Prasanna");
		x.flush();
		x.close();
	}
}