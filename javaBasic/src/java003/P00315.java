package java003;
import java.util.Scanner;
public class P00315 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		double result = 0;
		
		if(str.contains("+")) {
			String n1 = str.substring(0, str.lastIndexOf("+"));
			String n2 = str.substring(str.lastIndexOf("+") + 1);
			
			double dn1 = Double.parseDouble(n1);
			double dn2 = Double.parseDouble(n2);
			
			result = dn1 + dn2;
			} else if(str.contains("-")) {
				String n1 = str.substring(0, str.lastIndexOf("-"));
				String n2 = str.substring(str.lastIndexOf("-") + 1);
				
				double dn1 = Double.parseDouble(n1);
				double dn2 = Double.parseDouble(n2);
				
				result = dn1 - dn2;
			} else if(str.contains("*")) {
				String n1 = str.substring(0, str.lastIndexOf("*"));
				String n2 = str.substring(str.lastIndexOf("*") + 1);
				
				double dn1 = Double.parseDouble(n1);
				double dn2 = Double.parseDouble(n2);
				
				result = dn1 * dn2;
			} else if(str.contains("/")) {
				String n1 = str.substring(0, str.lastIndexOf("/"));
				String n2 = str.substring(str.lastIndexOf("/") + 1);
				
				double dn1 = Double.parseDouble(n1);
				double dn2 = Double.parseDouble(n2);
				
				result = dn1 / dn2;
			} else if(str.contains("%")) {
				String n1 = str.substring(0, str.lastIndexOf("%"));
				String n2 = str.substring(str.lastIndexOf("%") + 1);
				
				double dn1 = Double.parseDouble(n1);
				double dn2 = Double.parseDouble(n2);
				
				result = dn1 % dn2;
				}
		System.out.printf("result: %.1f", result);
		}
}

