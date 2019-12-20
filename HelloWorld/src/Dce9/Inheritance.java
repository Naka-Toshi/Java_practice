package Dce9;


class Bicycle {
	
		public int gear;
		public int Speed;
		
		public Bicycle(int gear, int Speed) {
			this.gear = gear;
			this.Speed = Speed;
		}
		
		//methods /functions
		public void applyBreak(int decrement) {
			Speed -= decrement;
		}
		
		public void speedup(int increment) {
			Speed += increment;
		}
		
		public String toString() {
			return ("No of gears are " + gear + "\n" + "speed of bicycle is" + Speed);
		}
}
	
class MountainBike extends Bicycle {
		//property of mountainBike(child class)
		public int seatHeight;
		
		public MountainBike (int gear, int speed, int seatHeight) {
			super(gear, speed);
			this.seatHeight = seatHeight;
		}
		
		public void seatHight(int newValue) {
			seatHeight = newValue;
		}
		
		public String toString() {
			return(super.toString() + "\nSeat Height is "+ seatHeight);
		}
		
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	MountainBike mb = new MountainBike(3,100,25);
	System.out.println(mb.toString());		
		}
}
