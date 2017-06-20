package code;

//import java.awt.font.NumericShaper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

	/**
	 * Take a list of numbers, build a map of numbers to their counts.
	 * 
	 * @param nums
	 */
	public Map<Integer, Integer> countUp ( List<Integer> nums) {
		Map< Integer, Integer> numbersToCounts=new HashMap<Integer,Integer>();
		
		for ( Integer curr : nums ) {
			int count;
			if ( numbersToCounts.containsKey(curr)) {
				count=numbersToCounts.get(curr)+1;
			}
			else count=1;
			
			numbersToCounts.put(curr, count);
			
		}
		
		return numbersToCounts;
		
	}
	
	
}
