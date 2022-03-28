package collectionFramework;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinklistExample {

	public static void main(String[] args) {

		// LinkList is a child of List and also Deque. So all methods of Deque and List used in LinkList. combination of list methods and deque methods are in LinkList.
				
				LinkedList linklist = new LinkedList(); 	// If u want to used all methods of List as well as Deque,so make Object like this.
				//List linklist = new LinkedList();			//	If u want to used all methods of List then make object like this.It will give u all methods of only List.
				//Deque linklist = new LinkedList();		// If u want to used all methods of Deque then make object like this.It will give u all methods of only Deque
				
				linklist.add('p');
				linklist.add(0, 88);
				linklist.push("String");
				linklist.offerFirst(123);
				linklist.push(123);
				linklist.offerLast(3.89);
				linklist.addFirst(189);
				linklist.offerFirst(null);
				
				System.out.println("linklist : "+linklist);		// allows null, allows duplication, allow different dataype values, insertion order maintain.
				
			/*	linklist.clear();						
				System.out.println(linklist);	*/
				
			/*	Object linklist1 = linklist.clone();
				System.out.println("linklist1 : "+linklist1);	*/
				
			/*	boolean rs = linklist.contains("class");
				System.out.println(rs);		*/
				
			//	System.out.println(linklist.element());		//first element in collection return krte
				
			//	System.out.println(linklist.peek());		//first element in collection return krte .	
				
			//	System.out.println(linklist.peekFirst());
				
			//	linklist.forEach(a -> System.out.println(a));
				
			/*	Object i = linklist.get(4);
				System.out.println(i);		*/
				
			/*	Object i = linklist.getFirst();
				System.out.println(i);		*/
				
			/*	Object i = linklist.getLast();
				System.out.println(i);		*/
				
			/*	linklist.indexOf('p');
				System.out.println(linklist);	*/
				
			/*	 boolean rs = linklist.isEmpty();
				 System.out.println(rs);		*/
				
			/*	Object i = linklist.peekLast();
				System.out.println(i);		*/
				
			/*	Object i = linklist.poll();
				System.out.println(i);
				System.out.println(linklist);	*/
				
			/*	Object i = linklist.pollFirst();
				System.out.println(i);
				System.out.println(linklist);	*/
				
			/*	Object i = linklist.pollLast();
				System.out.println(i);
				System.out.println(linklist);	*/
				
			/*	Object i = linklist.remove();
				System.out.println(i);
				System.out.println(linklist);	*/
				
			/*	Object i = linklist.pop();
				System.out.println(i);
				System.out.println(linklist);	*/
				
			/*	linklist.set(1, 999);
				System.out.println(linklist);	*/
				
			/*	int i = linklist.size();
				System.out.println(i);		*/
				
			/*	List list = linklist.subList(2, 6);
				System.out.println(list);	*/
				
			/*	Iterator itr = linklist.descendingIterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}		*/
				
			/*	Iterator itr = linklist.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}		*/
				
				
			/*	Iterator itr = linklist.listIterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}		*/
				
				
			/*	Object[] s = linklist.toArray();
				for (int i = 0; i < s.length; i++) {
					
					System.out.println(s[i]);
					
				}		*/
				
			}

}
