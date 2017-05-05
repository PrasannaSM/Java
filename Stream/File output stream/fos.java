import java.io.*;
class fos
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream x=new FileOutputStream("a.txt");
		x.write("Prasanna".getBytes());
		x.close();
	}
}