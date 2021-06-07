package java005;
public class P05005 {

	public static void main(String[] args) {
		System.out.println("Name / Title / Age / Offense Power / Defense Power");
		
		Stats stats1 = new Stats("Aragorn", "Son of Arathorn", 87, 912.86, 642.3);

		Stats stats2 = new Stats("Legolas", "Grean leaf", 2000, 872.6, 464.34);

		Stats stats3 = new Stats("Gandalf", "Mithrandir", 9999, 9999.99, 9999.99);

		Stats stats4 = new Stats("Arwen", "Even Star", 9999, 724.65, 712.33);

		System.out.println(stats1.printCharacter());
		System.out.println(stats2.printCharacter());
		System.out.println(stats3.printCharacter());
		System.out.println(stats4.printCharacter());

		}	
	}	
/*class statClass{
	
	String name, title;
	int age;
	double offense, defense;
	
	public statClass (String s1, String s2, int n1, double n2, double n3) {
		this.name = s1;
		this.title = s2;
		this.age = n1;
		this.offense = n2;
		this.defense = n3;
	}
	
	public String printCharacter() {
		String ret = "";
		ret = name + " | "  + title + " | " + age + " | " + offense + " | " + defense; 
		return ret;
	}
	
	}
	*/
