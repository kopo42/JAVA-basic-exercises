package java003;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZ {

	public static void main(String[] args) {
		TimeZone time;
		Date date = new Date ();
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss z Z");
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + "  :  " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Germany/Berlin");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + "  :  " + dateFormat.format(date));
	}
}