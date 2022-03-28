package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSortMethod {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();	 //<Integer> means ArrayList made generic,means only Integer data values can add,to perform sort(). Sort() arrange data in ascending/descending.
		
		list.add(69);
		list.add(9);
		list.add(15);
		list.add(78);
		list.add(49);
		list.add(4);
		
		System.out.println(list);	// insertion order maintain
		
		//when you want to perform Sort(),use only Integer values,because,only integer values can arrange ascending/descending.
		
		list.sort(new Comparator<Integer>(){	//insertion order maintain but if u want to arrange data in ascending/ descending order then use sort() of collection.

			@Override
			public int compare(Integer o1, Integer o2) {		// sort() apply only on integer data values.So when you create object of ArrayList make it generic means <Integer>. generic as <integer> if you want to apply sort().
				
				return o1.compareTo(o2); // list sort in ascending order.
				
				//return o2.compareTo(o1);	//list sort in descending order.
			}
			
		});
		System.out.println(list);
		
		
	}
}
