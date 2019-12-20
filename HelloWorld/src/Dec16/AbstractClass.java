package Dec16;

abstract class Shape {
		String color;
		
		abstract double area();
			public abstract String toString ();
			
		public Shape (String color) {
			System.out.println("Shape Constructer Called");
			this.color = color;
		}
	
		public String getColor () {
			return color;
		}
}
		
class Circle extends Shape {
	double radius;
			
	public Circle (String color , double radius) {
		super (color);
		System.out.println("Circle constructer called");
		this.radius = radius;
	}

	@Override
	double area() {
	// TODO Auto-generated method stub
	return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return "Circle color is :" + super.color + "and area is :" +area();
	}		
}


class Ractangel extends Shape {
	double length;
	double width;
			
			

	public Ractangel(String color, double length, double width) {
		super(color);
		// TODO Auto-generated constructor stub
		System.out.println("Rectangel constructer called");
		this.length = length;
		this.width = width;
				
			}

		@Override
		double area() {
		// TODO Auto-generated method stub
		return length * width;
		}

		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "Rectangel color is "+ super.color +"and area is"+ area();
		}
			
}




public class AbstractClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj1 = new Circle("Red", 2.2);
		Shape obj2 = new Ractangel("yellow", 2,4);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
