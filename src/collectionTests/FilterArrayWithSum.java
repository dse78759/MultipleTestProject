package collectionTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


 
public class FilterArrayWithSum {
 
	public static void addCheck ( Set<String> w , String a) {
		boolean newItem = w.add(a);
		if ( !newItem) {
			System.err.println("dupe added");
		} else {
			//System.err.println("added");
		}
	}
	
	public static void main(String[] args) {

		Set<String> zoo = new HashSet<String>();
		
		FilterArrayWithSum.addCheck( zoo,"elephant");
		FilterArrayWithSum.addCheck( zoo,"rhino");
		FilterArrayWithSum.addCheck( zoo,"hyena");
		FilterArrayWithSum.addCheck( zoo,"lion");
		FilterArrayWithSum.addCheck( zoo,"rhino"); // dupe
        FilterArrayWithSum.addCheck( zoo,"kangaroo");
        FilterArrayWithSum.addCheck( zoo,"spider");
        FilterArrayWithSum.addCheck( zoo,"lion"); //dupe
        FilterArrayWithSum.addCheck( zoo,"hippo");
        FilterArrayWithSum.addCheck( zoo,"anole");
        FilterArrayWithSum.addCheck( zoo,"orca");

		List<StringBuffer> animals = new ArrayList<StringBuffer>();
		
		System.out.println("-------------");
		
		long num= zoo.stream().filter(e -> e.endsWith("a") )
		    .count ()
//		    (e -> {
//			animals.add(new StringBuffer(e));
//		}
	;
		
		System.out.println( num );
		
//		for ( StringBuffer s: animals) {
//			System.err.println(s);
//		}
		
	}
	
	static void sout ( String s ) { System.out.println(s); }
    
}