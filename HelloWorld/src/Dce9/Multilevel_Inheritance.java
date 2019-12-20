package Dce9;


class First {
	public void print ( ) {
		System.out.println("I am Class One");
	}
}

class Second extends First{
	public void display () {
		System.out.println("I am class Two");
	}
}

class Third extends Second {
	public void show (){
		System.out.println("I am class Three");
	}
}



public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Third obj = new Third();
		obj.print();
		obj.display();
		obj.show();
		
		
		
		
	}

}
