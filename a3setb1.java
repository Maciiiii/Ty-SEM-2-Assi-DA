import java.util.*;

class thread implements Runnable {
	Thread t;
	int i, no, sum;
	int a[] = new int[1000];
	thread(String s, int n) {
		Random rs = new Random();
		t = new Thread(this, s);
		no = n;
		int j = 0;
		for (i = 1; i <= 1000; i++) {
			a[j] = rs.nextInt() % 100;
			j++;
		}
		t.start();
	}
	public void run() {
		
		System.out.println("\n Elementes Are 1 to 100     \n " );
		
		for (i = 1; i <=100; i++) {
			sum = sum + a[no];
			no++;
		}
	//	System.out.println("ele\n = " + sum);
		int k=0;
			for (i = 1; i <= 100; i++)
			{
			        System.out.print(" \t" + a[k] );
			        k++;
			}
		System.out.print("\n\nSum = " + sum);
		System.out.println("\nAvg = " + sum / 100);
	   System.out.println("\n************   ******  ************   ");
	}

}
public class Slip12_2 {
	public static void main(String[] arg) throws InterruptedException {
		thread t1 = new thread("g", 100);
		t1.t.join();
		thread t2 = new thread("r", 100);
		t2.t.join();
		thread t3 = new thread("s", 100);
		t3.t.join();
		thread t4 = new thread("t", 100);
		t4.t.join();
		thread t5 = new thread("p", 100);
		t5.t.join();
		thread t6 = new thread("p", 100);
		t6.t.join();
		thread t7 = new thread("p", 100);
		t7.t.join();
		thread t8 = new thread("p", 100);
		t8.t.join();
		thread t9 = new thread("p", 100);
		t9.t.join();
		thread t10 = new thread("p", 100);
		t10.t.join();

	}
}