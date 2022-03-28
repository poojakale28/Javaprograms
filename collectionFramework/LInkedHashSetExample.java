package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LInkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();
		set.add("shree");
		set.add(25);
		set.add('d');
		set.add(4.1);
		set.add(null);
		set.add('d');
		set.add(true);
		System.out.println(" LinkedHashSet : "+set); // insertion order maintain, null allow ,duplicates not allow.
		
	/*	set.clear();
		System.out.println(set);	*/
		
	/*	Object set1 = set.clone();
		System.out.println(set1);	*/
		
	//	System.out.println(set.contains('k'));
		
	//	System.out.println(set.equals(set1));
		
	//	System.out.println(set.isEmpty());
		
	/*	Iterator itr = set.iterator();		//iterator() -> use to iterate(read) values and perform opertion on values.
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}		*/
		
	//	set.forEach(a -> System.out.println(a));		// method used to read values in collection only.
		
	/*	set.remove(true);
		System.out.println(set);	*/
		
	//	System.out.println(set.size());
		
	/*	Object[] o = set.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}	*/
		
	}

	
}
