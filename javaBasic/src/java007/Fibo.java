package java007;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int[] F = new int[n];
		fiboNums(F, n);
	}
	
	public static void fiboNums(int[] F, int N) {
		F[0] = 0; F[1] = 1;
		if (N == 1) {
			N = 1;
		} else {
			for (int i = 2; i < N; i++) {
				F[i] = F[i-1] + F[i-2];
				System.out.println(F[i]);
			}
			
		}

	}

}
