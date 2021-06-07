package java006;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		s1 = s1.replace(" ", "");
		int sum = 0, cnt = 0;

		String[] s2 = s1.split("");
		
		String wrd = scan.next();
		
		for (int i = 0; i < s2.length; i++) {
			
			if (s2[i].contains(wrd)){
				cnt ++;
			}
		}System.out.print(cnt);
	}
}
