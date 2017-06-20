package hackerRank.algorithms;

import java.util.*;

public class CamelCase {

	public static void main(String[] args) {

		 System.out.println ("sdfadf" );

		int index = 0;
		Scanner in = new Scanner(System.in);

		String s = in.next();
		 System.out.println (""+ s );

		int length=s.length();
		int words =1;
		while ( index < length ) {
			
		
			char curr = s.charAt(index);
			if ( curr <='z' && curr >= 'a' ) {
//				System.out.println("lc");
			}
			if ( curr <='Z' && curr >= 'A' ) {
//				System.out.println("upper c");
				words++;
			}
		
			index++;
		
		}

		System.out.printf("words sum = %d\n",words);
		
	}
}
