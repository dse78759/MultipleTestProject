package hackerRank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroos {

    public static void overflowTest (String[] args) {
    	
    	int o = Integer.MAX_VALUE;
    	sout (""+o);
    	
    	o+=1;
    	
    	sout (""+o);
    	
    	
    }
    
    static public void sout ( String s ) { System.out.println(s); }
    
    public static void main ( String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int xTotal=x1;
        int yTotal=x2;
//    	System.out.printf ( "%d %d \n", xTotal, yTotal );
        
    	if ( v1<0 || v2<0 || x1<0 ||x2 < 0 ) {
    	     System.out.println("NO");
             return;
        }
    	
    	if ( v1==v2 && x1!=x2 ) {
            // these will never converge
            System.out.println("NO");
            return;
        } 
        
    	if ( v1==v2 && x1!=x2 ) {
            // these will never converge
            System.out.println("NO");
            return;
        } 
    	
        while (  xTotal<Integer.MAX_VALUE && yTotal <Integer.MAX_VALUE ) {
        	System.out.printf ( "%d %d \n", xTotal, yTotal );
        	
        	
        	
        	if ( xTotal==yTotal )  { 
        		System.out.println("YES");
        		break;
        	}
        	
        	if ( xTotal > yTotal && v1>v2 ) {
        		// this will not converge
        		System.out.println("NO");
        		break;
        	}
        	
        	if ( xTotal < yTotal && v1<v2 ) {
        		// this will not converge
        		System.out.println("NO");
        		break;
        	}
        	
        	xTotal+=v1;
        	yTotal+=v2;
        	
        }
    	if ( xTotal>Integer.MAX_VALUE || yTotal >Integer.MAX_VALUE) {
    		System.out.println("NO");
    	}
        
    }
}
