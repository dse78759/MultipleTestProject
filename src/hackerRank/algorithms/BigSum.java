package hackerRank.algorithms;

import java.util.*;

public class BigSum {

    public static void main(String[] args) {
    	
    	System.out.println (""+ Long.MAX_VALUE );
    	
    	long sum=0;
        Scanner in = new Scanner(System.in);
        
        int nBigs = in.nextInt();
        long c[] = new long[nBigs];
        
        for(int c_i=0; c_i < nBigs; c_i++){
            c[c_i] = in.nextLong();
            
            System.out.println(" " + c[c_i]);
            
            sum+=c[c_i];
        }
        
        System.out.println(sum+"");
    }
}
