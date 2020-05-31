package Robot;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		int count = 5;
		
		Runnable leftStep = () -> {
			synchronized(lock) {
				for (int i = 0; i < count; i++) {
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println("LEFT");
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Interrupted");
					}
				}
			}
		};
		
		Runnable rightStep = () -> {
			synchronized(lock) {	
				for (int i = 0; i < count; i++) {
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println("RIGHT");
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Interrupted");
					}
				}
				
			}
		};
		
		Thread leftThread = new Thread(leftStep);
		Thread rightThread = new Thread(rightStep);
		
		leftThread.start();
		rightThread.start();
		leftThread.join();
		rightThread.join();
	}

}
