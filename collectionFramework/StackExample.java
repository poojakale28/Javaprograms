package collectionFramework;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack stack = new Stack();
		
		stack.add(2);
		stack.add(0, "java");
		stack.addElement('s');
		stack.insertElementAt(true, 1);
		stack.push(5.47);
		stack.add(2);
		stack.push(null);	// duplication allow, null allow, insertion order maintain, different datatype values allows.
		
		System.out.println("stack : "+stack);
		
	/*	int i = stack.capacity();		//capacity() -> find out capacity of stack.
		System.out.println(i);		*/
		
	/*	stack.clear();					//clear() -> clear() is clear the stack.
		System.out.println(stack);	*/
		
	/*	Object stack1 = stack.clone();			//clone() -> xerox copy of stack values.
		System.out.println("stack1 : "+stack1);		*/
		
	/*	boolean rs = stack.contains('m');		//contains() -> use to verify value present in stack or not.
		System.out.println(rs);		*/
		
	//	System.out.println(stack.elementAt(5));		//elementAt() -> by this method we identify, value by passing index in this method.
		
	/*	Enumeration en = stack.elements();		//elements() use in Enumeration to iterate values in stack.
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}	*/
		
	/*	boolean rs = stack.empty();			//empty() -> use to verify stack is empty or not.
		System.out.println(rs);	*/
		
	//	System.out.println(stack.firstElement());		//firstElement() -> this gives u first element as o/p in stack.
		
	//	stack.forEach(a -> System.out.println(a));		//forEach() -> use to iterate(read) values of stack.
		
	//	System.out.println(stack.get(3));				//get() -> use to get value for index which is we passing.
		
	//	System.out.println(stack.indexOf(null));		//indexOf() -> to know index of value which is we passing in bracket.
		
	//	System.out.println(stack.lastElement());		//lastElement() -> to know last element of stack.
		
	//	System.out.println(stack.lastIndexOf(2));		//lastIndexOf() -> to know the index of repeated value .means here 2 are twice in stack.but to know the index of 2nd '2'. use lastIndexOf().
		
	/*	System.out.println(stack.peek();		//peek() -> give you last element of stack but not remove it.
		System.out.println(stack);	*/
		
	/*	System.out.println(stack.pop());		//pop() -> work opposite to peek().give you last element of stack but remove it from stack.
		System.out.println(stack);		*/
		
	/*	stack.push(55);							// push() -> use to add values in stack.
		System.out.println(stack);	*/
		
	/*	stack.set(0, "selenium");
		System.out.println(stack);	*/
		
	//	System.out.println(stack.size());
		
	//	System.out.println(stack.subList(1, 5));
		
	/*	 Object[] o =stack.toArray();
		 for (int j = 0; j < o.length; j++) {
			 System.out.println(o[j]);
		}
		*/
		
	}

}
