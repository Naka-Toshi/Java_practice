package Dec5;

import java.util.Scanner;

public class practice1 {
	public static void main(String args[]) {
		
	Scanner sc= new Scanner(System.in);
		char choice;
		int num;
		int temp1 = 0;
		int temp2 = 0;
				 
		do {
			System.out.println("Enter the number");
			num = sc.nextInt(); 
			
			for (int i =0; i  < num; i++) {
				i++;
				if (num >= i) {
					temp1 = num;
				} else {
					temp2 =i;
				}
			temp2 = i;
			}
			
			
			System.out.println("Do you want to continue y/n ?");
			choice = sc.next().charAt(0);
			
		} while (choice == 'y' || choice =='Y');
		System.out.println("Thank you!");
		
		System.out.println("The largest number is " + temp1);
		System.out.println("The smallest number is " + temp2);

		
		
	}
}
