package Dec18;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> obj = new ArrayDeque<String>();
		obj.add("Glenn");
		obj.add("Negan");
		obj.addLast("Maggle");
		obj.addFirst("Rick");
		obj.add("Daryl");
		
		System.out.println("Elements in Deque" + obj);
		
		System.out.println("Remove element:" + obj.removeLast());
		
		System.out.println("Head" + obj.element());
		
		System.out.println("poll(): " +obj.pollLast()) ;
		
		System.out.println("peek():" +obj.peek());
		
		System.out.println("Elements inDeque:" + obj);
		
		
	}

}
