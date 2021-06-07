package hw001;
import java.util.Scanner;
public class HW01P1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int f = 0;
		int f1 = 1;
		int fn = 0;
		
		try {
			for (int i = 0; i <= n; i++) {
				System.out.print(f + " ");
				fn = f1 + f;
				f = f1;
				f1 = fn;
				
					if (i == n) {
						System.out.println();
						throw new Exception(" ");
					}
				} 
		
			}catch( Exception e) {
				System.out.println("SEQUENCE TERMINATED");
					}
		}
	}
