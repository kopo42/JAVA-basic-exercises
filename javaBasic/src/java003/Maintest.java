package java003;
import java.util.Scanner;
public class Maintest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*String text = "Hello How are you? I'm fine thank you and you";
		String[] t = text.split(" ");
		
		/*for(int x =0; x<t.length ; x++) {
			   System.out.print(x);
			   
			}System.out.println();
		
		for (int i = 0; i < t.length; i++ ) {
			System.out.println(t[i]);
		}*/

	//String temp = "I am a boy"; //!!User inputs a string!!
		String temp = scan.nextLine();
		for (int i = 0; i < 10; i++) {
			int change = (int)temp.charAt(i);
			if (change < 97 && change >= 65) {
				char lower = (char)(change + 32);
				System.out.print(lower);
			} 
			 else if (change >= 97){
				char upper = (char)(change - 32);
				System.out.print(upper);
			} else if (change == 32) {
				System.out.print(" ");
			}
		}
	
		
		
	
		/*final static String[] FIRST = {"ぁ","あ","い","ぇ","え","ぉ","け","げ","こ", 
				"さ","ざ","し","じ","す","ず","せ","ぜ","そ","ぞ"};
		
		final static String [] NEU = {"た","だ","ち","ぢ","っ","つ","づ","て","で","と", 
				"ど","な","に","ぬ","ね","の","は","ば","ぱ","ひ","び"};
		
		final static String [] FIN = {"","ぁ","あ","ぃ","い","ぅ","う","ぇ","ぉ","お",
				"か","が", "き","ぎ","く","ぐ","け","げ","ご","さ","ざ","し","じ","ず","せ","ぜ","そ","ぞ"};
		
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in); //creating an object
		//data type, variable name, 
			System.out.println("Input in Korean: ");
			String temp2 = scan.nextLine();
			
			for (int i = 0; i < temp2.length(); i++) {
				char dis = temp2.charAt(i); //character at
				
				if(dis >= 0XAC00) {
			
				//Frist
				char first = (char)((dis - 0XAC00) / 28 / 21);
		
				//Neutral
				char neu = (char)((dis - 0XAC00) / 28 % 21);
		
				//final
				char fin = (char)((dis - 0XAC00) % 28);
			
				System.out.print(FIRST[first] + NEU[neu] + FIN[fin]);
				} else {
					System.out.print(dis);
				}*/

		
		
		
		
		
			
	}
}