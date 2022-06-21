package specialTopicInJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		// It is always stored in UTC format and then at the time of display on the screen
		// Convert to local time. 
		
		// Date is a long number
		
		// SimpleDateFormat, convert Date and String. 
		
		// Padrão ISO 8601 below;
//		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		System.out.println(y3);
		
		// Creating the Data Object
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("28/06/2018");
		Date y2 = sdf2.parse("28/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(y1 + "\ntime 00:00, why didn't you put time");
		System.out.println(y2);
		System.out.println();
		// To stay in the pattern of "dd/MM/yyyy" have to pull the format
		System.out.println("----------------------------------------");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println();
		
		
		Date x1 = new Date(); // Date with current format.
		System.out.println("x1: " + sdf2.format(x1));
		
		Date x2 = new Date(System.currentTimeMillis()); 
		// Another way to make date with current time.
		// Convert Millisecond to Current Time.
		System.out.println("x2: " + sdf2.format(x2));
		
		Date x3 = new Date(0L);
		System.out.println("x3: " + sdf2.format(x3));
		// java stores a Date in milliseconds of 01/01/1970.
		// With this, it will print the Date with 3h before, because we are in BR. (-3h UTC)
		
		// Multiplies the entire parameter in milliseconds.
		Date x4 = new Date(1000L * 60L * 60L * 5L); // Sufixo L para Long. 
		// (1seg = 1000mlseg * 60L(1min) *60L (P/ 1h) * 5L (for 5 hours)
		// For him to pass a date of 5h from 01/01/1970.
		System.out.println("x4: " + sdf2.format(x4) + "\n2h in the morning, because in BR, -3H");

		System.out.println("----------------------------------------");
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("Formato do Brasil");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		
		System.out.println("----------------------------------------");
		System.out.println("Formato Padrão do Java");
		System.out.println("y1: " + (y1));
		System.out.println("y2: " + (y2));
		System.out.println("y3: " + (y3));
		System.out.println("x1: " + (x1));
		System.out.println("x2: " + (x2));
		System.out.println("x3: " + (x3));
		System.out.println("x4: " + (x4));
		
	}
}


