package java006;
import java.util.Arrays;
import java.util.Scanner;
public class Encryption {
	
	public static void main(String[] args) {
		char[] certi = new char[26];
		 for (int i = 0; i <certi.length; i++) {
			 certi[i] = (char)(97 + i);
		 }
		 Scanner scan = new Scanner(System.in);
		 while (true) {
				System.out.println("#Input : ");
				String s1 = scan.nextLine();
				System.out.println("#Result : ");
					for (int i = 0; i < s1.length(); i++) {
							char[] a = s1.toCharArray();
							int index = Arrays.binarySearch(certi, a[i]);
							char[] e = new char[s1.length()];
							e[i] = certi[25 - index];
							System.out.print(e[i]);
					}System.out.println("\n");
			}

	}
}
