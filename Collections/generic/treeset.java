import java.util.*;
class treeset
{
	public static void main(String args[])
	{
		Set<Integer> ts=new TreeSet<Integer>();
		//ts.add("Prasanna");
		ts.add(7);
		//ts.add("Kumar");
		ts.add(3);
		//ts.add("Nuren");
		ts.add(3);
		//ts.add("Traitor");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
/*	treeset contains one datatype elements[unique elements] 
	does not allow duplication of elements
	ascending order in cmd prompt*/