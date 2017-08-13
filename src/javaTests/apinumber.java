package javaTests;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.junit.Test;


public class apinumber {

	@Test
	public void test() {
		
		String pattern="42.*";
		String apiNumber[] = { "42-111-22323", "4233344566", "33322222","ewrwe","--"};
		
		Pattern pat42 = Pattern.compile (pattern);
		
		sout ("---=== Test 1: " + pattern );
		
		for ( String pat : apiNumber ) {
			sout ( pat +" " + pat42.matcher(pat).matches());
		}
		
		pattern= "42-\\d{3}-\\d{5}";
		Pattern hyphen = Pattern.compile(pattern);
		
		sout ("---=== Test 2: "+ pattern);
		
		for ( String pat : apiNumber ) {
			sout ( pat +" " + hyphen.matcher(pat).matches());
		}
		
		Pattern nohyphen42 = Pattern.compile("42\\d{8}");
		
		sout ("---=== Test 3: "+ pattern);
		
		for ( String pat : apiNumber ) {
			sout ( pat +" " + nohyphen42.matcher(pat).matches());
		}

		Pattern no42 = Pattern.compile("\\d{8}");
		
		for ( String pat : apiNumber ) {
			sout ( pat +" " + no42.matcher(pat).matches());
		}

	}
	
	public void sout ( String s ) { System.out.println(s); }
	

	

}
