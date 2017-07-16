package javaTests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTest {

	static void sout (String s ) { System.out.println(s); }

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		
		sout ( now.toString() );
		
		sout ( now.format(DateTimeFormatter.ISO_LOCAL_DATE));
		sout ( now.format(DateTimeFormatter.ISO_DATE));
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeFormatter.ISO_LOCAL_DATE);

		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		
		String birthDate="1974-03-09";
		
		LocalDate parsedDate = LocalDate.parse(birthDate, formatter);	
		
		sout ("day of year "+ parsedDate.getDayOfYear());
		sout (" year "+ parsedDate.getYear());
//		  LocalDate bd = new LocalDate
		
		birthDate="2016-10-07";
		parsedDate = LocalDate.parse(birthDate, formatter);	
		
		sout ("day of week "+ parsedDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH) );
//		sout (" year "+ parsedDate.getYear());
		
	}

}
