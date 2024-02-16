import java.io.*;
import java.lang.String.*;

class thred extends Thread {
	String msg = null;
	int  n;
	thred(String msg, int n) {
		this.msg = msg;
		this.n = n;
	}
	public void run() {
		
			for (int i = 1; i <= n; i++) {
				System.out.println(msg + " " + i + " times");
				System.out.println("\n ");
			}
		//	System.out.println("\n ");
	
	}

	public static void main(String a[]) {
		int n = 10;
		thred t1 = new thred("Covid19", n);
		t1.start();
		thred t2 = new thred("Lockdown2020", n + 10);
		t2.start();
		thred t3 = new thred("Vaccine 2021", n + 20);
		t3.start();
	}
}