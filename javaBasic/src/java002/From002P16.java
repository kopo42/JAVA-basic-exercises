package java002;
import java.util.Scanner;
public class From002P16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input the smaller value first: ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int N = 0;
		int LCM = 0;
		for (int i = 0; i <= m; i++) {
			N = n * i;
			if (N == m) {
				LCM = N;
				break;
			}
			else if (N == n*m) {
				LCM = n*m;
				break;
			}
		}System.out.println(LCM);
	}
}
