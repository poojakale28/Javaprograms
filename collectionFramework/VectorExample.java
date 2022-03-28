package collectionFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// Iterator(),ListIterator(),Enumeration() all this use in vector. Iterator() use in overall collection. ListIterator() only use in child classes of list.
				//Enumeration() used in only vector and stack .
				
				
				Vector vector =  new Vector();	// vector is child of list. child of vector is stack.
				// List vector = new Vector();		//u can make object like this also
				
				vector.addElement(true);
				vector.addElement(3.16);
				vector.addElement('j');
				vector.addElement(22);
				vector.addElement("selenium");
				vector.addElement('j');
				vector.addElement(789);
				System.out.println(vector);	// allows null,allows duplicates,allows different datatype values ,insertion order maintain
				
			/*	System.out.println(vector.capacity());			//capacity() use to find out original capacity of vector to add values.
				vector.trimToSize();					        // trimToSize() release the remaining memory location.
				System.out.println(vector.capacity());  */   	// after trimToSize() it release the remaining memory location, and gives total counting of values.
				
			//	System.out.println(vector.elementAt(5));		//elementAt() use to find out index value of element.
				
			//	System.out.println(vector.firstElement());		//firstElement() --> gives first element of vector as o/p.
				
			//	System.out.println(vector.get(4));				//get() work like elementAt() it is use to find out index value of element.
				
			/*	Object o =vector.indexOf(22);					//indexOf() use to find out the index position of value.
				System.out.println(o);		*/
				
			/*	Enumeration en = vector.elements();				//Enumeration only work in vector and stack. with the help of Enumeration, only read operation can perform. we can only read values in vector one by one.
				while (en.hasMoreElements()) {
					System.out.println(en.nextElement());		// if want to perform any operation on values use Iterator.
				}		*/
				
			//	System.out.println(vector.firstElement());		//firstElement() gives first element of vector.
				
			//	vector.forEach(a -> System.out.println(a));		//forEach() -> we can read values one by one.
				
			/*	vector.insertElementAt("java", 3);				//insertElementAt() -> use to insert element in vector with help of index.
				System.out.println(vector);		*/
				
			/*	Iterator itr = vector.iterator();				// iterator() -> to perform any operation on vector values.
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}			*/
				
			//	System.out.println(vector.lastElement());		//LastElement() gives last element of vector.
				
			//	System.out.println(vector.lastIndexOf('j'));	//lastIndexOf() -> use to find out duplicate values 2nd place count.,means here 'j' is for two times so if u want find out place(position) of second 'j' then use lastIndexOf().
				
			/*	Iterator itr = vector.listIterator();			//listIterator() -> use to perform any operation on vector values.
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}		*/
				
			/*	vector.remove(2);				// remove() -> u can remove values with help of index and also with help of inserting value.
				System.out.println(vector);		*/
				
			/*	vector.setElementAt(false, 1);		//setElementAt() -> can  use to replace value from vector.
				System.out.println(vector);		*/
				
			//	System.out.println(vector.size());		//size() -> to know total counting of values.
				
			//	System.out.println(vector.subList(0, 4));		//subList() -> u can create another vector with desired starting to ending index.
				
			/*	Object[] o = vector.toArray();				//toArray() -> u can convert vector into array and perform operation using for loop.
				for (int i = 0; i <o.length ; i++) {
					System.out.println(vector.get(i));
					//System.out.println(o[i]);
				}	*/			
				
			}
}
