package java004;
import java.util.Scanner;
public class Main {
	
	public static final String father = "Raymond";
	public static final String mother = "Ava";
	public static final String son = "Kevin";
	public static final String daughter = "Elenore";
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			main.showmenu();
			int n = scan.nextInt();
		}
	}
	public void showmenu() {
		System.out.print("Printing a Name"
				+ "\n1. Father\n2. Mother\n3. Son\n4. Daughter"
				+ "\n-->  ");
	}
		public void addition(int n) {
		/*String memname = ("Raymond Ava John Rosa");
		String[] names = memname.split(" ");
		*/
			String mem = " ";
		
		switch (n) {
		case 1:
			mem = father;
			break;
		case 2:
			mem = mother;
			break;
		case 3:
			mem = son;
			break;
		case 4:
			mem = daughter;
			break;
		default:
			System.out.println("Try Again");
			}
		System.out.println(mem + "\n");
		}
	public void printName(String name) {
		System.out.println("Name : "+ name);
		}
	}
	