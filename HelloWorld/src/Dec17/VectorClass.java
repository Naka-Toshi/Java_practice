package Dec17;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String>  obj = new Vector<String>(2);
		
		obj.addElement("Apple");
		obj.addElement("Orange");
		obj.addElement("Mango");
		obj.addElement("Grapes");
		obj.addElement("Kiwi");
		
		System.out.println("Size is :" + obj.size());
		System.out.println("Default capacity increment is :" +obj.capacity());
		
		obj.addElement("Fruit1");
		obj.addElement("Fruit2");
		obj.addElement("Grapes");
		
		System.out.println("Size after addtion is :" + obj.size());
		System.out.println("capacity after increment is :" +obj.capacity());
		
		Enumeration en = obj.elements();
		System.out.println("Elements are :");
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		
		System.out.println();
		//serch element in vecter using index
		int first_index = obj.indexOf("Grapes");
		System.out.println("First Occurance of Grapes at index: " + first_index);
		
		int last_index = obj.lastIndexOf("Grapes");
		System.out.println("Last Occurance of Grapes at index: " + last_index);
		
		int after_index = obj.indexOf("Grapes" ,4);
		System.out.println("Occurance of after index 4: " +after_index);
		
		int before_index = obj.lastIndexOf("Grapes" ,5);
		System.out.println("Occurance of Grapes before index 5: " +before_index);
	}
}
