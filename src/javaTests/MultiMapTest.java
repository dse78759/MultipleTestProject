package javaTests;

import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections.map.MultiValueMap;

public class MultiMapTest {
	
	static void sout (String s ) { System.out.println(s); }
	
	public static void printEnviron() {
	  Map<String, Object> env = new MultiValueMap();
	  
	  env.put("age", new Integer(10));
	  env.put("name", "scott");
	  
	  System.out.println(" STARTING ENVIRION");
	  
	  for ( Map.Entry<String, Object> one : env.entrySet() ) {
	    
	    System.out.println(one.getKey() + " ==== " + one.getValue() );
	  }
	}

	/**
	 * 
	 */
	public static void printProps () {
	  System.out.println(" STARTING PROPERTIES");
      
	  Properties prop= System.getProperties() ;
	       
		 prop.keySet();
		 for ( Object o : prop.keySet()
				 ) {
			 sout ( " "+ o.toString()  + " = "+ prop.getProperty(o.toString()));
		 }
	}
	
    public static void main(String[] args)throws Exception {

      printEnviron();
//    	printProps();
    	
//        System.out.println("-----------------case 1-------------------");
//        System.out.println("Java");
//        System.err.println("ErrorStatement 1 <======Please observe the position of it "); //output comes in red ink color
//
//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("os.name"));
//        //System.out.println(System.getProperty("os.version"));
//        System.out.println(System.getProperty("java.Vendor"));
//        
//        System.out.println("version: " +System.getProperty("os.version"));
//        System.gc();
//
//        System.out.println("-----------------case 2-------------------");
//        System.out.println("Java");
//        System.err.println("ErrorStatement 2 <======Please observe the position of it "); //output comes in red ink color
//
//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("os.name"));
//        //System.out.println(System.getProperty("os.version"));
//        System.out.println(System.getProperty("java.Vendor"));
//        //System.out.println(System.getProperty("os.version"));
//        System.gc();

      
    }//main()

}