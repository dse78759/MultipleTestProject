package code;

import java.util.*;

public class VarArgsTest {

	public static void main(String[] args) {
		VarArgsTest bt=new VarArgsTest();

		bt.primeChecker(4,13);
		bt.primeChecker(4,5);
		bt.primeChecker(4,5,6,7);
		bt.primeChecker(4,12,5,37);
		
	}
	
	public void primeChecker (int ... stuff) {

		System.out.println("called with num params : " + stuff.length );
		
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
		int curr=1;
		int max=num/2;
		
		int remainder=1;
		do {
			curr++;
			remainder=num%curr;
		} while ( remainder>0 && curr<=max);
	
		if (remainder >0) {

			return true;
		} 
		else
			return false;
	}
}


