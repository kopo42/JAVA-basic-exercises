package java003;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;
public class Object1 {
	
	String[] WEEK = {"일","월","화","수","목","금","토"};
	String [] [] DATE = new String[6][7];
	
	public int width = WEEK.length;
	public int startday;
	public int lastday;
	public int inputdate = 1;
	
	public  void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("YEAR: ");
		int year = scan.nextInt();
		
		System.out.println("MONTH: ");
		int month = scan.nextInt();
		
		
		if (month <1 || month >12) {
			System.out.println("Please input valid month");
		} else {
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month - 1);
			cal.set(Calendar.DATE, 1);
			
			startday = cal.get(Calendar.DAY_OF_WEEK);
			lastday = cal.getActualMaximum(Calendar.DATE);
			
			int row = 0;
			for (int i = 1; inputdate <= lastday; i++) {
				if (i < startday ) {
					DATE[row][i - 1] = " ";
				} else {
					DATE[row][( i - 1 ) % width ] = Integer.toString(inputdate);
					inputdate ++ ;
					
					if ( i % width == 0) {
						row ++; //next row
						}
					}
				}
			}
	}
		public void printcal() {
			for (int i = 0; i < width ; i++) {
				System.out.println(WEEK[i] + " ");
			}
			System.out.println();
			
			int row = 0;
			for (int j = 1; j < lastday + startday; j++) {
				System.out.println(DATE[row][(j - 1 ) % width ] + " ");
				
				if (( j - 1) % width == width - 1 ) {
					System.out.println();
					row ++ ;
				}
			}
	}
}
