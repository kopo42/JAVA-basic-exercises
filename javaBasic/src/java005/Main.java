package java005;
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nums = scan.next();
		
		P05010 rev = new P05010(nums);
		
		rev.WprintReverse(nums);
	}
}