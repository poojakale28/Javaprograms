package collectionFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
			SortedSet set = new TreeSet();		//TreeSet is the child of SortedSet.
			set.add(15);
			set.add(25);
			set.add(63);
			set.add(78);
			set.add(36);
			set.add(28);
			set.add(15);
			System.out.println(" TreeSet : "+set);		 // TreeSet allow only homogeneous dataype values,ascending insertion order maintain,not allow null , not allow duplicates.
			
		/*	set.clear();
			System.out.println(set);	*/
			
		//	System.out.println(set.contains(15));
			
		//	System.out.println(set.first());	//first() -> gives u first element in set.
			
		//	set.forEach(a -> System.out.println(a));
			
		//	System.out.println(set.headSet(36));	//headSet(36) -> becoming set of values before '36'.making set of starting values.
			
		//	System.out.println(set.isEmpty());
			
		/*	Iterator itr = set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}		*/
			
		//	System.out.println(set.last());		//last()-> gives u last element in set.
			
		/*	set.remove(63);
			System.out.println(set);		*/
			
		//	System.out.println(set.size());
			
		//	System.out.println(set.subSet(2, set));
			
		//	System.out.println(set.tailSet(28));		//tailSet(28) ->becoming set of values after '28'. making set of ending values.
			
		/*	 Object[] o = set.toArray();
			 for (int i = 0; i < o.length; i++) {
				 System.out.println(o[i]);
			}		*/
			
			
		}

}
