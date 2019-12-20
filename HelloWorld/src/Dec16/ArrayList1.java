package Dec16;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main (String[] args) {
		
		//Collection
		//List inter face
		
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ajeest");
		obj.add("Harry");
		obj.add("Cahitanya");
		obj.add("Steve");
		obj.add("Anuj");
		
		
		System.out.print("Original ArrayList: ") ;
		for (String str: obj) {
			System.out.print(str+ " ");
		}
		
		System.out.println("\n");
		
		obj.add(0, "Rahul");
		obj.add(1, "Justin");
		
		System.out.println();
		System.out.print("Update ArrayList: ");
		for (String str : obj) {
			System.out.print(str+" ");
		}
		System.out.println("\n");
		
		obj.remove("cahitanya");
		obj.remove("Harry");
		
		System.out.println();
		System.out.print("Removed ArrayList: ");
		for (String str : obj) {
			System.out.print(str+" ");
		}
		System.out.println("\n");
		
		obj.remove(1);
		System.out.println();
		System.out.print("Final ArrayList: ");
		for (String str : obj) {
			System.out.print(str+" ");
		}
		
	
	}

}
