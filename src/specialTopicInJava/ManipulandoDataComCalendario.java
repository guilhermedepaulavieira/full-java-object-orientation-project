package specialTopicInJava;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDataComCalendario {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		// How to add 4h in date time? Instantiate a Calendar.
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d); //Now calendar with Date started inside it.
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
//		cal.add(Calendar., 0) To have, time of day, day, month, year, week, another...
		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("\nGETTING TIME UNIT");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date e = Date.from(Instant.parse("2020-05-10T15:41:07Z"));
		
		System.out.println(sdf1.format(e));
		
		Calendar cal3 = Calendar.getInstance();
		
		cal.setTime(e);
		
		int minutes = cal3.get(Calendar.MINUTE); // Get to catch the minute.
		int month = 1 + cal3.get(Calendar.MONTH); // O month, january is 0
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		

	}

}
