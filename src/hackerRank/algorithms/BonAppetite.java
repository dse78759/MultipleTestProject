package hackerRank.algorithms;

import java.util.*;

public class BonAppetite {

	public static void main(String[] args) {

		// System.out.println (""+ Long.MAX_VALUE );

		long sum = 0;
		Scanner in = new Scanner(System.in);

		int nItems = in.nextInt();
		long c[] = new long[nItems];

		int itemRejected = in.nextInt();

		for (int c_i = 0; c_i < nItems; c_i++) {
			c[c_i] = in.nextLong();

//			System.out.printf("%d " , c[c_i]);

			if (c_i == itemRejected) {
				;
//				System.out.println("rejected");
			} else {
				sum += c[c_i];
			}
		}

//		System.out.printf("sum = %d\n",sum );
		
		int amtCharged=in.nextInt();
		
//		System.out.printf("charged = %d\n",amtCharged );
//		System.out.printf("%d\n", sum);
		
		sum=sum/2;
		
		if (amtCharged == sum) {
			System.out.printf("Bon Appetit");

		} else {
			System.out.printf("%d\n", amtCharged-sum);
		}
	}
}
