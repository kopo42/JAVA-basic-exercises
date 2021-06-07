package java002;
import java.util.Scanner;
public class P00217 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input greater value first : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int r = 0;
		int R = n % m ;
		
		switch (R) {
		case 1:
			while (r > 0) {
				r = n % m;
				n = m;
				m = r;
			}
			System.out.println(m);
			break;
			
		case 0: 
			System.out.println("Their GCD is: " + m);
			break;
		}
	}
}
