class counter
{
	static int count=0;
	int count1=0;
	counter()
	{
		count++;
		count1++;
		System.out.println("\t"+count+"\t"+count1);
	}
}
class staticmember
{
	public static void main(String args[])
	{
		System.out.println("STATIC COUNT\tCOUNT1");
		counter s1=new counter();
		counter s2=new counter();
		counter s3=new counter();
	}
}