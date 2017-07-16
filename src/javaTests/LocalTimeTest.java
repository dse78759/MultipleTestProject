package javaTests;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalTimeTest {

	static void sout (String s ) { System.out.println(s); }

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		
		sout ( now.toString() );
		
		sout ( now.format(DateTimeFormatter.ISO_LOCAL_TIME));
	//	sout ( now.format(DateTimeFormatter.ISO_DATE));
		
		sout ( "nano:" +now.getNano() );
		
		Date d = new Date();
		
		sout ("" +  d.getTime() );
		
//		System.
		
	}

}
