package hackerRank.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FirstSort {

    public static void main(String[] args) {
    	
    	Set <Integer> colorFound = new HashSet<Integer>();
    	int matches=0;
        Scanner in = new Scanner(System.in);
        int findNum = in.nextInt();
        int sizeArray = in.nextInt();
        
        int c[] = new int[sizeArray];
        
        for(int c_i=0; c_i < sizeArray; c_i++){
            c[c_i] = in.nextInt();
            
//            System.out.println(" " + c[c_i]);
           
            if ( findNum== c[c_i] ) {
            	
            	System.out.println(c_i);
            	// already found one of these , we have a match!
//            	matches++;
//            	colorFound.remove(c[c_i]);
//            }
//            else {
//            	colorFound.add(c[c_i]);
            }
        }
        
//        System.out.println(matches+"");
    }
}
