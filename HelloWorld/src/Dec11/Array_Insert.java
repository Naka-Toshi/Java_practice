package Dec11;

import java.util.Scanner;

public class Array_Insert {	
	
	
	
	
	public static void main(String args[]) {
		
		int length, position, element;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		length = sc.nextInt();
		
		int arr[] = new int [length+1];
		
		System.out.println("Enter " + length + "elements");
		for (int i = 0; i < length; i++) {
			arr[i] =sc.nextInt();
		}
		
		System.out.println("Enter the position where you want to insert");
		position = sc.nextInt();
			
		
		System.out.println("Enter the element which you want to insert");
		element = sc.nextInt();
		
		
		
		for (int i = length-1; i >= (position -1) ; i--) {
			arr[i+1] = arr[i];
		}
		
		//arr[length] = element;
		
		arr[position -1] = element;
		
		
		
		System.out.println("After Delection");
		for (int i = 0; i < length; i++) {
			System.out.println("arr["+i+"] =" + arr[i]);
		}
		
		System.out.println("arr[" + length + "[ =" +arr[length]);
		sc.close();
		
		
		
		
		
		
		
	}
}
