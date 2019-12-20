package Dce9;


class One {
	
	public void print( ) {
		System.out.println("I am Class One");
	}
}

class Two extends One {
	public void display() {
		System.out.println ("I am Class Two");
	}
}



public class SingleInheritance {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj = new Two();
		obj.print();
		obj.display();
		}
}
