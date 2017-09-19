package collectionTests;

import java.util.HashSet;
import java.util.Set;

public class MapWithStream {
 
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
		
		MapWithStream.addCheck( zoo,"elephant");
		MapWithStream.addCheck( zoo,"rhino");
		MapWithStream.addCheck( zoo,"hyena");
		MapWithStream.addCheck( zoo,"lion");
		MapWithStream.addCheck( zoo,"rhino");
        MapWithStream.addCheck( zoo,"kangaroo");
        MapWithStream.addCheck( zoo,"spider");
        MapWithStream.addCheck( zoo,"lion");
        MapWithStream.addCheck( zoo,"hippo");
        MapWithStream.addCheck( zoo,"anole");
        MapWithStream.addCheck( zoo,"orca");

		zoo.stream()
		    .map(s -> s.substring(0, 2)).forEach(t->sout(t));
		
	}
	
	static void sout ( String s ) { System.out.println(s); }
    
}