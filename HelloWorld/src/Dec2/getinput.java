package Dec2;

import java.util.Scanner;

public class getinput {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		   
		System.out.println("Enter a number");
		   int num = sc.nextInt();
		   System.out.println("the number is " +num);	
		   
		System.out.println("Enter some text");
		   String text = sc.next();
		   System.out.println("the text is " +text);
		   
		System.out.println("Enter some dicimal");
		   Float fnum = sc.nextFloat();
		   System.out.println("the decimal number is " +fnum);
		  
		System.out.println("Enter some dicimal");
		   double dnum = sc.nextDouble();
		   System.out.println("the decimal number is " +dnum);
		   
		System.out.println("Enter some sentences");
		   String sentence = sc.next();
		   System.out.println("the sentence is " +sentence);
		   
		System.out.println("Enter yes or no");
		   boolean bnum = sc.nextBoolean();
		   System.out.println("the boolean value is " +bnum);
		   
		   
	}
}
