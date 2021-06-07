package java005;
import java.util.Scanner;
public class Stats {
	Scanner sc = new Scanner(System.in);
	
	static String name, title;
	static int age;
	static double offense, defense;
	
		public Stats (String s1, String s2, int n1, double n2, double n3) {
			this.name = s1;
			this.title = s2;
			this.age = n1;
			this.offense = n2;
			this.defense = n3;
		}
			
		public static String printCharacter() {
			String ret = "";
			ret = name + " | "  + title + " | " + age + " | " 
			+ offense + " | " + defense; 
			return ret;
		}
		
		public Scanner getSc() {
			return sc;
		}

		public void setSc(Scanner sc) {
			this.sc = sc;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getOffense() {
			return offense;
		}

		public void setOffense(double offense) {
			this.offense = offense;
		}

		public double getDefense() {
			return defense;
		}

		public void setDefense(double defense) {
			this.defense = defense;
		}
}
