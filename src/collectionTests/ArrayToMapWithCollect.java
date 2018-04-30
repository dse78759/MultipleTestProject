package collectionTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.Function;
import java.util.stream.Collectors;


 
public class ArrayToMapWithCollect {
 
	public static void addCheck ( List<String> w , String a) {
		boolean newItem = w.add(a);
		if ( !newItem) {
			System.err.println("dupe added");
		} else {
			//System.err.println("added");
		}
	}
	
	public static void main(String[] args) {

		List<String> zoo = new Vector<String>();
		
		ArrayToMapWithCollect.addCheck( zoo,"elephant");
		ArrayToMapWithCollect.addCheck( zoo,"rhino");
		ArrayToMapWithCollect.addCheck( zoo,"hyena");
		ArrayToMapWithCollect.addCheck( zoo,"lion");
		ArrayToMapWithCollect.addCheck( zoo,"rhino"); // dupe
        ArrayToMapWithCollect.addCheck( zoo,"kangaroo");
        ArrayToMapWithCollect.addCheck( zoo,"spider");
        ArrayToMapWithCollect.addCheck( zoo,"lion"); //dupe
        ArrayToMapWithCollect.addCheck( zoo,"hippo");
        ArrayToMapWithCollect.addCheck( zoo,"hippo");
        ArrayToMapWithCollect.addCheck( zoo,"hippo");
        ArrayToMapWithCollect.addCheck( zoo,"anole");
        ArrayToMapWithCollect.addCheck( zoo,"orca");

		System.out.println("list size:" + zoo.size() );
		
		sout("-------------");
		
		Map<String, Long> counts = zoo.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		sout(" map size: " + counts.size() );
		
		counts.entrySet().stream().forEach( s->System.out.println(s)); 
		
	}
	
	static void sout ( String s ) { System.out.println(s); }
    
}