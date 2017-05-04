import java.util.*;
//import java.io.*;
class control
{
	public static void main(String args[])
	{
		int ch,z=0,i=1;
		Scanner obj=new Scanner(System.in);
		do
		{
			System.out.println("\t\tCONTROL STATEMENTS");
			System.out.println("1.if");
			System.out.println("2.if...else");
			System.out.println("3.for loop");
			System.out.println("4.enhanced for loop");
			System.out.println("5.while");
			System.out.println("Enter your choice:");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("IF");
					System.out.print("Enter a number:");
					int a=obj.nextInt();
					if(a>10)
						System.out.println("The given number is greater than 10");
					break;
				case 2:
					System.out.println("IF...ELSE");
					System.out.print("Enter a number:");
					int b=obj.nextInt();
					if(b>10)
						System.out.println("The given number is greater than 10");
					else
						System.out.println("The given number is lesser than than 10");
					break;
				case 3:
					System.out.println("FOR");
					System.out.println("Numbers from 1 to 5:");
					for(i=1;i<=5;i++)
						System.out.println(i);
					break;
				case 4:
					System.out.println("ENHANCED FOR");
					//int a[]=new int[3];
					int c[]={1,2,3};
					for(int j:c)
						System.out.println(j);
					break;
				case 5:
					System.out.println("WHILE");
					System.out.println("Numbers from 1 to 5:");
					while(i<=5)
					{
						System.out.println(i);
						i++;
					}
					break;
				default:
					System.out.println("Thank you.....");
			}
			System.out.println("Press '1' to continue...");
			z=obj.nextInt();
		}while(z>0);
	}
}
