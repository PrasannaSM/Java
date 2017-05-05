import java.io.*;
class fr
{
	public static void main(String args[]) throws Exception
	{
		FileReader x=new FileReader("a.txt");
		int i;
		while((i=x.read())!=-1)
			System.out.print((char)i);
		x.close();
	}
}