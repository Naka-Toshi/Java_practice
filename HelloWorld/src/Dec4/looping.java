package Dec4;

import java.util.Scanner;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //for-loop
		for (int i = 10; i >= 1; i--) {
			System.out.println("The value of i is " + i);
		}

		 //for-loop ex-2
		String arra[] = {"hi", "hello", "bye"};
		for(String str: arra) {
			System.out.println(str);
		}
		
		int num[] = {2,11,15,9};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	
		//enhance for loop
		for (int i:num) {
			System.out.println(i);
		}
		
		
		
		String colors[] = {"red", "green", "yellow", "blue", "white"};
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		//enhanced for loop
		for (String str:colors) {
			System.out.println(str);
		}
		
		//Nasted for loop
		int num_arr[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < num_arr.length; i++) {
			for (int j = 0; j < i;  j++) {
			 System.out.print(j);
			}
			System.out.println();
		}
		
		//while loop
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		
		//Iterating an array using while loop
				int arr[] = {2,14,11,25,6};
				int k =0;
				while(k<arr.length) {
					System.out.println(arr[k]);
					k++;
				}
		
			//do-while loop
				int s = 5;
				do {
					System.out.println("The value of s: " + s);
					s--;
				} while(s>0);
				
			//Iterating an array using do-while loop
				int arr1[] = {5, 6, 8, 2,};
				int index = 0;
				do {
					System.out.println(arr1[index]);
					index++;
				} while(index<4);
				
				
				
			//do-while demo
				Scanner scanner = new Scanner(System.in);
				
				int num1, num2;
				char choice;
				
				do {
					System.out.println("Enter the first number");
					num1 = scanner.nextInt();
					
					System.out.println("Enter the second number");
					num2 = scanner.nextInt();
					
					int sum = num1 + num2;
					System.out.println("Sum of the numbers" + sum);
					
					System.out.println("Do you want to continue? y/n");
					choice = scanner.next().charAt(0);
					
					if (choice != 'y' && choice != 'Y') {
						System.out.println("Thank you");
					} 
					System.out.println();
					
					
					
				} while (choice == 'y' || choice == 'Y');
				
				
		
		


}
}

