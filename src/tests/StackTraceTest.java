package tests;

import java.util.Properties;

/**
 *  Demos Thread.currentThread().getStackTrace()  
 *  
 * @author dedgar
 *
 */
public class StackTraceTest {
	
	//TODO: how to static include this from elsewhere
	static void sout (String s ) { System.out.println(s); }

	public static void subB( ) {
	  subA();
	}
	
	public static void subA () {
	  StackTraceElement[] stack= Thread.currentThread().getStackTrace() ;
	  
	  for ( StackTraceElement s: stack) {
	    sout ( " method " + s.getMethodName() + " line:" + s.getLineNumber() + " " + s.isNativeMethod() ) ;
	  }
	}
	
    public static void main(String[] args)throws Exception {

    	subB();
    	
    }//main()

}