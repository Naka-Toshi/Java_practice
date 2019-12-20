package multiThreading;

class MyClass implements Runnable {
	
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Started: " + t.getName());
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended:" + t.getName());
	}
	
}


public class JoinMethoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th1 = new Thread(new MyClass(),"th1");
		Thread th2 = new Thread(new MyClass(),"th2");
		Thread th3 = new Thread(new MyClass(),"th3");
		
		th1.start();
		
		try {
			th1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		th2.start();
		
		try {
			th2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		th3.start();
		
		try {
			th3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		System.out.println("All three threads have finished execusion");
		
		
	}

}
