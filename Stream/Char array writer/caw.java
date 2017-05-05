import java.io.*;
class caw
{
	public static void main(String args[])throws Exception
	{
		CharArrayWriter c=new CharArrayWriter();
		c.write("Prasanna");
		FileWriter f1=new FileWriter("a.txt");
		FileWriter f2=new FileWriter("b.txt");
		c.writeTo(f1);
		c.writeTo(f2);
		f1.close();
		f2.close();
		c.flush();
	}
}