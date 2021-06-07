package java007;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
		
public class MakeException {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int i= 0;
		int n = scan.nextInt();
		int [] num = new int[n];
		
		printE(num);
	}
	
	public static int[] printE(int[] num) {
		int i = 0;
			while (true) {
				try {
						num[i++] = scan.nextInt();
						//throw  new Exception();
						for (i = 0; i < num.length; i++) {
								System.out.println(num[i]);
						}
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("ERROR");
					}
				return num;
			} 
	}
	/*
		Stack <Integer>	num = new Stack<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random()*1000);
			num.add(rand);
		} 	
		System.out.println(num);
		for (int i = 0; i  < 10; i++) {
			System.out.println(num.pop());
			System.out.println(num);
		}
		*/
}
