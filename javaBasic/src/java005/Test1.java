package java005;
import java.util.Scanner;
public class Test1 {
	
		static Scanner scan = new Scanner(System.in);
		static String formula = scan.nextLine();	
		static double sum;
		static double sub;
		static double mul;
		static double div;
		String operator = "a";
		double result;
		
		
	public static void main(String[] args) {
		
		String[] s1 = formula.split(Operator(formula));
		String n1 = s1[0];
		String n2 = s1[2];
		System.out.println(n1 + n2);
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		
		if(Operator(formula) == "+") {
			
			sum = (int)Operator(num1, num2);
			System.out.println(sum);
		} else if(Operator(formula) == "-") {
			sub = (int)Operator(num1, num2);
			System.out.println(sub);
		} else if(Operator(formula) == "*") {
			mul = (int)Operator(num1, num2);
			System.out.println(mul);
		} else if(Operator(formula) == "/") {
			div = (int)Operator(num1, num2);
			System.out.println(div);
		} else {
			System.out.println("Invalid formula, Please try again");
		}
	}
	public static double Operator(double num1, double num2) {
		double result = 0;
		if(formula.contains("+")) {
			double sum = num1 + num2;
			result = sum;
		} else if(formula.contains("-")) {
			double sub = num1 - num2;
			result = sub;
		} else if(formula.contains("*")) {
			double mul = num1 * num2;
			result = mul;
		} else if(formula.contains("/")) {
			double div = num1 / num2;
			result = div;
		} 
			return result;
		}

	public static String Operator(String formula) { 
		String operator = "string";
		if(formula.contains("+")) {
			operator = "+";
		} else if(formula.contains("-")) {
			operator = "-";
		} else if(formula.contains("/")) {
			operator = "-";
		} else if(formula.contains("*")) {
			operator = "*";
		} 
		return operator;
	}
}