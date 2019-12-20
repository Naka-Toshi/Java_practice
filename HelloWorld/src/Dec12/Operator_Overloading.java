package Dec12;

public class Operator_Overloading {

		public void operator(String str1, String str2) {
			String s = str1 + str2;
			System.out.println("Concatenated String - "  + s) ;
		}
		
		public void operator (int a, int b) {
			int c = a + b;
		System.out.println("sum" + c);
		}
		
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Operator_Overloading obj = new Operator_Overloading();
		obj.operator(2, 3);
		obj.operator("joe", "now");
	}
}
