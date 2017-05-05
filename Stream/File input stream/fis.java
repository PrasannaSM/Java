import java.io.*;
class fis
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream x=new FileInputStream("a.txt");
		int i;
		while((i=x.read())!=-1)
			System.out.print((char)i);
		x.close();
	}
}