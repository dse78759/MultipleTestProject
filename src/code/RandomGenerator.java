package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

	public List<Integer> makeArray () {
		
		List<Integer> sendBack = new ArrayList();
		// first how many elements?
		Random r = new Random();
		int count=r.nextInt()%100;
		
		count=(count<0?count*-1:count);
		
		System.out.format("number of nums: %d\n ", count);
		
		for ( int i=0; i<count; i++) {
			int num = r.nextInt()%20;
			
			if ( num<0 ) { sendBack.add(num*-1); }
			else {
				sendBack.add(num);
			}
		}
		
		return sendBack;
	}
}
