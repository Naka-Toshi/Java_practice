package Dec4;

import java.util.Scanner;

public class practice1_months {
	public static void main(String args[]) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();		   
	int days[] = {28, 30, 31};
  
	switch (num) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("The are " + days[2] + "days in the month");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("There are " + days[1] + "days in the month");
		break;
	case 2:
		System.out.println("There  are " + days[0] + "days in the month");
		break;
	default :
		System.out.println("There is no such a month.");
	}
	
}
}
