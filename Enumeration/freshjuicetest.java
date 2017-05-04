class freshjuice
{
	enum freshjuicesize{SMALL,MEDIUM,LARGE}
	freshjuicesize size;
}
class freshjuicetest
{
	public static void main(String args[])
	{
		freshjuice juice=new freshjuice();
		juice.size=freshjuice.freshjuicesize.MEDIUM;
		System.out.println("Fresh Juice Size:"+juice.size);
	}
}