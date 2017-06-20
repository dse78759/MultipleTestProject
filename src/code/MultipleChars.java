package code;

//import java.awt.font.NumericShaper;
import java.util.Date;
import java.util.LinkedHashSet;

public class MultipleChars {

	public static void sout ( String s) { System.out.println(s); }
	
	public static void main(String[] args) {
	
		final long numTests=1000000;
		final String testString= "ten turtles talked to the tsar timidly toward the tail time";
		
		MultipleChars mult = new MultipleChars();
		
		// test 1
		Date dt1=new Date();// should get current time

		sout("output 1: "+ mult.repeatedLetters(testString	));

		for ( int i=0;i<numTests; i++) {
			mult.repeatedLetters(testString	);
		}
		Date dt2=new Date();
		sout ( "speed of using string to find hits: " + (dt2.getTime() - dt1.getTime()) );
		
		// test 2
		dt1=new Date();// should get current time

		sout("output 2:" + mult.repeatedLettersEfficient(testString	));

		for ( int i=0;i<numTests; i++) {
			mult.repeatedLettersEfficient(testString	);
		}
		
		dt2=new Date();
		sout ( "fuck you aj 2: " + (dt2.getTime() - dt1.getTime()) );
	
	}
	
	public String repeatedLetters ( String input ) {
	    
//	    HashSet<String> whatWeSaw = new HashSet<String>();
//	    HashSet<String> whatWeSaved = new HashSet<String>();
	    
	    StringBuffer output = new StringBuffer ();
	    
	    int i=0;
	     while ( i < input.length() ) {
	         char currChar = input.charAt( i ) ;//.toLowerCase();
	         String currCharStr=currChar+"";
	   
	         if (! output.toString().contains(currCharStr))
//	         if ( whatWeSaw.contains( currCharStr ) ) {
//	             if ( !whatWeSaved.contains ( currCharStr ) ) {
	         {
	        	 output.append ( currCharStr ); 
	               //  whatWeSaved.add( currCharStr );
//	             }
	         }
//	         else {
//	             whatWeSaw.add ( currCharStr ) ;
//	         }
	         
	         i++;
	     }
	     
	     return output.toString();   
	}

	public String repeatedLettersEfficient ( String input ) {
	    
	    LinkedHashSet<Character> whatWeSaw = new LinkedHashSet<Character>();
	    LinkedHashSet<Character> whatWeSaved = new LinkedHashSet<Character>();
	    
	    StringBuffer output = new StringBuffer ();
	    
	    int i=0;
	     while ( i < input.length() ) {
	         Character currCharStr = input.charAt( i ) ;//.toLowerCase();
	        // String currCharStr=currChar+"";
	         
	         if ( whatWeSaw.contains( currCharStr ) ) {
	             if ( !whatWeSaved.contains ( currCharStr ) ) {
	                 output.append ( currCharStr ); 
	                 whatWeSaved.add( currCharStr );
	             }
	         }
	         else {
	             whatWeSaw.add ( currCharStr ) ;
	         }
	         
	         i++;
	     }
	     
	     return output.toString();   
	}

}
