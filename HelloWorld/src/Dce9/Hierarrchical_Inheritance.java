package Dce9;

class Father  {
	public void print ( ) {
		System.out.println("I am Class One");
	}
}

class Child1 extends Father{
	public void display () {
		System.out.println("I am class Two");
	}
}

class Child2 extends Child1 {
	public void show (){
		System.out.println("I am class Three");
	}
}

public class Hierarrchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c2 = new Child2();
		c2.show();
		Child1 c1 = new Child1();
		c1.display();
		c1.print();
		
	}

}
