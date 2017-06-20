package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 1. the program should read from a pipe that has a number of lines, then mixed
 * parenthesis: 2 ()[]{} ([){}
 * 
 * 2. the program should respond with a YES or NO for each line, whether there
 * are any non-closing brackets.
 * 
 * @author scott
 * 
 */
public class RGMTestParenthesis {

	public static void sout(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File ("./src/code/brackets-test-file.txt"));
		
		int testNum = in.nextInt();

		String[] testCases = new String[testNum];

		int i = 0;

		while (in.hasNext()) {
			testCases[i] = in.next();
			System.out.println("- "+testCases[i]);
			i++;
		}

		String[] answer = processParentheses( testCases);
		
		for (int j=0; j<answer.length; j++) {

				System.out.printf("%20s%20s\n", testCases[j], answer[j]);
		}

		
		// RGMTestParenthesis mult = new RGMTestParenthesis();
		//
		// // test 1
		Date dt1 = new Date();// should get current time
		//
		// sout("output 1: ");
		// mult.printArray(numbers );
		//
		// // mult.startOnLeft(numbers);
		//
		// PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		//
		// for ( int i : numbers) {
		// queue.add(i);
		//
		// }

//		sout("asdfas");

		/*Date dt2 = new Date();
		sout("speed of startOnRight: " + (dt2.getTime() - dt1.getTime()));

		// test 2

		dt1 = new Date();
		// for ( int i=0;i<numTests; i++) {
		// mult.startOnLeft(numbers);
		//
		// }
		dt2 = new Date();
		sout("speed of startOnLeft: " + (dt2.getTime() - dt1.getTime()));
*/
	}

	private static  String[]  processParentheses(String[] testCases) {
		
		String[] results = new String [testCases.length];
		
//		Stack<String> brackets=new Stack<String>();
		
		int curr=0;
		for ( String current : testCases) {
			String proper="yes";
			Stack<String> brackets=new Stack<String>();
				
			// iterate through each letter : put {([ on stack, pop and compare if ]})
			for ( int k=0;k<current.length();k++) {
				String currLetter= current.substring(k, k+1);

				if ( currLetter.equals("{") || currLetter.equals("[") || currLetter.equals("(")  ) {
					brackets.push(currLetter);
				} else {
					if ( currLetter.equals("}") || currLetter.equals("]") || currLetter.equals(")")  )
						
					{
						if (  brackets.isEmpty()) {
							proper="no";
							break;
						}
						String popped=brackets.pop();
						if ( currLetter.equals("}") && !popped.equals("{") ) {
							proper="no";
							break;
						}
						if ( currLetter.equals("]") && !popped.equals("[") ) {
							proper="no";
							break;
						}
						if ( currLetter.equals(")") && !popped.equals("(") ) {
							proper="no";
							break;
						}
					}
				}
			}
			// if we've iterated the line and there's still something on the stack, ERR
			if ( !brackets.isEmpty()){
				proper="no";
				
			}
			
			results[curr]=proper;
			curr++;
			
		}
		
		
		return results;
		
	}

	public void printArray(int[] nums) {
		StringBuffer sb = new StringBuffer();

		for (int i : nums) {
			sb.append(i + ", ");

		}

		sout(sb.toString());
	}

}
