package java003;
import java.util.Scanner;
public class P00314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		String[] words = temp.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			if (words[i].equals("a") || words[i].equals("an")) {
				System.out.println("--> " + words[i + 1]); 
				System.out.println("----> " + words[i + 1].charAt(0)); 
			}
		}
		System.out.println("---------------------------");
		if (words[3].charAt(0) == 'a'||
				words[3].charAt(0) == 'e' ||
						words[3].charAt(0) == 'i' ||
								words[3].charAt(0) =='o' ||
										words[3].charAt(0) == 'u') {
		words[2] = "an";
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
			}
		}
	}

	
