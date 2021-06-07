package java007;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Numbering {
	//FIFO

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue <Integer> num = new LinkedList<Integer>();
		int cnt = 1, sum = 0;
		
		for(int i = 0; i < 10; i++) {
			num.offer(scan.nextInt());
		}

		while (true) {
			try {
				int n2 = scan.nextInt(); //exception = scan != num
				for(int i = 0; i < 10; i++) {
					System.out.println(num.poll());
						if (num.poll() != n2) {
							cnt ++;
							System.out.println(cnt);
						} else {
							break;
						}
				} //System.out.println(sum);
			} catch (Exception e) {
				System.out.println("ERROR");
			}
		} //while true
	}

}
