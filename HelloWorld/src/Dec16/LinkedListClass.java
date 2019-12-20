package Dec16;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> obj = new LinkedList<String>();
		obj.add("item1");
		obj.add("item2");
		obj.add("item3");
		obj.add("item4");
		obj.add("item5");
		
		
		System.out.println("Linked List Content: " +obj);
		
		obj.addFirst("First Item");
		obj.addLast("Last item");
		
		System.out.println("Linked List Added: " +obj);
		obj.set(0, "Update Item");
		
		System.out.println("Linked List Updated" + obj);
		obj.removeFirst();
		obj.removeLast();
		
		System.out.println("Linked List Removed" + obj);
		obj.add(0, "New Item");
		obj.remove(2);
		
		System.out.println("Linked List Final" +obj);
		
		
		
		
		
	}
	

}
