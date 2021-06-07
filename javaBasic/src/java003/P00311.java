package java003;
import java.util.Scanner;
public class P00311 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1: KRW -> USD"
				+ "\n2: KRW -> EUR"
				+ "\n3: USD -> KRW ");
		int type = scanner.nextInt();
		System.out.print("YOUR AMOUNT= ");
		int am = scanner.nextInt();
		double EX_RATE = 0;
		double EX_RATE1 = 1133.60;
		double EX_RATE2 = 1349.40;
		
		if (type == 1 ) {
			EX_RATE = EX_RATE1;
		} else if (type == 2 ) {
			EX_RATE = EX_RATE2;
		} else if (type == 3) {
			EX_RATE = EX_RATE1;
		}
		  else {
			System.out.println("Please check the currency number you chose "
					+ "and try again");
		  }
		
			double result = am / EX_RATE;
		double resultRE = am * EX_RATE;
		double change = result % 1;
		double changewon = change * EX_RATE;

		if (type == 1) {
			result = am / EX_RATE;
			System.out.printf("CONVERTED AMOUNT: %.2f USD", result);
			} else if (type == 2) {
			System.out.printf("CONVERTED AMOUNT: %.2f EUR", result);				
				} else if (type == 3) {
					System.out.printf("CONVERTED AMOUNT: %.2f KRW", resultRE);
		}
	}
}
