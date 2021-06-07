package java004;
import java.util.Scanner;
public class P00405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P00405 main = new P00405();
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		//main.pTable();
		main.multiTable(n);
	}
	private void multiTable(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n + "X" + i + " = " + (n * i));
		}
	}

}
