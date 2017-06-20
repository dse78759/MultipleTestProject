package hackerRank.dynamicProgramming;

import java.util.*;
import java.math.*;

public class Fibonacci {

    public static void main(String[] args) {
//    	System.out.println( ""+ BigIntege);
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger nthTerm = in.nextBigInteger();
        
        
//        a.multiply(b);
//        System.out.println(a+"  "+b );
//        System.out.println(a+" "+b        );
//        System.out.println(nthTerm+" "        );
        
        int termNum=3;
        if ( nthTerm.intValue() ==1 ) System.out.println(a);
        if ( nthTerm.intValue() ==2 ) System.out.println(b);
        
        BigInteger currTerm=b.multiply(b).add(a);
        while ( termNum<nthTerm.intValue()) {
        	termNum++;
        	a=b;
        	b=currTerm;
             currTerm=b.multiply(b).add(a);
        	
        }
        System.out.println(currTerm);
    }
}
