package collectionTests;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class HeapTest {

	public static void sout ( String s) { System.out.println(s); }
	
	public static void main(String[] args) {
	
		int numbers[] = {7, 5, 6, 3, 4, 1, 2, 9, 11};
		
		final long numTests=500000;
		
		HeapTest mult = new HeapTest();
		
		// test 1
		Date dt1=new Date();// should get current time

		sout("output 1: ");
		mult.printArray(numbers	);

//		mult.startOnLeft(numbers);
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for ( int i : numbers) {
			queue.add(i);
		
		}
		
		sout ("asdfas" + queue.toString());
		
		
//		mult.printArray(queue.toArray);
		
		
//		for ( int i=0;i<numTests; i++) {
//			
//			mult.startOnRight(numbers);
//			
//		}
		Date dt2=new Date();
		sout ( "speed of startOnRight: " + (dt2.getTime() - dt1.getTime()) );
		
		// test 2
		
		dt1=new Date();
//		for ( int i=0;i<numTests; i++) {
//			mult.startOnLeft(numbers);
//			
//		}
		 dt2=new Date();
		sout ( "speed of startOnLeft: " + (dt2.getTime() - dt1.getTime()) );
		
	
	}
	
	public void startOnRight ( int [] input ) {

		Stack<Integer> biggestFromRight = new Stack<Integer>();

		int i = 0;
		while (i < input.length) {
			// working our way from the right
			int currInt = input[ (input.length - 1)-i];

			// if currInt is bigger than things on the stack, pop those and put
			// it on.
			if (biggestFromRight.isEmpty()) {
				biggestFromRight.push(currInt);
			} else {
				while (!biggestFromRight.isEmpty()
						&& currInt > biggestFromRight.peek()) {
					biggestFromRight.pop();
				}
				// if currInt is smaller than anything on the stack, replace
				// it in
				// the array
				if (!biggestFromRight.isEmpty()
						&& currInt < biggestFromRight.peek()) {
					input[(input.length - 1) - i] = biggestFromRight.peek();
					biggestFromRight.push(currInt);
				}

				else {

					// now all smaller ints are off stack.
					// we're in the 'bigger' part of the loop, so put it on
					biggestFromRight.push(currInt);
				}
			}
			//sout ( "stack="+ biggestFromRight.toString());
			i++;
		}

//		return output.toString();
	}
	
	public void startOnLeft ( int [] input ) {

		Stack<Integer> trailingFromLeft = new Stack<Integer>();

		int i = 0;
		while (i < input.length) {
			// working our way from the right
			int currInt = input[ i];

			// if currInt is bigger than things on the stack, pop those and put
			// it on.
			if (trailingFromLeft.isEmpty()) {
				trailingFromLeft.push(i); // the index, not the value!
			} else {
				while (!trailingFromLeft.isEmpty()
						&& currInt > input[ trailingFromLeft.peek() ] ) {
					
					int indexSmallerNumber=trailingFromLeft.pop();
					input[ indexSmallerNumber]=currInt;
				}
				
				trailingFromLeft.push(i);
				
				
			}
		//	sout ( "stack="+ trailingFromLeft.toString());
			i++;
		}

//		return output.toString();
	}
	public void printArray( int [] nums ) {
		StringBuffer sb = new StringBuffer();
		
		for ( int i : nums) {
			sb.append(i+ ", ");
			
		}
		
		sout ( sb.toString());
	}

}
