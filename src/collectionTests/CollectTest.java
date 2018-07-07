package collectionTests;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectTest {
	
	
	    public static void main(String[] args) {

	        List<String> items =
	                Arrays.asList("apple", "apple", "banana",
	                        "apple", "orange", "banana", "papaya"
	                        , "grape","apple", "Apple");

	        Map<String, Long> result =
	                items.stream().collect(
	                        Collectors.groupingBy(
	                                Function.identity(), Collectors.counting()
	                        )
	                );

	        for ( Map.Entry<String, Long> e : result.entrySet() ) {
	        	System.out.println(e);
	        }
	        
	        
	      
	    }
	
}
