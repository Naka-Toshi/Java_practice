package Dec5;

import java.util.Scanner;

public class practice2 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int reverse_num = 0;
		
		
	System.out.println("Input your number");
		num = sc.nextInt();
		
	System.out.print ("Reverse of input is ");
	 reverseNum(num);
		
		while (num !=0)  {
			reverse_num = reverse_num * 10;
			reverse_num = reverse_num + num % 10;
			num = num / 10;
		}
		
		System.out.println("Reverse of number is " + reverse_num);
		
		//Exaple 2
		
		for (; num != 0; ) {
			reverse_num = reverse_num * 10;
			reverse_num = reverse_num + num /10;
			reverse_num = reverse_num /10;
		}
		
		System.out.println ("Reserves of  input number is " +reverse_num);
		
	}
		
		public static void reverseNum(int number) {
			if (number < 10) {
				System.out.println(number);
				return;
			}
			else {
				System.out.print(number % 10);
				reverseNum(number/10);
			}
		}	
	}

