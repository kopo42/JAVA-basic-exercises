package java006;
import java.util.Scanner;
public class ArrStat {
	static Scanner scan = new Scanner(System.in);
	static String[][] stat = {{"Name", "Korean", "English", "Math"},
			{"Jeong", "70", "80", "100"}, {"Pyo", "60", "70", "86"},
			{"Choi", "54", "100", "82"}, {"Mike", "87", "95", "79"}};
	

	public static void main(String[] args) {
		int[][] sumint = new int[3][4];
		System.out.println("#Menu: \n 1. by Name \n 2. by Subject");
		int menu = scan.nextInt();
		sumint = sumInt(stat);
		
			if (menu == 1) {
				System.out.println("#Names: 1. Jeong 2. Pyo 3. Choi 4. Mike");
				int per = scan.nextInt();
				getPerson(sumint, per);
			} else if (menu == 2) {
				System.out.println("#Sybjects: 1. Korean 2. English 3. Math");
				int sub = scan.nextInt();
				getSub(sumint, sub);
			}
		}
		
		public static int[][] sumInt (String[][] stat) {
		int sumint[][] = new int[4][5];
		for(int i = 0; i < stat.length-1; i++) {
			for(int j = 0; j <stat[i].length-1; j++) {
				System.out.println(stat.length);
				System.out.println(stat[i].length);
				sumint[i][j] = Integer.parseInt(stat[i+1][j+1]);
			}
		} return sumint;
	}
	
	public static void getSub (int[][] sumint, int a) {
		int i = 0;
		int sumSub = 0;
		double avgSub = 0;
		int minSub = sumint[0][a];
		int maxSub = 0;
		
		for (i = 0; i < sumint.length; i++) {
			sumSub += sumint[i][a];
		}
		avgSub = sumSub / (sumint.length);

		//Min
		for (i = 0; i < sumint.length; i++) {
			for (int j = i; j < sumint.length; j++) {
				if (sumint[j][a] < minSub) {
					minSub = sumint[j][a];
					}
				} 
			}
		//Max
		for (i = 0; i < sumint.length; i++) {
			for (int j = i; j < sumint.length; j++) {
				if (sumint[j][a] > maxSub) {
					maxSub = sumint[j][a];
					}
				} 
			}
		System.out.println("SUM : " + sumSub);
		System.out.println("AVG : " + avgSub);
		System.out.println("MIN : " + minSub);
		System.out.println("MAX : " + maxSub);
	}

	public static void getPerson (int[][] sumint, int a) {
		int i = 0;
		int sumPer = 0;
		double avgPer = 0;
		int minPer = sumint[a][0];
		int maxPer = 0;
		int b = a - 1;
		
		for (i = 0; i < sumint.length; i++) {
			sumPer += sumint[b][i];
		}
		avgPer = sumPer / (sumint.length);

		//Min
		for (i = 0; i < sumint.length; i++) {
			for (int j = i; j < sumint[i].length; j++) {
				if (sumint[b][j] < minPer) {
					minPer = sumint[b][j];
					}
				} 
			}
		//Max
		for (i = 0; i < sumint.length; i++) {
			for (int j = i; j < sumint.length; j++) {
				if (sumint[b][j] > maxPer) {
					maxPer = sumint[b][j];
					}
				} 
			}
		System.out.println("SUM : " + sumPer);
		System.out.println("AVG : " + avgPer);
		System.out.println("MIN : " + minPer);
		System.out.println("MAX : " + maxPer);
	}
}

