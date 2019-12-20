package Dec16;

import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count, i = 0, j = 0, temp;
		int number[] = new int[100];
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("How many elements you want to enter") ;
			count = scanner.nextInt();
			
		for (i = 0; i < count; i++) {
			System.out.println("Enter Array Element" +(i+1) + ":");
			number[i] = scanner.nextInt();
		}
		
		
		//j = i-1;
		//i = 0;
		scanner.close();
		
		/*
		 while (i < j) {
		 	temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}*/
		
		System.out.print("Normal array:");
		for (i = 0; i < count; i++) {
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		for (i = 0; i < count; i++) {
			for (j = i + 1; j < count; j++) {
				temp = number[i];
				number[i] = number[j];
				number[j] = temp;
			}
		}
	
		
		
		System.out.print("Reserved array:");
		for (i = 0; i < count; i++) {
			System.out.print(number[i] + " ");
		}

	}

}
