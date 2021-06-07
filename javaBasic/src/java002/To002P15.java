package java002;
import java.util.Scanner;

import org.w3c.dom.Text;
public class To002P15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		/*
		int n = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			} else {
				System.out.print("");
			}
		} */
		
		/*for (int i = 0; i < 6; i++) {
		System.out.println((int)(Math.random()  * 45));
		}*/
		
		/*
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n-i ; j >= 0; j-=1) {
				System.out.print("0");
				}
			System.out.println("*");
			}
			*/

		
		
		/*
		int n = scanner.nextInt();
		for (int i = 0; i<n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		
		/* P10
		int num = 0;
		int n = 1;
		for (n = 2; n < 10; n++) {
			for (int i = 2; i<10; i++) { 
				System.out.println(n + " X " + i + " = " + (n * i));
				if (i == 9) {
					System.out.print("\n");
				}
					}
			}
			*/
	
		
		/*
		int n = scanner.nextInt();
		for (int i = 1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		
		/*
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		for (int i = 1; i < n-1;) {
			i += m;
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
		*/
	
		/*
		String text;
		text = scanner.nextLine();
		if(text.equalsIgnoreCase("car")) {
		//if(text.toUpperCase().contains("car".toUpperCase())==true) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string");
		}
		*/
		
		/*String text = "how are you";
		if (text.contains("how") == true) {	//(text == "hello")
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}*/
		
		
		/*int n;
		System.out.println("What number do you want?");
		n = scanner.nextInt();
		int i = 2;
		switch (n) {
			case 2:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 3:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 4:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 5:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 6:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 7:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 8:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			case 9:
				System.out.println(n + " X 2 = " + n*i++);
				System.out.println(n + " X 3 = " + n*i++);
				System.out.println(n + " X 4 = " + n*i++);
				System.out.println(n + " X 5 = " + n*i++);
				System.out.println(n + " X 6 = " + n*i++);
				System.out.println(n + " X 7 = " + n*i++);
				System.out.println(n + " X 8 = " + n*i++);
				System.out.println(n + " X 9 = " + n*i++);
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}*/

	}
}


