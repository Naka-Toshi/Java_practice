package Dec13;

import java.util.Scanner;

public class Array_Serch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count , num, item, array[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		num = sc.nextInt();
		
		array = new int[num];
		
		System.out.println("Enter " +num+ "integers");
		;
		for (count = 0; count < num; count++) {
			array [count] = sc.nextInt();
		}
		
		System.out.println("Enter the search value");
		item = sc.nextInt();
		
		
		//Linear Serch
		/*for (count = 0; count < num; count++) {
			if (array[count] == item) {
				System.out.println(item + " is present location " + (count+1));
				break;
			}
		}
		
		if(count == num) {
			System.out.println(item + " doesn't exist in array");
		}*/
		
		
		//Binary Search is faster than Linear
		int first = 0;
		int last = num -1;
		int middle = (first + last)/2;
		
		while (first <= last) {
			if (array[middle] < item) {
				first  = middle + 1;
			} else if (array[middle] == item){
				System.out.println(item + "found at location " + (middle +1) + ".");
				break;
			} else {
				last = middle - 1;
			}
		
		middle = (first + last) /2;
	  }
		
		if(first > last) {
			System.out.println(item + "is not found\n");
		}
		
		
		
	}

}
