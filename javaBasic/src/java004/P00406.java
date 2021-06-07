package java004;
import java.util.Scanner;
public class P00406 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String formula = scan.nextLine();		
		
		double sum;
		double sub;
		double mul;
		double div;
		char operator = 'a';
		
		String n1 = formula.substring(0, formula.lastIndexOf(getOperator(formula)));
		String n2 = formula.substring(formula.lastIndexOf(getOperator(formula)) + 1);
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		
		if(getOperator(formula) == '+') {
			int sumi = (int)addition(num1, num2);
			System.out.println(sumi);
		} else if(getOperator(formula) == '-') {
			int subi = (int)subtraction(num1, num2);
			System.out.println(subi);
		} else if(getOperator(formula) == '*') {
			int muli = (int)multiplication(num1, num2);
			System.out.println(muli);
		} else if(getOperator(formula) == '/') {
			int divi = (int)division(num1, num2);
			System.out.println(divi);
		} else {
			System.out.println("Invalid formula, Please try again");
		}
	}
	public static double addition(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
	public static double subtraction(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}
	public static double multiplication(double num1, double num2) {
		double mul = num1 * num2;
		return mul;
	}
	public static double division(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}
	
	public static char getOperator(String formula) { 
		char operator = 'a';
		if(formula.contains("+")) {
			operator = '+';
		} else if(formula.contains("-")) {
			operator = '-';
		} else if(formula.contains("/")) {
			operator = '/';
		} else if(formula.contains("*")) {
			operator = '*';
		} 
		return operator;
	}
}