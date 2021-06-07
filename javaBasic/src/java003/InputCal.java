package java003;
import java.util.*;
public class InputCal {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("YEAR: ");
		int year = scan.nextInt();
		System.out.print("MONTH: ");
		int month = scan.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, 1);
		
		int firstday = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Sunday\t"+ "Monday\t"+ "Tuesday\t"+ "Wednesday\t"
				+ "Thursday\t"+ "Friday\t" + "Saturday");
		
		for (int j = 1; j <firstday; j++) {
			System.out.print("  \t");
		}

		int end = cal.getActualMaximum(Calendar.DATE);
		
		for (int i = 1; i <= end; i ++) {
			cal.set(Calendar.DATE, i);
			System.out.print(i + "\t");

			int k = cal.get(Calendar.DAY_OF_WEEK);
			if(k % 7 == 0) {
					System.out.println();
				}
			} 
		}
	}
