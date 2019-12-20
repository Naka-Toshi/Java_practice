package Dec8;

import java.util.Scanner;

public class Multiarray {
	

	
	
	
public static int[][] readMatrixByUser() {
		
		int m,n,i,j;
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of rows of the matrix");
			m = sc.nextInt();
			
			System.out.println("Enter the number of columns of the matrix");
			n = sc.nextInt();
			
			//Declear the matrix
			int array[][] =new int[m][n];
			
			//Read the value of matrix
			try {
			System.out.println("Enter the elements of the matrix");
				for (i= 0; i < m; i++) {
					for (j =0; j < n; j++) {
						array[i][j]= sc.nextInt();
					}
				} 
			}		
			catch(Exception e) {
						System.out.println(e);
			}
				finally {
						sc.close();
				}
		
			return array;
		
}
		
	
public static void displayMatrix(int[][]array) {
			
		
		//Display the elements of the matrix
				System.out.println("Elements of the matrix");
				for (int i=0; i < array.length; i++) {
					for (int j= 0; j < array[i].length; j++) {
						System.out.print(array[i][j]+ " ");
						}
					System.out.println();
				}		
			
		}
	
	
public static void main(String args[]) {
		
		int arr[][] = readMatrixByUser();
		
		displayMatrix(arr);
		
		
		
		
		
		
		
		
		
		
	}
}
