package java002;
import java.util.Scanner;
public class P00213 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j ++) {
				System.out.print(" ");
			}
			for (int k = 2*n-1; k >= 2*i+1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
		
		/*
		for (int i = 0; i < n; i++) {
			for (int j = n-1 ; j >= 0; j--) {
				if (i < j) {
				System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		} */
	}
}

