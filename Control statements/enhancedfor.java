import java.util.*;
class enhancedfor
{
	public static void main(String args[])
	{
		String b[]=new String[5];
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<5;i++)
			b[i]=obj.nextLine();
		for(String c:b)
			System.out.println(c);
	}
}