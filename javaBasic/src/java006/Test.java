package java006;
import java.util.Scanner;
public class Test implements CalInterface {

	static Scanner scan = new Scanner(System.in);
	static String formula = scan.next();
	char operator = getOperator(formula);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		if (test.operator == '+') {
				String[] s1 = formula.split("\\+");
				String n1 = s1[0];
				String n2 = s1[1];
				double num1 = Double.parseDouble(n1);
				double num2 = Double.parseDouble(n2);
				double add = test.calAddition(num1, num2);
				System.out.println(add);
			
		} else if (test.operator == '-') {
				String[] s1 = formula.split("\\-");
				String n1 = s1[0];
				String n2 = s1[1];
				double num1 = Double.parseDouble(n1);
				double num2 = Double.parseDouble(n2);
				double sub = test.calSubtraction(num1, num2);
				System.out.println(sub);
				
		} else if (test.operator == '*') {
				String[] s1 = formula.split("\\*");
				String n1 = s1[0];
				String n2 = s1[1];
				double num1 = Double.parseDouble(n1);
				double num2 = Double.parseDouble(n2);
				double mul = test.calMultiplication(num1, num2);
				System.out.println(mul);
				
		} else if (test.operator == '/') {
			String[] s1 = formula.split("\\/");
			String n1 = s1[0];
			String n2 = s1[1];
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			double div = test.calDivision(num1, num2);
			System.out.println(div);
		} 
	}

	public double calAddition(double num1, double num2) {
		// TODO Auto-generated method stub
		double add = num1 + num2;
		return add;
		}
	

	@Override
	public double calSubtraction(double num1, double num2) {
		// TODO Auto-generated method stub
		double sub = num1 - num2;
		return sub;
	}

	@Override
	public double calMultiplication(double num1, double num2) {
		// TODO Auto-generated method stub
		double mul = num1 * num2;
		return mul;
	}

	@Override
	public double calDivision(double num1, double num2) {
		// TODO Auto-generated method stub
		double div = num1 / num2;
		return div;
	}

	@Override
	public char getOperator(String formula) {
		// TODO Auto-generated method stub
		char operator = '0';
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
