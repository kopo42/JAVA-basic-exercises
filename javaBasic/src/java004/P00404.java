package java004;
import java.util.Scanner;
public class P00404 {

	public static void main(String[] args) {
		P00404 main = new P00404();
		Scanner scan = new Scanner(System.in);
		while (true) {
		String temp = scan.nextLine();

		if(temp.contains("+")) {
			String n1 = temp.substring(0, temp.lastIndexOf("+"));
			String n2 = temp.substring(temp.lastIndexOf("+") + 1);
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			main.addition(num1, num2);
		} else if(temp.contains("-")) {
			String n1 = temp.substring(0, temp.lastIndexOf("-"));
			String n2 = temp.substring(temp.lastIndexOf("-") + 1);
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			main.subtraction(num1, num2);
		} else if(temp.contains("/")) {
			String n1 = temp.substring(0, temp.lastIndexOf("/"));
			String n2 = temp.substring(temp.lastIndexOf("/") + 1);
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			main.division(num1, num2);
		} else if(temp.contains("*")) {
			String n1 = temp.substring(0, temp.lastIndexOf("*"));
			String n2 = temp.substring(temp.lastIndexOf("*") + 1);
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			main.multiplication(num1, num2);
			}
		}
	}
	public static void addition(double num1, double num2) {
		double sum = num1 + num2;
		System.out.printf("= %.2f\n\n", sum);
	}
	public static void subtraction(double num1, double num2) {
		double sub = num1 - num2;
		System.out.printf("= %.2f\n\n", sub);
	}
	public static void multiplication(double num1, double num2) {
		double mul = num1 * num2;
		System.out.printf("= %.2f\n\n", mul);
	}
	public static void division(double num1, double num2) {
		double div = num1 / num2;
		System.out.printf("= %.2f\n\n", div);
	}
}
