import java.util.Scanner;
class sub
{
	public static void main(String args[])
	{
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter 'a' value:");
		a=obj.nextInt();
		System.out.print("Enter 'b' value:");
		b=obj.nextInt();
		System.out.print("Subtraction value:"+(a-b));
	}
}