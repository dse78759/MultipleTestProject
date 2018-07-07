package collectionTests;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class PrimeNumbersStream {
 
	public static void main(String[] args) {

		List<Integer> primes = new Vector<Integer>();
		
		primes.add(2);
		primes.add(3);
		primes.add(5);
		
		Integer testAgainst=4;
		
		Optional<Integer> nextPrime = primes.stream().filter(s-> s>testAgainst).findFirst();

		sout (" next prime : " + nextPrime.get() );
		
	}
	
	static void sout ( String s ) { System.out.println(s); }
    
}