package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class ArrayDequeEx {

// deque is double ended queue. means you can insert or remove elements from start and also from end.

		public static void main(String[] args) {
			
			Deque de = new ArrayDeque();
			
			de.offerFirst('c');
			de.add(25);			// add(),push(),offer() works same. these methods used to add values in deque.
			de.push(3.14);
			de.offer(true);
			de.add("string");
			de.addFirst("string");
			de.offerLast("hello");
			System.out.println(de); // insertion order maintain.,null not allowed , duplication is allowed, different datatype values are allowed (hytrogeneous values add).
			
		/*	de.clear();
			System.out.println(de);		*/
			
		/*	boolean rs = de.contains('e');			//contains()--> use to check the value present in deque or not.
			System.out.println(rs);	*/
			
		//	System.out.println(de.element());
		
		//	System.out.println(de.peek());  		//peek() and element() and getFirst() all methods works same. it will give u first element as o/p.
			
		//	System.out.println(de.getFirst());		//getFirst() gives you last element as o/p.
			
		//	System.out.println(de.getLast());		//getLast() gives you last element as o/p.
			
		/*	boolean re = de.isEmpty();				//isEmpty() tells you queue is empty or not.o/p returns in true/false.
			System.out.println(re);		*/
			
		//	System.out.println(de.peekFirst());		// getFirst() and peekFirst() gives you first element in o/p.
			
		//	System.out.println(de.peekLast());		// getLast() and peekLast() gives you last element in o/p.
			
		/*	de.poll();
			System.out.println(de);		*/
			
		/*	de.pollFirst();							// poll() and pollFirst()--> works same. it removes first element from deque.
			System.out.println(de);		*/
			
		/*	de.pop();								// pop()--> works like remove() and removeFirst().It is removes first element from deque.
			System.out.println(de);		*/
			
		/*	de.remove();
			System.out.println(de);		*/
			
		/*	de.removeLast();						//It is removes first element from deque.
			System.out.println(de);		*/
			
		/*	int i = de.size();						// size()--> return size(total count) of queue.
			System.out.println(i);		*/
			
		/*	Iterator itr = de.iterator();			// if u want to perform any operation on perticular element use Iterator. Iterator works in forward direction. MEans gives o/p from start to end values.
			while (itr.hasNext()) {
				
				System.out.println(itr.next());
			}
			*/
			
		// de.forEach(a -> System.out.println(a));		// forEach()--> using this method,u can  only read values from deque one by one.
		
			
		/*	Iterator itr = de.descendingIterator();		// If you want values from queue in descending order so use descendingIterator().
			while (itr.hasNext()) {
				System.out.println(itr.next());
				
			}	*/
			
		/*	Object []o = de.toArray();		//if u use toArray(),then use length,if u not use array and directly using for loop then use size().to provide size of collection.
			for (int i = 0; i < o.length; i++) {
				System.out.println(o[i]);
			}		*/		
		
		}
		
	}

