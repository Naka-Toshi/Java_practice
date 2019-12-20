package Dec11;

public class methods_types {
	
	static String greeting = "Hello";
	

	public void Method1() {
		System.out.println("Method without return and parameters");
	}
	
	public int Method2() {
		System.out.print("Method with return and without parameters :");
		return 1+2;
	}
	
	public void Method3 (String name) {
		System.out.println("Method without return and with parameters :" + name);
	}
	
	public int Method4 (int x, int y) {
		System.out.print("Method with return and with parameters :");
		return x * y;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methods_types obj = new methods_types();
		
		obj.Method1();
	
		
		
		System.out.println(obj.Method2());
		
		obj.Method3("John");
		
		System.out.println(obj.Method4(4,5));
		
		System.out.println(greeting);
		
		

	}

}
