class A
{	
	int  i,j;
	A(int a,int b)
	{
		i=a;
		j=b;
	}
	void show()
	{
		System.out.println("i:"+i+"\tj:"+j);
	}
}
class B extends A
{
	int k;
	B(int a,int b,int c)
	{	
		super(a,b);  //constructor override
		k=c;
	}
	void show()     //base method show() is overriden by derived method show()
	{
		System.out.println("k:"+k);
	}
}
class constructoroverride
{
	public static void main(String args[])
	{
			B s=new B(1,2,3);   //parameterised constructor 
			s.show();          //method override
	}
}
/*
Output:
k=3*/
