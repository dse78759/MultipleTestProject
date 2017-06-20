package hackerRank;

public class power  {

    public static int power(int base , int power) throws Exception {
       if ( base <0 || power<0 ) {
           throw new Exception ("n and p should be non-negative"
                               );
       }
     
        int total=1;
        
        for ( int i =0; i<power; i++
            ) {
            total=total*base;
        }
            System.out.println(total
                              );
        return total;
    }
}