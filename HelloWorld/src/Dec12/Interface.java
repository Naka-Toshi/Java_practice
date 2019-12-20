package Dec12;

interface interface1 { 
	final int a = 10;
	public default void display() {
		System.out.println("hello " +a);
	}
}


public class Interface implements interface1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.display();

	}
}
