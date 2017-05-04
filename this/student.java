class student
{
	int id;
	String name;
	student(int id,String name)
	{
		this.id=id;        //to avoid the below issue use this keyword      
		this.name=name;
	}
	void disp()
	{
		System.out.println("ID:"+id+"\tNAME:"+name);
	}
	public static void main(String args[])
	{
		student s1=new student(1,"SM");
		student s2=new student(2,"A3");
		s1.disp();
		s2.disp();
	}
}
/*use same variable name results in default value 
id=id =>id=0
name=name=>name=null*/