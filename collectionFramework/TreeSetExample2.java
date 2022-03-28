package collectionFramework;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();	// when u create obj like this methods are here. in other TreeSetExample, all common methods of set are cover. here new methods.
			
			set.add("shree");
			set.add("pooja");
			set.add("aish");
			set.add("vanita");
			set.add("golu");
			
			System.out.println(" Treeset set11 : "+set);	// data arrange alphabetically.TreeSet allow only homogeneous dataype values,ascending insertion order maintain
			
		//	System.out.println(set.ceiling("m"));		// ceiling() -> return upper values than the alphabet which is we pass. and this is treeset method not of set method.
		//	System.out.println(set.ceiling("g"));		//ceiling() -> if passing  alphabet value is present in set then return that value as o/p.
			
		/*	Iterator itr = set.descendingIterator();	//descendingIterator() -> gives u value in descending order.
			while (itr.hasNext()) {
				System.out.println(itr.next());
				
			}*/
			
		/*	NavigableSet set1 = set.descendingSet();	//descendingSet() -> printing set in desceding order.
			System.out.println(set1);	*/
			
		//	System.out.println(set.floor("c"));	//floor() -> work opposite to ceiling(). floor() gives you value less than or equal to alphabet which is we pass.so value less than 'c' is 'a' so aish in o/p
			
		//	System.out.println(set.higher("t"));	//higher() -> work same like ceiling(), gives u higher element than the alphabet which is passing.greater than 't' is 'v' . so o/p is 'vanita' .
			
		/*	set.pollFirst();		//pollFirst() -> removes the first element from set.
			System.out.println(set);	*/
			
		/*	set.pollLast();			/pollLast() -> removes the last element from set.
			System.out.println(set);	*/
			
//			System.out.println(set.lower("p"));		//lower() -> work opposite to higher(), give u value as o/p less than passing alphabet.
			
		}
}
