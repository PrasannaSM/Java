							//TYPE 1:    2 interfaces implemented by a class
interface B
{
	void show();
}
interface C
{
	void disp();
}
class abc implements B,C
{
	public void disp()
	{
		System.out.println("disp() method declared in interface C");
	}
	public void show()
	{
		System.out.println("show() method declared in interface B");	
	}
}
class xyz
{
	public static void main(String args[])
	{
		abc obj=new abc();
		obj.disp();
		obj.show();
	}
}
/*		interface							interface
			\									/
				\							/
					\	  implements	/
						\			/
							\	/	
							class		*/