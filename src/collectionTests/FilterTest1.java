package collectionTests;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterTest1 {
	
	
	    public static void main(String[] args) {

	        List<String> items =
	                Arrays.asList("apple", "apple", "banana",
	                        "apple", "orange", "banana", "papaya"
	                        , "grape","apple", "Apple");

//	      }
	        
	        
	        // what the heck is a predicate? a function returning a boolean that takes one argument
	        items.stream().filter(fruit->fruit.endsWith("e")).forEach(System.out::println);
	        //                    ^^^^^^^^^^^^^^^^^^^^^^^^^ predicate
	        log("-----contains filter-----");
	        items.stream().filter(fruit->fruit.contains("z")).forEach(System.out::println);
	        
	    }
	    
	    public static void log ( String s ) { System.out.println(s); }
	
}
