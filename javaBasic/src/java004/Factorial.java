package java004;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int factn = 0;
		System.out.print(factn(n) + " = ");
		printF(n);
	}
		
	public static int factn (int N) {
		int i = 0;
			if ( N == 1 ) {
				return 1;
			} else {
				return N * factn(--N);
			}
	}
	
	public static void printF (int N) {
		System.out.print(N);
		for (int i = N - 1; i > 0; i--) {
			System.out.print(" X " + i);
		}
	}
}
