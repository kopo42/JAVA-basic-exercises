package java008;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> array1 = new ArrayList<String>();
		//ArrayList<String> array2 = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);

		String s1 = scan.next();
		String s2 = scan.next();
		//array1.add(s1);
		//array2.add(s2);
		
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					cnt++;
				}
			}
		
		}
	}
}
