package Dec4;

public class fibonacci {
	public static void main(String[] args) {
	
	int count = 7, num1 = 0, num2 = 1;
	System.out.println("Fibonacci Series of " + count + "numbers");
	
	/*for (int i=1; i<=count; i++) {
		System.out.println(num1 + "　");
		
		int sumofprev = num1 + num2;
		num1 = num2;
		num2 = sumofprev;
		}*/
	
	int i =1;
	while (i <= count) {
		
		System.out.println(num1 +" ");
	 
		int sumofprev = num1 + num2;
		num1 = num2;
		num2 = sumofprev;
			
			i++;
	}
		
	}
}
