import java.util.*;
class map
{
	public static void main(String args[])
	{
		Map m=new HashMap();
		m.put("key 1",10);
		m.put("key 2",20);
		m.put("key 3",30);
		//m.put("key 3",40);
		m.put("key 4",20);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
	}
}
//	allows duplication of values but if key is duplicated, the latest value in that persists.