package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_iterationOfList {

	public static void main(String[] args) {

	ArrayList<Integer> list = new ArrayList<Integer>();	 
			list.add(69);
			list.add(9);
			list.add(15);
			list.add(78);
			list.add(49);
			list.add(4);
				
			System.out.println(list);
			
/*		Iterator itr = list.iterator();		// Iterator works in only forward direction.Iterator can Iterate(read) values from left to right one by one.
	while (itr.hasNext()) {				// hasNext() check more element present or not list.
		int i = (int) itr.next();		//next() used to print next value.
		if(i == 15) {
			itr.remove();				//remove() -> removes particular value
			break;						// after removing any value,no need to check remaining values in list.so use break.
		}
	}
	itr.forEachRemaining(a -> System.out.println(a));		//forEachRemaining() -> used to visit remaining value in list which is not visited because of break.
	System.out.println(list);			*/
			
			
	ListIterator<Integer>  itr = list.listIterator();	//ListIterator() work in forward and backback direction both.we can read values from right to left and left to right.
	while (itr.hasNext()) {
		int i = itr.next();
			//itr.previous());							//in ListIterator(), we have previous(),previousIndexOf(),add(),set(),remove() methods.
			//System.out.println(itr.previousIndex());
		
			if(i == 78) {
				
					//itr.add(66);			//add '66' after '78' in list.
					//itr.set(712);			// replace '712' in place of '78' in list.
					//itr.remove();			// remove '78' from list.
			}
		
		
	}
	//itr.forEachRemaining(a-> System.out.println(a));
	System.out.println(list);		
	
	

				
}

}
