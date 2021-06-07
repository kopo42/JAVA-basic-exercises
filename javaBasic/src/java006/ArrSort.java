package java006;

import java.util.Arrays;

public class ArrSort {
		static int[] num = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		static int[] AsNum = new int[11];
		static int[] DeNum = new int[11];
	public static void main(String[] args) {
		

		int min = num[0];
		min(num);
	}
	public static void min(int[] n) {
		int min = n[0];
		int idx = 0;
		int j = 0;
		//Min
		for (int i = 0; i < n.length; i++) {
			for (j = i; j < n.length-1; j++) {
				if (n[j] < min) {
					min = n[j];
					AsNum[i] = min;
					} 
				} 

			}System.out.println(min);

		}
	}
