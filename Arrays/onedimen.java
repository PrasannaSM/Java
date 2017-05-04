import java.util.*;
class onedimen
{
	public static void main(String args[])
	{
		//int a[]=new int[5];
		int a[]={1,2,3,4,5};
		System.out.println(a[3]);
		String b[]=new String[5];
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<5;i++)
			b[i]=obj.nextLine();
		for(String c:b)
			System.out.println(c);
	}
}
