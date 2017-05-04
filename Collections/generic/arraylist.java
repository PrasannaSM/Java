import java.util.*;
class arraylist
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Prasanna");
		//al.add(7);
		al.add("Kumar");
		//al.add(3);
		al.add("Nuren");
		al.add("Nuren");
		//al.add(3);
		al.add("Traitor");
		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
//	NOTE FOR ME:	never mind compile time error just execute the program.
//	same order of insertion and allows duplication of elements.