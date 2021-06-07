package java008;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
	static HashSet<Integer> num = new HashSet<Integer>();
	static Iterator<Integer> it = num.iterator();
	
	public static void main(String[] args) {
		num = randNum(num);
		System.out.println(num);
	}

	//2) Generate random numbers from 1 to 10 and insert them into the hashset.
	public static HashSet randNum(HashSet num) {
		int cnt = 0, sum = 0;
		while (num.size() <= 10) {
			for(int i = 1; i < 9999 ; i++) {
				int rand = (int)((Math.random() * 10) + 1);
				System.out.println("# " + i + " - " + rand);
				num.add(rand);
				cnt++;
				
				// if size of hashset num == 10
				/*
				if(num.contains(1) && num.contains(2) && num.contains(3) && num.contains(4)
						&& num.contains(5) && num.contains(6) && num.contains(7)
						&& num.contains(8) && num.contains(9) && num.contains(10)) {
					break;
				}
				*/
			}
		}
		System.out.println("Total number of trials : " + cnt);
		return num;
	}
}