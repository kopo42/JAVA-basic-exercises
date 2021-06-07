package java005;
import java.util.Scanner;
public class Price {
	int app, str, gra, wat;
	Scanner sc = new Scanner(System.in);
	
	public Price (int a, int b, int c, int d) {
		this.app = a;
		this.str = b;
		this.gra = c;
		this.wat = d;
	}
		
	public void getPrice() {
		while (true) {
			System.out.println("\n#Price\n 1. Apple\n 2. Strawberry"
					+ "\n 3. Grape\n 4. Watermelon");
			int n = sc.nextInt();
			
			if (n == 1) {
				System.out.println(app);
			} else if (n == 2) {
				System.out.println(str);
			} else if (n == 3) {
				System.out.println(gra);
			} else if (n == 4) {
				System.out.println(wat);
			} else {
				System.out.println("Try Again");
			}	
		}
	}
}
