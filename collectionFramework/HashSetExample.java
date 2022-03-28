package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("shree");
		set.add(25);
		set.add('d');
		set.add(4.1);
		set.add(null);
		set.add('d');
		set.add(true);
		System.out.println("set : "+set);	// duplicate not allowed , null allowed, insertion order not maintain,it gives o/p as per HashTable.
		
	/*	Object set1 = set.clone();
		System.out.println("set1 : "+set1);		*/
		
	/*	set.clear();
		System.out.println("set : "+set);	*/
		
	//	System.out.println(set.contains(25));
		
	//	System.out.println(set.equals(set1));
		
	//	set.forEach(a -> System.out.println(a));
		
	//	System.out.println(set.isEmpty());
		
	/*	set.remove(4.1);
		System.out.println(set);	*/
		
	/*	Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}	*/
		
	//	System.out.println(set.size());
		
	/*	Object[] o = set.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}		*/
		
		
	}
}
