package multiThreading;

class MultiThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My thread is running state");
	}
	
}



public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThread obj = new MultiThread();
		obj.start();
		

	}

}
