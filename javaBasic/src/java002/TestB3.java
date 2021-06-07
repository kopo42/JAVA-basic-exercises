package java002;
import java.util.Scanner;
public class TestB3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i = 0;
		int cnt = 0;
		while (true) {
			if (n == (int)(Math.random()  * 20)) {//random: 0.0~1.0
				break;
			}
			
			
			
			
			cnt ++;
		}
		 
		/*
		int i = 0;
		
		if (n > 0 && n <= 20) {
			
			for (i = 1; ;i++) {
			int ran = (int)(Math.random()  * 20);
				if (ran != n) {
			System.out.println(i + " - " + ran);
			} else {
				System.out.println(i + " - " + ran);
				break;
				}	
			}
			System.out.println("Number of trials: " + i);
			

		} else {
			System.out.println("the number must be from 0 to 20");
		}  */

	}

}
