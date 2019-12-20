package Dec6;

public class StrToChar {
public static void main (String args[]) {
	
	String str = "Hello";
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		System.out.println("Character at " +i + " position " + ch);
	}
}
}
