package Dec12;
	
	class Employee {
		
	public static int base =10000;
	int salary() {
		return base;
	}
		
	}
	class Manager extends Employee {
		int salary() {
			return base + 200000;
		}
	}
	
	class Clerk extends Employee {
		int salary() {
			return base + 10000;
		}
	}
	
	
	public class Method_Overriding {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee obj1 = new Manager();
			
			System.out.println("Manager Salary " +obj1.salary());
			
			Employee obj2 = new Clerk();
			System.out.println("Clerk Salary:" +obj2.salary());
		}
	}

