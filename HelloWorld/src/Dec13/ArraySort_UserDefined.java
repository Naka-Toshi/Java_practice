package Dec13;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	int rollNo;
	String name, address;
	
	
	//Constructer
	public Student(int rollNo, String name,String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		
	}
	
	public  String toString() {
		return this.rollNo +" " +this.name + " " + this.address; 
	}
}


	//interface
	class Sortbyroll implements Comparator<Student> 
	{
		
			public int compare(Student a, Student b)
			{
				return a.rollNo - b.rollNo;
				
			}
	}





public class ArraySort_UserDefined {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = {new Student(111, "bbbb", "london"),
						 new Student(131, "aaaa", "nyc"),
						 new Student(121, "cccc", "jaipur")
		};
		
		System.out.println("Unsorted");
		for (int i = 0; i < arr.length; i++)  {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr, new Sortbyroll());

			System.out.println("\nSorted by rollno");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

	}
}

