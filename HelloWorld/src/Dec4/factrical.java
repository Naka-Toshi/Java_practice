package Dec4;

public class factrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5;
		long fact = 1;
		
		/*for (int i = 1; i <=number; i++) {
			fact  = fact * i;
		}*/
		
		int i = 1;
		while (i <= number) {
			//fact = fact * i;
			fact *= i;
			i++;
		}
		
		
		System.out.println("Factrical of " + number + " is : " +fact);
		
	
		

	}

}
