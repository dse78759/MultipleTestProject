package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntScanin {

    public static void main(String[] args) {
//    	System.out.println( ""+ BigIntege);
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
       
        a.multiply(b);
        System.out.println(a+" "+b );
        System.out.println(a+" "+b        );
    }
}
