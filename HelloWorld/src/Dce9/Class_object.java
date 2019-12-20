package Dce9;

import java.util.Scanner;

public class Class_object {
		
	
	String name;
	String breed;
	String color;
	int age;
	
	
	//Default constructer
	public Class_object() {
		System.out.println("Object Oriebted Concept in Java");	
	}
	//constructer -Initialize the properties
		public Class_object(String name, String breed, String color, int age) {
	
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
		}
	
		public String getName() {
		return name;
		}
	//public void setName(String name) {
		//this.name = name;
	//}
		public String getBreed() {
		return breed;
	}




//	public void setBreed(String breed) {
//		this.breed = breed;
//	}

		public String getColor() {
		return color;
	}




//	public void setColor(String color) {
	//	this.color = color;
//	}




	public int getAge() {
		return age;
	}




//	public void setAge(int age) {
//		this.age = age;
//	}



public String toString1( ) {
	 return ("Hi my name is  " + this.getName()+ "\nMy breed, age and color are " + this.getBreed()+ "," + this.getAge() + "," + this.getColor());
}
	
	

public static void main(String[] args) {
		// TODO Auto-generated method stub

		

Class_object  obj = new Class_object("tuffy", "papillon", "white", 5);
System.out.print(obj.toString1());
		
	//	obj.setName("tuffy");
	//	obj.setBreed("papillion");
	//	obj.setAge(5);
	//	obj.setColor("white");

		//System.out.println("Name: " +obj.getName());
		//System.out.println("Breed: " +obj.getBreed());
		//System.out.println("Age: " +obj.getAge());
		//System.out.println("Color: " +obj.getColor());
	
		
		//Scanner sc = new Scanner(System.in);
		
		}

}
