package java003;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Cal03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		String date1 = scan.nextLine();
		String date2 = scan.nextLine();
		
		int intdate1 = Integer.parseInt(date1);
		int intdate2 = Integer.parseInt(date2);
		System.out.println(intdate1);
		int i = 1;
		int diff = 0;
		
		//int n = scan.nextInt();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		LocalDate ld1 = LocalDate.parse(date1, dtf);
		LocalDate ld2 = LocalDate.parse(date2, dtf);
		
		if (intdate1 < intdate2) {
			for (i = 1; i <= 31; i++) {
			LocalDate ldDiff = ld1.plusDays(i);
			if (ldDiff == ld2) {
				diff = i;
				break;
			}
		} 
	}	System.out.println(diff);
		
		//Duration diff = Duration.from(ld1.atStartOfDay(), n);
		//long diffDays = diff.toDays();
		
		System.out.println(ld2);
	
	
	}
}
