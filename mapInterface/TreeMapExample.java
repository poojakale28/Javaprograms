package mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

public static void main(String[] args) {
		
		SortedMap map = new TreeMap(); 	//TreeMap only take homogenous(same) datatype values in 'key', data arrange in ascending order,in string arrange alphabetically.
		// Treemap map = new Treemap();	// TreeMap works same as TreeSet, as data arrange in ascending order and only same datatype values can pass in key.
		
		map.put(1, 'p');			// Treemap is child of Sortedmap
		map.put(3, true);
		map.put(5, 3.56);
		map.put(4, "Ranchi");
		map.put(2, 5896);
		map.put(6, null);	//null is only allows in values...almost methods same as HashMap and LinkedHashMap
		map.put(7,true);
		System.out.println(map);
		
	/*	boolean key=map.containsKey(2);
		System.out.println(key);		*/
	
		
	/*	boolean value = map.containsValue("Ranchi");
		System.out.println(value);		*/
		
	/*	Object key = map.firstKey();
		System.out.println(key);		*/
		
	/*	Object key = map.lastKey();
		System.out.println(key);		*/
		
	/*	Object key = map.get(4);
		System.out.println(key);		*/
		
	//	map.forEach((k,v) -> System.out.println(k));
	//	map.forEach((k,v) -> System.out.println(v));
		
	/*	boolean res =map.isEmpty();
		System.out.println(res);		*/
		
	/*	map.remove(1);
		System.out.println(map);		*/
		
	/*	Integer i = map.size();
		System.out.println(i);		*/
		
	/*	 Set keys = map.keySet();		//keySet() used for iterating only keys one by one.
		 Iterator itr = keys.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
			
		}	*/
	
	/*	 Collection values = map.values();	//values() used for iterating values one by one.
		 Iterator itr = values.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		
		}	*/
		
		
	/*	 Set entry = map.entrySet();		// entrySet() used to iterate keys and values at a same time. for this we use Map.ENTRY interface.
		 
		 Iterator itr =entry.iterator();
		 while (itr.hasNext()) {
			Map.Entry en = (Entry) itr.next();
			System.out.println(en.getKey()+" "+en.getValue());
			
		} */
		
	}
}
