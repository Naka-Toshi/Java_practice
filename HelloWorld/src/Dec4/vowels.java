package Dec4;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	//ask
		boolean isVowel=false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scanner.next().charAt(0);
		scanner.close();
		 
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
		
		 }
		
		if(isVowel == true) {
			System.out.println(ch + " is a voewl");
			} else {
				if ((ch >= 'a' && ch <='z') || (ch >= 'a' && ch <= 'Z')) {
					System.out.println(ch + " is a consonant");
			} else {
				System.out.println("Input is not an alphabet");
			}
			}
			
		
	}
}
