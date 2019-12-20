package Dec17;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue obj = new LinkedList<String>();
		
		obj.add("Jack");
		obj.add("Joe");
		obj.add("Michael");
		obj.add("Raggle");
		obj.add("Megan");
		
		System.out.println("Elements in Queue :" +obj);
		
		System.out.println("Removed Elements :" +obj.remove());
		
		System.out.println("Head:" +obj.element());
		
		System.out.println("Poll(): " +obj.poll());
		
		System.out.println("peek():" + obj.peek());
		
		System.out.println("Elements in Queue:" +obj);
		
		
		Queue<String> obj1 = new PriorityQueue<String>(15,new MyComputer());
		
		obj1.add("Jack Raggle");
		obj1.add("Joe Meg");
		obj1.add("Michael don steve");
		
		
		while (obj1.size() != 0) {
			System.out.println("Poll():" + obj1.poll());
		}
	}
}
		
	
		class MyComputer implements Comparator<String> {
			
			public int compare(String x, String y) {
				return x.length() -y.length();
			}
}
