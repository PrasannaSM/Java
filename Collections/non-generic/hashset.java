import java.util.*;
class hashset
{
	public static void main(String args[])
	{
		Set hs=new HashSet();
		hs.add("Prasanna");
		hs.add(7);
		hs.add("Kumar");
		hs.add(3);
		hs.add("Nuren");
		hs.add(3);
		hs.add("Traitor");
		System.out.println(hs);
	}
}
//	no order of insertion[order in which insertion is done is not the same as in displaying] and eliminates duplication of elements.