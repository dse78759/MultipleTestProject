package collectionTests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Compare the order that different map implementations will return their 
 * 		entries.
 *  
 * @author scott
 *
 */
public class LinkedHashTest {
	
	static void sout (String s ) { System.out.println(s); }

	public static void addElementsToMap ( Map  < Integer, String> fillMe ) {
		
		fillMe.put(1,"batman");
		fillMe.put(23, "superman");
		fillMe.put(400, "wonder woman");
		fillMe.put(999, "aquaman");
		fillMe.put(2000, "green lantern");
		
		fillMe.put(2, "captain america");
		fillMe.put(32, "wasp");
		fillMe.put(200, "hulk");
		fillMe.put(900, "spiderman");
		fillMe.put(4000, "silver surfer");
	}
	
	public static void runMapDemo () {
		
		Map<Integer,String> mapTest = new LinkedHashMap<Integer,String>();
		addElementsToMap(mapTest);
		
		for ( Entry<Integer,String> e : mapTest.entrySet() ) {
			sout ("" + e );
		}
		sout ("=======---========= hashmap= weird ordering");
		
		Map<Integer,String> mapTest2 = new HashMap<Integer,String>();
		addElementsToMap(mapTest2);
		
		for ( Entry<Integer,String> e : mapTest2.entrySet() ) {
			sout ("" + e );
		}
		sout("============ tree map : natural ordering of key ");
		
		Map<Integer,String> mapTest3 = new TreeMap<Integer,String>();
		addElementsToMap(mapTest3);
		
		for ( Entry<Integer,String> e : mapTest3.entrySet() ) {
			sout ("" + e );
		}
		

	}
	
    public static void main(String[] args)throws Exception {

    	runMapDemo();
    	
    }

}