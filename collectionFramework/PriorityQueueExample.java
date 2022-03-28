package collectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		Queue queue = new PriorityQueue();
		queue.add(45);
		queue.add(56);
		queue.add(12);
		queue.add(88);
		queue.add(56);
		queue.offer(700);
		System.out.println("QUEUE : " +queue);   // 'PriorityQueue' allow only same datatype values , allow duplication, not allow null values ,insertion order not maintain
		
	/*	Queue queue1= new PriorityQueue();
		queue1.addAll(queue);
		//queue1.add(98);
		System.out.println("QUEUE1 : "+queue1);   */
		
	/*	queue.clear();
		System.out.println("QUEUE : " + queue);		*/
		
	/*	boolean result = queue1.contains(56);		   //if you want to check single value is present in collection or not,use contains method,so make object for that first then apply contains method
		System.out.println("no is present in queue1 : "+result);	*/
		
		
	/*	boolean rs= queue1.containsAll(queue); // if u want to check whole collection is present in another collection or not then no need to make object, store result in boolean and it will ans u 
		System.out.println("queue is present in queue1 : "+rs);		*/
		
	/*	System.out.println("Element : "+queue.element()); // element method gives u first element of collection as output, and not remove it from collection
		System.out.println("Queue: "+queue);	*/
		
	//	queue.forEach(abc -> System.out.println(abc)); // for each method use to read/print values one by one.
	
	/*	Iterator itr = queue.iterator();  // iterator is like cursor use to iterate/read elements one by one and perform operations on every element.create itr as referance of iterator
		while(itr.hasNext()) {
			System.out.println(itr.next()); //hasnext method check next element is present in collection or not and next method use to  print element one by one
		} */
		
	/*	Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
			int a = itr.next();
			if(a == 45) {					// if u want to remove perticular element from queue
				itr.remove();
				break;
			}
		}
		
		itr.forEachRemaining(a ->System.out.println(a)); // forEachRemaining method visit/print list of remaining elements after removing particular element.
		System.out.println(queue); 	*/
		
		
	/*	Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
		int a = itr.next();
		if(a == 88) {
			System.out.println(a);
			}
		} 	*/
		
		
	/*	boolean rs = queue.isEmpty();
		System.out.println(rs);		*/
		
		
	/*	queue.offer(99);		// offer() works like add method, with this help we can add values in collection.
		System.out.println(queue);	*/
		
	/*	System.out.println(queue.peek());	// peek() work like element(),in which first element print as o/p,and not remove it from queue. if queue is empty returns null as o/p.
		System.out.println(queue);		*/
	
		
	/*	System.out.println(queue.poll());	//poll() work opposite to peek(),it removes first element from queue. if queue is empty return null as o/p.same work as remove().
		System.out.println(queue);		*/
		
	/*	System.out.println(queue.remove());		//remove()--> removes first element from queue,same work like poll().
		System.out.println(queue);		*/
		
	/*	queue.remove(45);			// u can remove particular element from queue.
		System.out.println(queue);	*/
		
		
		
	/*	Queue queue1 = new PriorityQueue();		// when u hv array, u want to print values in array one by one then create one array , use for loop,use queue.add() and print the queue.
		
		int arr[] = {11,12,13,14,15,16};		//when u want value of array add in queue.so use this.
				
		for (int i = 0; i < arr.length; i++) {
			queue1.add(arr[i]);
		}
		System.out.println("Queue1 : "+queue1);		*/
		
		
	/*	Object[] s = queue.toArray();// when you want values in queue add into an array so use toArray().so create object array.
		for (int i = 0; i < s.length; i++) {
		
			System.out.println(s[i]);
			
		}		*/
		
		

	}

}
