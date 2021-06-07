package java006;

import java.util.Arrays;

public class Sort2 {
		static int[] num = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		static int[] AsNum = new int[11];
		static int[] DeNum = new int[11];
	public static void main(String[] args) {
		min(num);
		max(num);
	}
	public static void min(int[] n) {
		System.out.println("#In ascending order : ");

		//Min
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if (n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
					}
				} 
			System.out.print(n[i] + " ");
			}
		System.out.println();
		}
	public static void max(int[] n) {
		System.out.println("#In descending order : ");

		//Min
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if (n[i] < n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
					}
				} System.out.print(n[i] + " ");
			}
		}
	}
