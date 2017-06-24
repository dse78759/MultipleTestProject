package javaTests;

import java.util.Map;
import java.util.Properties;

/**
 *  Demo's system.err and System.getProperty and the values available therein.
 *  
 *  
 *  TODO: demonstrate the Environment tab of Run config can be used to set environ vars.
 *  
 * @author dedgar
 *
 */
public class SystemTest {
	
	//TODO: how to static include this from elsewhere
	static void sout (String s ) { System.out.println(s); }
	
	public static void printEnviron() {
	  Map<String, String> env = System.getenv();
	  
	  System.out.println(" STARTING ENVIRION");
	  
	  for ( Map.Entry<String, String> one : env.entrySet() ) {
	    
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
    	printProps();
    	
        System.out.println("-----------------case 1-------------------");
        System.out.println("Java");
        System.err.println("ErrorStatement 1 <======Please observe the position of it "); //output comes in red ink color

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        //System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.Vendor"));
        
        System.out.println("version: " +System.getProperty("os.version"));
        System.gc();

        System.out.println("-----------------case 2-------------------");
        System.out.println("Java");
        System.err.println("ErrorStatement 2 <======Please observe the position of it "); //output comes in red ink color

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        //System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.Vendor"));
        //System.out.println(System.getProperty("os.version"));
        System.gc();

      /*  System.out.println("-----------------case 3-------------------");
        System.out.println("Java");
        System.err.println("ErrorStatement<======Please observe the position of it "); //output comes in red ink color

        //System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.Vendor"));
        //System.out.println(System.getProperty("os.version"));
        System.gc();

        System.out.println("-----------------case 4-------------------");
        System.out.println("Java");
        System.err.println("ErrorStatement<======Please observe the position of it "); //output comes in red ink color

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        //System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.Vendor"));
        System.out.println(System.getProperty("os.version"));
        System.gc();
*/


    }//main()

    /** 
     * can primitive arrays have null members
     */
    public void nullPrimitiveArrayValue () {
        String [] vals = new String[10] ;
        
        vals[1]="fasf";
        vals[2]=null;
        
        for ( String s : vals ) {
            System.out.println(s);
        }
    }
    
}