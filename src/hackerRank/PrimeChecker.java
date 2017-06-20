package hackerRank;

import java.io.IOException;
import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.*;
//import java.io.*;

import static java.lang.System.in;
//public static InputStream in=System.in;

public class PrimeChecker {

	public static void main(String[] args) {
		PrimeChecker bt=new PrimeChecker();

		bt.primeChecker(2);
		bt.primeChecker(2,1);
		bt.primeChecker(2,1,4,5);
		bt.primeChecker(4,5,6,7);
		bt.primeChecker(4,12,5,37);
		
	}
	
	public void primeChecker (int ... stuff) {

//		System.out.println("called with num params : " + stuff.length );
		
		StringBuffer tabString=new StringBuffer ("");
		
		for ( int a : stuff) {
//			System.out.println(tabString.toString()+ a);
//			tabString.append("\t");
		
			if ( isPrime(a) ) 
				tabString.append(a + " ");
				
		}
		
		System.out.println(tabString.toString());
	}
	
	/** no divsors can produce a zero remainder. */
	public boolean isPrime ( int num )
	{
		if ( num==1 ) return false;
		if ( num==2 ) return true;
		
		int curr=1;
		int max=num/2;
		
		int remainder=1;
		do {
			curr++;
			remainder=num%curr;
		} while ( remainder>0 && curr<=max);
	
		if (remainder >0) {
//			System.out.println(num + " is prime");

			return true;
		} else
			return false;
	}
}

class in extends InputStream {

//	void main () {
//		InputStream in=System.in;
////		= new FilterInputStream(in); 
//		
//		BufferedReader br= new BufferedReader(new InputStreamReader(in));
//	}

	@Override
	public int read() throws IOException {
		System.in.read();
		return 0;
	}

}

