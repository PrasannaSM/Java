import java.util.*;
class hashset
{
	public static void main(String args[])
	{
		Set<Integer> hs=new HashSet<>();
		//hs.add("Prasanna");
		hs.add(7);
		//hs.add("Kumar");
		hs.add(3);
		//hs.add("Nuren");
		hs.add(3);
		//hs.add("Traitor");
		for(int a:hs)
			System.out.println(a);
	}
}
//	ordered insertion[order in which insertion is done is the same as in displaying] and eliminates duplication of elements.