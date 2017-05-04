					//Type 2:		2 interfaces extended and implemented by a class
interface D
{
	void disp();
}					
interface E extends D
{
	void show();
}
class sm implements E
{
	public void disp()
	{
		System.out.println("disp() method declared in interface D");
	}
	public void show()
	{
		System.out.println("show() method declared in interface E");	
	}
}
class bac
{
	public static void main(String args[])
	{
			sm obj=new sm();
			obj.disp();
			obj.show();			
	}
}
/*								interface		
									|
								 extends
									|
								interface
									|
								implements
									|
								  class		*/

