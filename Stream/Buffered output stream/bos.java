import java.io.*;
class bos
{
	public static void main(String args[]) throws Exception
	{
		BufferedOutputStream x=new BufferedOutputStream(new FileOutputStream("a.txt"));
		x.write("Prasanna".getBytes());
		x.flush();
		x.close();
	}
}