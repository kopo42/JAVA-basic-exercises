package java007;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] temp = new Integer[10];
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = scan.nextInt();
		} 
		
		Arrays.sort(temp);
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("==============");
		Arrays.sort(temp, Collections.reverseOrder());
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
