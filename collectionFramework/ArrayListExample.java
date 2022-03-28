package collectionFramework;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayListExample {

	public static void main(String[] args) {

		//	List list = new ArrayList();	//ArrayList is the child of list. 
			ArrayList list = new ArrayList();

			list.add(45);
			list.add(null);		//null values are allowed
			list.add('d');
			list.add("Dog");
			list.add(true);
			list.add('d');		//repeated values are allowed
			
			System.out.println("ArrayList = "+list);	// maintain insertion order,allow null,allow duplications,allow different datatypes values(allow heterogeneous data)
			
		/*	list.add(0, 'k');							// u can add values with help of index.
			System.out.println("ArrayList = "+list);		*/
			
		/*	Queue queue = new PriorityQueue();
			queue.add(45);
			queue.add(56);
			queue.add(12);
			queue.add(88);
			System.out.println("QUEUE : " +queue);	
			
			list.addAll(queue);							// using addAll() u can add whole different collection in list.
			System.out.println(list);	*/
			
		/*	list.addAll(1, queue);						// u can also add whole collection in list with help of index.
			System.out.println(list);		*/
			
		//	System.out.println(list.contains('d'));		//contain() used to check that single value present in collection or not.
			
		//	System.out.println(list.containsAll(queue));	
			
		//	System.out.println(list.equals(queue));		//equals() used to check another collection is present or not. returns result in true / false.
			
		//	System.out.println(list.get(3));			//get() in which we have to pass index. In o/p we can get values of that particular index.
			
		//	System.out.println(list.indexOf(45));		//indexOf()--> gives you index of value which is we pass.
			
		//	System.out.println(list.isEmpty());			//isEmpty()--> it is check whether your collection is empty or not.
			
		//	System.out.println(list.indexOf('d'));
		//	System.out.println(list.lastIndexOf('d'));	//lastIndexOf()--> if u hv any value is repeated then to know the index of second duplicate value use lastIndexOf().
			
		/*	System.out.println(list.remove(2));			//remove()-->	this method used to remove perticular index value .removeAll() used to remove whole collection.
			System.out.println(list);		*/
			
		/*	System.out.println(list.set(3, false));		//set()--> used to replace any value by another value with index.
			System.out.println(list);		*/
			
		//	System.out.println(list.size());			// size()--> use to know the size(total no.of values present in collection) of collection.
			
		//	System.out.println(list.subList(2, 5));		//subList()--> use to create list between two index.i.e., subList(start index, end index).with this help u can sublist your collection.
			
		//	list.forEach(a-> System.out.println(a));
			
		/*	Object list1 = list.clone();			// clone()-> with the help of clone(), we can make xerox copy of list collection as it is.
			System.out.println("list1 = "+list1);	*/
			
		/*	for (int i = 0; i < list.size(); i++) {		//size()--> use to know the size(total no.of values of collection. u can use for loop for read values one by one
				
				System.out.println(list.get(i));		// using get() use can get value of particular index.so pass 'i' in get(),we can get all values in collection one by one
				
			}	*/	
			
			
		/*	Object[] s = list.toArray();
			
			for (int i = 0; i < s.length; i++) {
				
				System.out.println(s[i]);
			}		*/	
			
			
	}
}
