package Dec5;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array declaration
		
		int array[] = new int[6];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;	
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[1]);
		}
		
		
		//Array Initialization
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i +1;	
		}
		
		//Array declaration and Initialization
		int array1[] = {1, 2, 3, 4, 5, 6};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
		
	//enhance for loop
		for (int num: array1) {
			System.out.println(num);
		}
		
	// Array Index out of Bounds Exception
		int arr[] = {50, 60, 70, 80};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
		
		
	//passing arrays to functions
		
		int a[] = {33, 3, 4, 5};
		min(a);
		
	
	
	
	//Returning array from function
	
	int arr1[] = get();
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}

	//Multi-dimenstional array
			int[][]arrayRefVar;
			int[][]arrayRefVar1;
			int arrayRefVar2 [][];
			int[]arrayRefVar3;
			
			//declation 
			int adArray[][] = new int[10][20];
			int[][] intArray = new int [10][20]; //2D array
			int[][][] intArray1 = new int [10][20][10]; //3D array
			
			//Initialize 2D array
			int[][] arrayd1 = {
					{1,2,3},
					{4,5,6,9},
					{7},
			};
			
			//print the 2D array
			System.out.println("length of row1 " +arrayd1[0].length);
			System.out.println("length of row1 " +arrayd1[1].length);
			System.out.println("length of row1 " +arrayd1[2].length);
			
			// print the 2D array using for loop
			for (int i=0; i<arrayd1.length; ++i) {
				for  (int j=0; j<arrayd1[i].length; ++j) {
					System.out.print(arrayd1[i][j] +" ");
				}
			}
			
			System.out.println();
			
			//print the 2D array using for loop
			for (int[] innerArray: arrayd1) {
				for (int date: innerArray) {
					System.out.print(date+ " ");
				}
			}
			
			System.out.println();
			//3D array
			int[][][] test = {
			{
					{1,2,3},
					{2,3,4}
			},
			{
					{-4,-5,6,9},
					{1},
					{2,3}
			}
	};
			//print 3D array using loop
			for (int[][] array2D : test) {
				for (int[] innerArray : array2D) {
					for(int date: innerArray) {
						System.out.print(date + " ");
					}
				}
			}
			
			System.out.println();
			
			//Print the 2D array in matrix style using Arrays.toString()
			for (int[] row: arrayd1) {
				System.out.println(Arrays.toString(row));
				
			}
			for (int[][] row: test) {
				System.out.println(Arrays.deepToString(row));
				
			}
			
			
					
			}
	
				
	static int [] get() {
		return new int[] {10, 20, 30, 40};
}
		
		
	public static void min(int arr[]) {	
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[1];
			}
		}
		System.out.println(min);
		
	}
}