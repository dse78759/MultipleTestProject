package hackerRank.profitContest;

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
 * TODO: read from STDIN
 * how to set that up in run config?
 * 
 * 1. read a file that has a list of profits from past sales
 * 2. figure out which day would have the biggest two sale profit
 * 3. print out?
 * 
 * @author scott
 * 
 */
public class ProfitFinder {

	public static void sout(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) throws FileNotFoundException {
	//	fileReadTest();
		stdinReadTest();
	}
	
	public static void stdinReadTest2 () throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int i = 0;

		sout("starting");
		
		sout(in.toString());
		//sout("hasnext: " + in.hasNext());
		while (in.hasNext()) {
			if (in.hasNextInt())
				sout(in.nextInt() + "");
			else {
				sout("what the hell is this crap: " + in.next());
			}
			// sout ( in.next());
		}
	}
	
	public static void stdinReadTest () throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int i = 0;

		sout("starting");
		
//		sout ( in.toString());
//		sout ( "hasnext: "+in.hasNext());
		// num lines expected
		int numLines = in.nextInt();
		sout( "num lines:" + numLines);
		
		int max=0;
		
		int highest=0;
		int second =0;
		
		while ( in.hasNext() ) {
		
			for ( int j=0; j<3; j++ ) {
				i=in.nextInt();
				System.out.print(" " +i);
				if ( i>highest) { second=highest; highest=i; continue; }
				if ( i>second && i<=highest ) { second=i; }
			}
			
			System.out.printf("\n %d %d\n", highest ,  second );
			int thisLinesMax=highest+second;
			sout ( "\nthis line max: "+thisLinesMax);
			
			if  ( thisLinesMax>max ) { max=thisLinesMax; }
			highest=0;
			second=0;
			
		}
		sout (""+ max);
		
		
		sout("done");
		
	}
	
	public static void fileReadTest () throws FileNotFoundException {
		Scanner in = new Scanner(new File("./src/hackerRank/profitContest/profits.txt")).useDelimiter(" ");

		int i = 0;

		sout("starting");
		
		// num lines expected
		int numLines = in.nextInt();
		sout( "num lines:" + numLines);
		
		int max=0;
		
		int highest=0;
		int second =0;
		
		while ( in.hasNext() ) {
		
			for ( int j=0; j<3; j++ ) {
				i=in.nextInt();
				sout("reading" +i);
				if ( i>highest) { second=highest; highest=i; }
				if ( i>second ) { second=i; }
			}
			
			int thisLinesMax=highest+second;
			sout ( "this line max: "+thisLinesMax);
			
			if  ( thisLinesMax>max ) { max=thisLinesMax; }
			highest=0;
			second=0;
			
		}
		sout (""+ max);
		
		
		sout("done");
		
	}


	public void printArray(int[] nums) {
		StringBuffer sb = new StringBuffer();

		for (int i : nums) {
			sb.append(i + ", ");
		}

		sout(sb.toString());
	}

}
