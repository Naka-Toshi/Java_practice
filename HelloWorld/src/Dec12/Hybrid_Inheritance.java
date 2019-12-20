package Dec12;

interface Vehicle {
	void changegear (int a);
	void Speedup (int a);
	void applyBreak (int a);
	}



class BiCycle implements Vehicle {
	int speed;
	int gear;
	@Override
	public void changegear(int newgear) {
		// TODO Auto-generated method stub
		gear = newgear;
	}
	@Override
	public void Speedup(int increment) {
		// TODO Auto-generated method stub
		speed = speed  + increment;
	}
	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
	}
	public void  printState () {
		System.out.println("Speed : " + speed + " Gear : " + gear);
	}
}



class Bike implements Vehicle {
	
	int speed,gear;
	@Override
	public void changegear(int newGear) {
		// TODO Auto-generated method stub
		gear = newGear;
	}

	@Override
	public void Speedup(int increment) {
		// TODO Auto-generated method stub
		speed = speed + increment;
	}

	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
	}
	
	public void printState() {
		System.out.println("Speed : " +speed+ " Gear : " +gear);
	}
	
}


public class Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj = new Bike();
		obj.changegear(1);
		obj.Speedup(4);
		obj.applyBreak(3);
		System.out.println("Bike Presents State");
		obj.printState();
		
		
		BiCycle obj1 = new BiCycle();
		obj1.changegear(2);
		obj1.Speedup(3);
		obj1.applyBreak(1);
		
		
		
		System.out.println("Bicycle Presents State");
		obj1.printState();
	}

}


