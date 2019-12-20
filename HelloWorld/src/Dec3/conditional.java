package Dec3;

public class conditional {
	public static void main(String args[]) {
		int num = 100;
		
		if(num <= 100) {
			System.out.print("value of numis: " +num);
		}
		
		if(num > 10) {
				System.out.print("value  is ghrater than 10");
			} else { 
				System.out.println("value is less than 10");
			}
		
		if(num <= 100) {
			System.out.println("value of numis: " +num);
			
			if(num > 50) {
				System.out.println("value of numis: " +num);
			}
		}
		
			
		//if-else-if statement
		int marks = 75;
		
		char grade;
		
		if (marks >=80) {
			 grade = 'A';
		} else if (marks >= 70) {
			grade = 'B';
		} else if (marks >= 60) {
			grade = 'c';
		} else if (marks >= 50) {
			grade = 'd';
		} else {
			grade = 'F';
		}
		
		System.out.println("Grade = " +grade);
	
	
		//switch case statement
	
	int num1 = 200;
	switch (num1) {
		case 100:
			System.out.println("Value of case is " +num1);
			break;
		case 200:
			System.out.println("value of case is " +num1);
			break;
		case 300:
			System.out.println("vakue of case is " +num1);
		default:
			System.out.println("value of case is " +num1);
	}
	
	String color = "red";
	switch (color) {
		case "green":
			System.out.println("Value of case is " +color);
			break;
		case "yellow":
			System.out.println("value of case is " +color);
			break;
		case "blue":
			System.out.println("vakue of case is " +color);
		default:
			System.out.println("value of case is red");
	}
	}
	
			

}
