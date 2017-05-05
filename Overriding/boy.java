class human
{
	public void eat()  //void eat()
	{
		System.out.println("Human is eating");
	}
}
class boy extends human
{
	public void eat()  //void eat()
	{
		System.out.println("boy is eating");
	}
	public static void main(String args[])	
	{
			boy obj=new boy(); //boy is eating
			//or
			//human obj=new human();  //human is eating
			obj.eat();
	}
}
