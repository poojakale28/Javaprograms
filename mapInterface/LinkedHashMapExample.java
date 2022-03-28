package mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;


public class LinkedHashMapExample {


	public static void main(String[] args) {

		LinkedHashMap map = new LinkedHashMap();  //linkedHashMap is child of HashMap so all methods and behavior is same as HashMap.
		map.put(1, "maharashtra");				// Only difference is LinkedHashMap maintain insertion order and HashMap not maintain insertion order.		
		map.put(2, "karanatka");				// Duplicate 'key' are not allowed
		map.put('k', false);
		map.put('k', "Goa");
		map.put("abcd", 999);					//Duplicate 'values' are allowed.
		map.put(true, 999);    
		map.put(null,2000);						// NULL 'keys' and 'values' are both are allowed.
		map.put(1234, null);
		System.out.println(map);				// all methods are same as HashMap . 
		
		
	/*	boolean key = map.containsKey("abcd");
		System.out.println(key); */
		
	/*	boolean value = map.containsValue(222);
		System.out.println(value);  */
		
	/*	map.clear();
		System.out.println(map);  */
		
	/*	Object map1 = map.clone();   		 //clone() is work as Xerox copy of map
		System.out.println(map1);  	*/
		
	/*	 boolean result = map.equals(map1);
		 System.out.println(result);		*/
		
	//	map.forEach((k,v) -> System.out.println(k));
	//	map.forEach((k,v) -> System.out.println(v));
		
	/*	Object key = map.get('k');  		 // get() use to get value, which key we passing,for that value we get.
		System.out.println(key);  */
		
	/*	boolean result = map.isEmpty();
		System.out.println(result);  */
		
	/*	Integer i = map.size();
		System.out.println(i);		*/
		
	/*	map.put(7,"Delhi");
		System.out.println(map);	*/
		
	/*	map.remove(7);						//remove()--> remove entry using only key.
		System.out.println(map);	*/
		
	/*	map.remove(7,"Delhi");				//remove()--> remove entry using key and value.
		System.out.println(map);	*/
		
	/*	map.replace(7, "Delhi", "Banglore");	//replace() --> use to replace old value by new value
		System.out.println(map); */
	
	/*	Collection col = map.values();		// values() --> gives you only collection of values.
		System.out.println(col);	*/
		
	/*	Iterator itr = col.iterator();		// using collection of values, we can iterate values one by one. and perform required opertions.
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}		*/
			
	/*	Set keys = map.keySet();		//keyset() --> gives you every entry for key 
		
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			Object val =  itr.next();
			 System.out.println("key "+ val+" = "+map.get(val));	
			
		}*/
		
		
	/*	Set set = map.entrySet();
	
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next());
		}	*/
			
		
	/*	Set set = map.entrySet();		// entry()--> gives you pair of key and value in output
		
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
		
			Map.Entry en = (Entry) itr.next();	// MapEntry interface used to iterate single key and value in pair. At a time,single key and single value print kr skte h
			
			System.out.println(en.getKey()+"  "+en.getValue());
			//System.out.println(en.getKey());
			//System.out.println(en.getValue());
		}
	*/
		
	}
}
