import java.io.*;
class pattern
{
	public static void main(String args[])
	{
		int i,j;
		char ch='*';
		for(i=1;i<=4;i++)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
		}
		for(i=3;i>=1;i--)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
		}
	}
}