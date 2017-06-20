package velocityProject;
//package net.javabeat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class ScannerTest {
	public static void SpeakIt(String fileName) {
		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			
			sout ("delimiter="+sc.delimiter().toString());
//			patternMatcher(sc);
			patternMatcherWeird(sc);
//			allAtOnce(sc);
//			while (sc.hasNext()) {
//				System.out.println(sc.nextLine());
//			}

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void sout ( String s ) {
		System.out.println(s);;
	}
	
	public static void allAtOnce ( Scanner s ) {
		String blah = s.findInLine(Pattern.compile(".*+="));
		sout ("find in line: "+blah);
		
		//s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
	    s.findInLine("\\[(.*)\\] * (\\s+) *= *(\\s+)");
	     MatchResult result = s.match();
	     for (int i=1; i<=result.groupCount(); i++)
	         System.out.println(result.group(i));
	     //s.close();
	}
	
	public static void patternMatcherWeird ( Scanner scanner ) {
		
		scanner.useDelimiter(Pattern.compile("[ =\\]]"));
				
		try {
			while ( scanner.hasNextLine() ) {
				scanner.useDelimiter(Pattern.compile("\\]"));
				String s = scanner.next(); 

				String type=s.replaceAll("\\[", "").trim();
				
				sout ( "found type :" + type +":" );

				scanner.useDelimiter(Pattern.compile("="));

				s = scanner.next();
				String name=s.replaceAll("\\]", "").trim();

				sout ( "found name :" +name);

				s= scanner.nextLine();
				StringBuffer value=new StringBuffer( s.replaceFirst("=", "").trim());
				int commaIndex=value.lastIndexOf(";");
				
				if ( commaIndex==-1 ) ; //TODO
				
				value.replace(commaIndex, commaIndex+1, "");
				
				sout ("  value ( rest of line) : " +s+":"+value+"\n" );
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

	public static void patternMatcher ( Scanner scanner ) {
//		scanner.hasNext(Pattern.compile("..rld"))
		
		try {
			while ( scanner.hasNextLine() ) {
				String s = scanner.next(Pattern.compile("^\\s*\\[.*\\]")); // whitespace, left bracket, something, right bracket
				sout ( "found type :" + s +":\n" );
				
				String blah = scanner.findInLine(Pattern.compile(".*+="));
				sout ("find in line: "+blah);
				
//				scanner.h
				s = scanner.next(Pattern.compile(".*"));
				sout ( "found name : " + s );

//			s = scanner.next(Pattern.compile(".*=")).trim();
//			sout ( "found name : " + s );

				s= scanner.nextLine();
				sout ("skipping rest of line : " +s );
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sout ("msg:" + e.getMessage());
			sout (e.getCause().toString());
		}
	}

	public static void main(String[] args) {
		SpeakIt("./src/values.txt"); 
	}
}
