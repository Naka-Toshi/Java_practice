package Dec17;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> obj = new TreeMap<Integer, String>();
		
		
		
		obj.put(1, "Data1");
		obj.put(23, "Data2");
		obj.put(70, "Data3");
		obj.put(4, "Data4");
		obj.put(2, "Data5");
		
		Set set =  obj.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry  = (Map.Entry)iterator.next();
			System.out.print("key is: " + mentry.getKey() + "& Value is :");
			System.out.println(mentry.getValue());
		}
		
		System.out.println("Size of TreeMap :" + obj.size());
	}

}
