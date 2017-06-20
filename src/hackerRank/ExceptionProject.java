package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionProject {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String a0 = in.next();
        String a1 = in.next();
     
        int num0=0, num1=0;
        try {
            num0=Integer.valueOf( a0 ).intValue();     
             num1=Integer.valueOf( a1 ).intValue();     
        } catch ( Exception e ) {
            //System.out.println(e.toString() );
            InputMismatchException e1 = new InputMismatchException();
            System.out.println(e1.toString() );
            return;
        }
        
        if ( num1==0) {
            ArithmeticException e2=new ArithmeticException("/ by zero");
            System.out.println(e2.toString() );
            return;
        }
        
        System.out.println(num0/num1 );
            
    }
}
