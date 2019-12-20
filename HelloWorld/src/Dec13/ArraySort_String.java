package Dec13;


import java.util.Scanner;

public class ArraySort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int count;
			String temp;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number of strings you want to like to order");
			count = sc.nextInt();
			
			String str[] = new String[count];
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the string one by one");
			for(int i = 0; i < count; i++) {
				str[i] = sc2.nextLine();
			}
			sc.close();
			sc2.close();
			
			for (int i = 0; i < count; i++) {
				for (int j = i +1; j < count; j++) {
					if (str[i].compareTo(str[j]) > 0) {
						temp = str[i];
						str [i] = str[j];
						str[j] = temp;	
					}
				}
			}
			
			System.out.println("Strings in Sorded array");
			for (int i =0; i <= count -1; i++) {
				System.out.println(str[i] + " ");
		}
			
			
			for (int i = 0; i < count; i++) {
				for (int j = i +1; j < count; j++) {
					if (str[i].compareTo(str[j]) < 0) {
						temp = str[i];
						str [i] = str[j];
						str[j] = temp;	
					}
				}
			}
			
			System.out.println("Strings in Sorded array");
			for (int i =0; i <= count -1; i++) {
				System.out.println(str[i] + " ");
		}
			
			
			
 	}

}
