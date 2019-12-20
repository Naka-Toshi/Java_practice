package Dec12;

public class Array_Addition_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][] ={
				{1,3},
				{3,4}
		};
		
		int b[][] = {
				{1,3},
				{3,4}
		};
		
		
		int c[][] = new int [2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <2; j++) {
				c[i][j] = a[i][j] +  b[i][j];
				System.out.print(c[i][j] +" ");			
					}
		System.out.println();
 	}
		
		
		System.out.println("Multiplication of 2 matrices");
		
		//Multiply and print the 2 matrics
		for (int i =0; i < 2; i++) {
			for (int j=0; j<2; j++) {
				c[i][j] = 0;
				for (int k =0; k < 2; k++) {
					c[i][j] = a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
