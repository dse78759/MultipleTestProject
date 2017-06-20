package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sumArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        printSum ( arr );
    }
    
    static void printSum ( int [] numsToAdd ) {
    	int sum=0;
    	for ( int curr: numsToAdd ) {
    		sum+=curr;
    	}
    	System.out.println(sum);
    }
}
