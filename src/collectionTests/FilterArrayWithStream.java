package collectionTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


 
public class FilterArrayWithStream {
 
	public static void addCheck ( Set<String> w , String a) {
		boolean newItem = w.add(a);
//		if ( !newItem) {
//			System.err.println("dupe added");
//		} else {
//			System.err.println("added");
//		}
	}
	
	public static void main(String[] args) {

		Set<String> zoo = new HashSet<String>();
		
		FilterArrayWithStream.addCheck( zoo,"elephant");
		FilterArrayWithStream.addCheck( zoo,"rhino");
		FilterArrayWithStream.addCheck( zoo,"hyena");
		FilterArrayWithStream.addCheck( zoo,"lion");
		FilterArrayWithStream.addCheck( zoo,"rhino");
        FilterArrayWithStream.addCheck( zoo,"kangaroo");
        FilterArrayWithStream.addCheck( zoo,"spider");
        FilterArrayWithStream.addCheck( zoo,"lion");
        FilterArrayWithStream.addCheck( zoo,"hippo");
        FilterArrayWithStream.addCheck( zoo,"anole");
        FilterArrayWithStream.addCheck( zoo,"orca");

		List<StringBuffer> animals = new ArrayList<StringBuffer>();
		
		zoo.stream().filter(e -> e.endsWith("a") )
		    .forEach(e -> {
			animals.add(new StringBuffer(e));
		});
		
		for ( StringBuffer s: animals) {
			System.err.println(s);
		}
		
	}
	
	static void sout ( String s ) { System.out.println(s); }
    
}