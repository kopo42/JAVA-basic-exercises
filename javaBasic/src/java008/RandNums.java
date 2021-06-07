package java008;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RandNums extends Thread {
	static Scanner scan = new Scanner(System.in);
	//static int n = scan.nextInt();
	public static void main(String[] args) {
		Thread thread1 = new MultiThreadTest("[ Thread " + 1 + "]");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest("[ Thread " + 2 + "]");
		//thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}
class MultiThreadTest extends Thread {
	public MultiThreadTest (String threadName) {
		this.setName(threadName);
	}
	public void run() {
		int sum = 0, rand = 0, cnt = 0;
		while(true) {
			if(sum >= 100) {
				break;
			}
			try {
				rand = randNum();
				sum += rand;
				Thread.sleep(500);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName() + sum);
			System.out.println();
		}
		
	}
	public static int randNum() {
		int rand = 0, sum = 0;
		for(int i = 1; i < 9999 ; i++) {
			rand = (int)((Math.random() * 10) + 1);
		}
		return rand;
	}
}