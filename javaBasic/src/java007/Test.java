package java007;
import java.util.Scanner;
public class Test {
	static Scanner scan = new Scanner(System.in);
	static int[] price = new int[5];
	static int[] quantity = new int[5];
	
//incomplete
	
	public static void main(String[] args) {
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
				String inprice = scan.nextLine();
				price = inputP(price);		
				String inquant = scan.nextLine();		
				quantity = inputQ(quantity);
				} else if (mainChoice == 2) {
					getSum(price, quantity);
				} else if (mainChoice == 3) {
					price = reset(price);
					quantity = reset(quantity);
				}
			}
		}
	public static int mainMenu() {
		System.out.print("[Price] ");
		System.out.println("milk - " + price[0] + " apple - " + price[1] + " orange - " + price[2]
				+ " melon - " + price[3] + " water - " + price[4]);
		System.out.println("1. Set the prices of items");
		System.out.println("2. Calculate the charges");
		System.out.println("3. Reset the prices of items");
		System.out.println(" --> ");
		return scan.nextInt();
	}
	
	public static int[] inputP(int[] price) {
		int i = 0;
		System.out.print("Please input prices in order: \n-->");
		for (i = 0; i < price.length; i++) {
			price[i] = scan.nextInt();
		}
		return price;
	}
	
	public static int[] inputQ(int[] quantity) {
		int i = 0;
		System.out.print("Please input quantities in order: \n-->");
		for (i = 0; i < quantity.length; i++) {
			quantity[i] = scan.nextInt();
		}
		return quantity;
	}
	
	public static void getSum (int[] price, int[] quantity) {
		int i = 0, sum = 0;
		int[] SUM = new int[price.length];
		for (i = 0; i < price.length; i++) {
			SUM[i] = price[i] * quantity[i];
			sum += SUM[i];
		}
		System.out.println(sum);
	}
	public static int[] reset(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = 0;
		}
		return n;
	}
}


