package multiThreading;

class MultiThreadDemo extends Thread {

	MultiThreadDemo () {
		super ("My extending Thread");
		System.out.println("My thread Created" + this);
		start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Printing the count" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("My thread Interrupted");
		}
		System.out.println("My thread run is over");
	}
}	


public class ThreadClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadDemo obj = new MultiThreadDemo();
		try {
			while(obj.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		}catch (Exception e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread's run is over");
		}
	}
