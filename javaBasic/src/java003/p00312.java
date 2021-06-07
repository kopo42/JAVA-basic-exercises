package java003;

import java.util.Scanner;

public class p00312 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select a number: "
				+ "\n1. Celsius -> Fahrenheit"
				+ "\n2. Fahrenheit -> Celsius");
		int n = scan.nextInt();
		double temp = scan.nextDouble();
		
		int CtoF = (int)(temp * 1.8 + 32);
		int FtoC = (int)(((temp - 32)*(1.8)));
		
		if (n == 1) {
			System.out.println("F: " + CtoF);
		} else if (n == 2) {
			System.out.println("C: " + FtoC);
		}
	}

}
