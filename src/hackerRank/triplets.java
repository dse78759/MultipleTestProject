package hackerRank;

import java.util.*;

public class triplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        compare ( a0,a1, a2, b0, b1, b2);
    }
    
    public static void compare ( int a0, int a1, int a2, 
                                 int b0, int b1, int b2 ) {
        int aScore=0;
        int bScore=0;
        int compareScore=0;
        compareScore += ( a0<b0 )?-1:1;
        compareScore += ( a1<b1)?-1:1;
        compareScore += ( a2<b2 )?-1:1;
                                      
        aScore=compareScore;
        bScore=compareScore*-1;
        System.out.println(aScore+" "+bScore
                          );
    }
}
