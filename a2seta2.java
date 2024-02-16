import java.io.*;
import java.lang.String.*;



class thd_slp extends Thread {
	public void run() {
		for (int i = 100; i >= 1; i--) {
			// the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println("Thread_"+ i);
		}
	}
	public static void main(String args[]) {
		thd_slp t1 = new thd_slp();
	//	TestSleepMethod1 t2 = new TestSleepMethod1();

		t1.start();
		
	//	t2.start();
	}
}