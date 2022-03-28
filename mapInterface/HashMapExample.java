package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(1, "maharashtra");
		map.put(2, "karanatka");
		map.put('k', false);
		map.put('k', 3.14);
		map.put("abcd", 999);
		map.put(true, 999);     //Repetition 'key' are not allowed, repeated 'values' are allowed, 'NULL' for keys and values both are allowed,insertion order is not maintain.
		map.put(null,2000);
		map.put(1234, null);
		System.out.println(map);
		
	/*	HashMap map1 = new HashMap();
		map1.putAll(map);
		//map1.put(null,5);    //value and key both can take as 'NULL'
		System.out.println(map1);   */
		
		/*	Object map2 = map.clone();    //clone() is work as Xerox copy of map
		System.out.println(map2);  */

		/*boolean key =  map.containsKey(2);
		System.out.println(key);  */  
		
	/*	boolean value = map.containsValue(false);
		System.out.println(value);   */
		
	//	map.forEach((k,v) -> System.out.println(k));
	//	map.forEach((k,v) -> System.out.println(v));
		
	
	/*	Object key = map.get('k');   // get() use to get value, which key we passing,for that value we get. get() method not applicable for value,we can't pass value in get().
		System.out.println(key);  */
		
	/*	Set entry = map.entrySet();		// entrySet() used to iterate keys and values at a same time. for this we use Map.ENTRY interface.
		
		Iterator itr = entry.iterator();
		while (itr.hasNext()) {
			
			Map.Entry en = (Entry) itr.next();
			
			 System.out.println(en.getKey()+" = "+en.getValue());
			
		}  */
		
	/*	boolean result = map.isEmpty();
		System.out.println(result);    */
		
		
	/* boolean result=map.equals(map1);
		System.out.println(result);  */
		
		
	/*	Set set = map.keySet();				// keySet() gives you all keys
		System.out.println(set);   */
		
	/*	map1.clear();
		System.out.println(map1);    */
		
	/*	map.remove('k');
		System.out.println(map);   */
		
	/*	map.replace('k', false,"jui");   //using replace(),we can change old value to new value.
		System.out.println(map);    */
		
	/*	Integer i = map.size();			// size() gives you total count of values present in map.
		System.out.println(i);    */
		
	/*	Set keys = map.keySet();		//keySet() used for iterating only keys one by one.
		 Iterator itr = keys.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
			
		}	*/
		
	/*	Collection col = map.values();		// values() --> gives you only collection of values. you can read values one by one.
		System.out.println(col);   */
		
	/*	 Collection values = map.values();	//values() used for iterating values one by one.
		 Iterator itr = values.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		
		}	*/
	}
	
}
