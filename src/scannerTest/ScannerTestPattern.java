package scannerTest;

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
import java.util.regex.Pattern;

/**
 * 1. do tests on ScannerObject.hasNext(Pattern) 
 * 
 * @author scott
 * 
 */
public class ScannerTestPattern {

	public static void sout(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) throws FileNotFoundException {
		fileReadTest();
	}
	
	public static void fileReadTest () throws FileNotFoundException {
		Scanner in = new Scanner(new File("./src/scannerTest/type-name-values.txt")).useDelimiter(" ");

		int i = 0;

		sout("starting");

		while ( in.hasNext() ) {
			System.out.println("-- " + in.next());
			i++;
		}
		
//		while ( in.hasNextLine() ) {
//		
//			String s = in.nextLine();
//			
//			sout("== " + s);
////			String s=in.findInLine("\\s.* \\s.* \\s.*");
//			
//			String s1 = 
//		}
		
		
		sout("done");
		
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

	private static  void  testUseDelimiter () {
		
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
		
	}

private static  void  testUseDelimiter2 () {
		
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter(" ");
	     System.out.println(s.next());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     
	     // can we cahnge delimiter in the middle?
	     s.useDelimiter("f");
	     sout ( s.next());
	     sout ( s.next());
	     sout ( s.next());
	     
	     s.close();
		
	}

	public void printArray(int[] nums) {
		StringBuffer sb = new StringBuffer();

		for (int i : nums) {
			sb.append(i + ", ");
		}

		sout(sb.toString());
	}

}
