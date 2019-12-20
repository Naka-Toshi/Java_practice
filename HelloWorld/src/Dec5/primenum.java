package Dec5;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		 System.out.println("Enter the positive integer");
		 num = scanner.nextInt();
		 
		 boolean flag = true;
		  for (int i = 2;  i< num; i++) {
			  if (num % i ==0) {
				  flag = false;
				  break;
				  
			  }
		  }
		 
		  if (flag && num > 1) {
			  System.out.println("Number is prime");
		  } else {
			  System.out.println("Number is not prime");
			  
		  }

	}

}
