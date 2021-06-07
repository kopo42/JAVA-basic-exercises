package java009;
public class Test0326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new randThread("");
		thread1.start();
	}
}
	
class randThread extends Thread {
	public randThread (String threadName) {
		this.setName(threadName);
	}
	public void run() {
		double rand = 0, sum = 0, avg = 0, min = 0, max = 0;
		int cnt = 0;
		while(true) {
			if (cnt >= 10) {
				break;
			}
			try {
				rand = randNum();
				sum += rand;
				avg = sum / cnt;
				min = min(rand, randNum());
				max = max(rand, randNum());
				Thread.sleep(500);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(rand);
			System.out.println(this.getName() + "count - " + cnt + " sum - "
					+ sum + " avg - " + avg + " min - " + min + " max - " + max);
		}
	}
	public static double randNum() {
		double rand = 0, sum = 0;
		for(int i = 0; i < 1 ; i++) {
			rand = (Math.random() * 20) + 1;
		}
		return rand;
	}
		
	public static double min(double a, double b) {
		double m = 0;
		if(a < randNum()) {
			m = a;
		}
		return m;
	}
		
	public static double max(double a, double b) {
		double M = 0;
		if(a > randNum()) {
			M = a;
		}
		return M;
	}
}


