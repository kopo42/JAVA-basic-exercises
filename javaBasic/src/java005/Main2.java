package java005;
import java.util.Scanner;
public class Main2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input six numbers: ");
		
		String temp = scan.nextLine();
		String[] nums = temp.split(" ");
		
		double n1 = Double.parseDouble(nums[0]);
		double n2 = Double.parseDouble(nums[1]);
		double n3 = Double.parseDouble(nums[2]);
		double n4 = Double.parseDouble(nums[3]);
		double n5 = Double.parseDouble(nums[4]);
		double n6 = Double.parseDouble(nums[5]);
		
		//System.out.println(nums[0]);
		System.out.println("Please input a number among the ones above");
		
		double nA = scan.nextDouble();
		
	}
}
