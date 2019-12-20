package Dec17;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj = new HashSet<String>();
		
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Grapes");
		
		//adding duplicate elements
		obj.add("Mango");
		obj.add("Grapes");
		
		obj.add(null);
		obj.add(null);
		
		System.out.println(obj);
		
				
	}

}
