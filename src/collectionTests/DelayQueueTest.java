package collectionTests;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.PriorityQueue;

// NOTE : not complated
public class DelayQueueTest {

	 public class Node implements Delayed {
	    	public int value;
	    	
			public Node(int v) {
				value = v;
			}

			@Override
			public int compareTo(Delayed o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long getDelay(TimeUnit unit) {
				// TODO Auto-generated method stub
				return 0;
			}
	    
			
	    }
	
	public static void sout ( String s) { System.out.println(s); }
	
	public static void main(String[] args) {
	}
	
	public void runIt () {
		int numbers[] = {7, 5, 6, 3, 4, 1, 2, 9, 11};
		
		DelayQueue< Node> dq = new DelayQueue<>();
		
		final long numTests=500000;
		
		Node n1 = new Node (5);
		
		dq.put(n1);
		
		
		DelayQueueTest mult = new DelayQueueTest();
		
		Date dt1=new Date();// should get current time

		sout("output 1: ");
		mult.printArray(numbers	);

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for ( int i : numbers) {
			queue.add(i);
		
		}
		
		sout ("asdfas" + queue.toString());
		
//		mult.printArray(queue.toArray);
		
		Date dt2=new Date();
		sout ( "speed of startOnRight: " + (dt2.getTime() - dt1.getTime()) );
		
		// test 2
		
		dt1=new Date();
//		for ( int i=0;i<numTests; i++) {
//			mult.startOnLeft(numbers);
//			
//		}
		 dt2=new Date();
		sout ( "speed of startOnLeft: " + (dt2.getTime() - dt1.getTime()) );
		
	
	}
	
		
		public void printArray( int [] nums ) {
		StringBuffer sb = new StringBuffer();
		
		for ( int i : nums) {
			sb.append(i+ ", ");
			
		}
		
		sout ( sb.toString());
	}

}
