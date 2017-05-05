import java.io.*;
class bis
{
	public static void main(String args[]) throws Exception
	{
		BufferedInputStream x=new BufferedInputStream(new FileInputStream("a.txt"));
		int i;
		while((i=x.read())!=-1)
			System.out.print((char)i);
		x.close();
	}
}