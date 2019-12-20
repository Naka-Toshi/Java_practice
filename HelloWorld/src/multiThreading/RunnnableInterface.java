package multiThreading;

class RunnableDemo implements Runnable  {
	
	Thread myThread;
	RunnableDemo() {
		myThread = new Thread (this, "My runnable thread");
		System.out.println("My thread created " + myThread);
		myThread.start();
	}
	
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Printing the count" +i );
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("My thread interrupted");
		}
		System.out.println("my thread run is over");
	}
	}
	

	public class RunnnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableDemo obj = new RunnableDemo();
		try {
			while(obj.myThread.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
			System.out.println("Main thread run is over");
		}

	}


