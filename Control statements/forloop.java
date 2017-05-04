class forloop
{
    public static void main(String args[])
	{
        int c=0;
        int n=6;
        loop1: for(int i=1;i<=n;i++)
		{
			loop2: for(int j=1;j<=i;j++)
			{
				if(c!=n)
				{
                    c++;
                    System.out.print(c+" ");
                }
                else
                    break loop1;
            }
            System.out.print("\n");
        }
    }
}
