package hackerRank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Socks {

    public static void main(String[] args) {
    	
    	Set <Integer> colorFound = new HashSet<Integer>();
    	int matches=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            
            //System.out.println(" " + c[c_i]);
            if ( colorFound.contains( c[c_i]) ) {
            	// already found one of these , we have a match!
            	matches++;
            	colorFound.remove(c[c_i]);
            }
            else {
            	colorFound.add(c[c_i]);
            }
        }
        
        System.out.println(matches+"");
    }
}
