package Dec4;

import java.util.Scanner;

public class practice2_calculater {
 public static void main(String args[]) {
	 
	Scanner sc = new Scanner (System.in);
	System.out.println("Put number");
	int num1 = sc. nextInt();
	System.out.println("Put  number");
	int num2 = sc. nextInt();
	System.out.println("How to calculate?");
	char calculate = sc.next().charAt(0);

	
	
switch (calculate) {
	case '+':
		System.out.println("sum is " + (num1 + num2));
		break;
	case '-':
		System.out.println("difference is " + (num1 - num2 ));
		break;
	case '*':
		System.out.println("producct is " + (num1 * num2));
	case '/':
		System.out.println("quotient is " + (num1 / num2));
	break;
	default:
		System.out.println("can't calculate");
	}
 }
}
