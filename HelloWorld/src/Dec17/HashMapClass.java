package Dec17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		
		obj.put(12, "chaitra");
		obj.put(2, "Rahul");
		obj.put(7, "Singh");
		obj.put(43, "Ajeet");
		obj.put(3, "Anju");
		
		//Display element using Iterator
		Set set =  obj.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry  = (Map.Entry)iterator.next();
			System.out.print("key is: " + mentry.getKey() + "& Value is :");
			System.out.println(mentry.getValue());
		}
		
		//Get values based on key
		String var = obj.get(2);
		System.out.println("Value at index is " +var);
		
		//Remove element based on key
		obj.remove(3);
		System.out.println("Map key and values after removal:");
		
		//Display element using Iterator
		Set set2 = obj.entrySet();
		Iterator iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator1.next();
			System.out.print("Key is :" +mentry.getKey() + "&value is :");
			System.out.println(mentry.getValue());
		}
			
			//check if key exists in hashmap
			boolean flag = obj.containsKey(7);
			System.out.println("Key 7 exists ibn HashMap?" +flag);
			
			//check if value exists in hashmap
			boolean flag1 = obj.containsValue("Sighn");
			System.out.println("String Singh exists in HashMap? " +flag);
			
		}
		
		
	}