package java002;
import java.util.Scanner;
public class P00218 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		int i = 0;
		int n = scan.nextInt();
		int PN = 0;
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					System.out.print("");
				} else {
					PN = i;
				}
			}System.out.println(i);
		}

	}

}
