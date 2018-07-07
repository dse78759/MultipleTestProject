package collectionTests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectTest2 {
 
	public static void main(String[] args) {

		List<String> stuff = Arrays.asList ("a","b","tree","twine","gorilla");
		
		Set<String> zoo = new HashSet<String>();
		
		zoo.add("hyena");
		zoo.add("lion");
		zoo.add("orca");
		zoo.add("rhino");
		zoo.add("elephant");
		zoo.add("kangaroo");
		
		zoo.addAll(stuff);

		zoo.stream().map(s -> s.length()).forEach(t -> System.out.println(t));		

		// my first attempt at defining R, A, S ( consumer, accumulator, something)
		//zoo.stream().collect(StringBuilder::new, ( a, b ) -> 1, (a, b) -> a).toString();
		
	//	List<Integer> lengths = zoo.stream().map(s -> s.length()).collect(collector)
		IntSummaryStatistics s= zoo.stream().sorted().collect(Collectors.summarizingInt((a)->1));
		
		System.out.println( s.toString() );
		
		
	}
	
}