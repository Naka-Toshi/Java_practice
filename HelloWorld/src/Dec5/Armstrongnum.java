package Dec5;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
			int num, digit1, digit2, digit3;
			
			System.out.println("Enter the positive integer");
			
			num = scanner.nextInt();
			
			for (int i = 1; i <= num; i++) {
				int temp = i;
				digit1 = temp % 10;
				
				temp = temp /10;
				digit2 = temp % 10;
				
				temp = temp /10;
				digit3 = temp % 10;
				
				if((digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3) ==i) {
					System.out.println("Armstrong number from 1 to  " +num +" is " +i);
				}
				
			}
			
			
	}

}
