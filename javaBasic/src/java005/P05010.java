package java005;
public class P05010 { //Main
	static String nums;
	static String words;
			public P05010 (String temp) {
				this.nums = temp;
				this.words = temp;
			}
			public static void WprintReverse(String s) {
				for (int i = nums.length() - 1 ; i >= 0; i--) {
					System.out.print(nums.charAt(i));
				}
			}
				
			public static void printReverse(String s) {
				for (int i = nums.length() - 1 ; i >= 0; i--) {
					System.out.print(nums.charAt(i));
				}
		}
}
