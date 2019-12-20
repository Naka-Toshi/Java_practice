package Dec16;

import java.util.Scanner;

public class ExceptionalHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third line");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int length;
			
			System.out.println("Enter the length of the array");
			length = sc.nextInt();
			
			int arr[] = new int [length+1];
			
			System.out.println("Enter " + length + "elements");
			for (int i = 0; i < length; i++) {
				arr[i] =sc.nextInt();
			}

			int[] array = new int[] {1,2,3};
				print(array);
		} catch(Exception e) { 
			System.out.println("The array doesn't have four items!" + e);
		} finally {
			sc.close();
			System.out.println("This always prints");
		}
		
		System.out.println("Fourth Line");
		System.out.println("Fifth Line");
	}
	
		
		
	private static void print(int[] array) {
		System.out.println(array[3]);
		System.out.println("Fouth element successfully displayed");
	}
}
