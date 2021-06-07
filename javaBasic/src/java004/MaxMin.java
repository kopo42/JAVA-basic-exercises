package java004;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nums = scan.nextLine();
		String[] n = nums.split(" ");
		
		double n1 = Double.parseDouble(n[0]);
		double n2= Double.parseDouble(n[1]);
		double n3= Double.parseDouble(n[2]);
		double n4 = Double.parseDouble(n[3]);
		
		double sum = n1 + n2 + n3+ n4;
		double avg = sum / 4;
		double m = n1;
		double M = n1;
		
		if (n3 < n4) {
			if (n2 < n3) {
				if (n2 < m) {
					m = n2;
				}
			} else if (n3 < m) {
				m = n3;
			} 
		} else if (n4 < m) {
			m = n4;
		}
		
		if (n3 > n4) {
			if (n2 > n3) {
				if (n2 > M) {
					M = n2;
				}
			} else if (n3 > M) {
				M = n3;
			} 
		} else if (n4 > M) {
			M = n4;
		}
		
		System.out.printf("Summation : %.2f \n", sum);
		System.out.printf("Average : %.4f \n", avg);
		System.out.printf("Minimum : %.2f\n", m);
		System.out.printf("Maximum : %.2f\n", M);
		
	}

}
