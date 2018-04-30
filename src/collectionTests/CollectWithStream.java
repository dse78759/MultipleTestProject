package collectionTests;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectWithStream {
 
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
		
		CollectWithStream.addCheck( zoo,"elephant");
		CollectWithStream.addCheck( zoo,"rhino");
		
		CollectWithStream.addCheck( zoo,"hyena");
		CollectWithStream.addCheck( zoo,"lion");
		CollectWithStream.addCheck( zoo,"rhino");
		
        CollectWithStream.addCheck( zoo,"kangaroo");
        CollectWithStream.addCheck( zoo,"spider");
        CollectWithStream.addCheck( zoo,"lion");
        
        CollectWithStream.addCheck( zoo,"hippo");
        CollectWithStream.addCheck( zoo,"anole");
        CollectWithStream.addCheck( zoo,"orca");

        // predefined Collector to sum
        Collector<String, ? , Integer> cc= Collectors.summingInt(d->1);
        
		Integer result = zoo.stream()
		    .collect(cc);
		    //.map(s -> s.substring(0, 2)).forEach(t->sout(t));
		
		sout ("sum unique memebers: "+result);
		
		
	}
	
	static void sout ( String s ) { System.out.println(s); }
    
}