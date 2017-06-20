package test1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import code.RandomGenerator;
import code.timeLibrary;

public class odd_even_test {

	@Test
	public void testRandomThingy() {
		RandomGenerator rg = new RandomGenerator();
		List<Integer> hereWeGo = rg.makeArray();

		assertNotNull ( hereWeGo);
		assertTrue (hereWeGo.size()>0);

		int i=1;
		for ( Integer curr : hereWeGo ) {
			System.out.format("#%d = %d\n", i++, curr);
		}
			 
	}
	
	@Test
	public void test() {
	//	System.out.println("asdfasdf");
		
		//");
		
//		for ( String p : parts) {
//			System.out.println(p);
//		
//			Integer i=new Integer(p);
//			System.out.println(i+"");
//		
//		}
		
		//fail("Not yet implemented");
	}
	
	public void sout ( String s ) { System.out.println(s); }
	
	@Test
	public void divModTest() {
		int in=133;
		
		sout ( "div: " + in/60);
		sout ( "mod: " + in%60);
	
	
	}
	
	@Test
	public void ampmtest () {
		
		timeLibrary tl = new timeLibrary();
		
		sout ( "am plus 5 = " +tl.whatAMPM("AM", 5));
		
		sout ( "pm plus 5 = " +tl.whatAMPM("PM", 5));
		
		sout ( "am plus 2 = " +tl.whatAMPM("AM", 2));
		sout ( "pm plus 50 = " +tl.whatAMPM("PM", 50));
		

	
	}
	
	@Test
	public void bigtest () {
		
		timeLibrary tl = new timeLibrary();
		
		String inTime = "1:13 am";
		int inMinutes = 30;
		
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));
		
		inTime="1:00 pm";  inMinutes=70;
		
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));
		
		inTime="1:00 pm";  inMinutes=-10;
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));
		
		inTime="1:00 pm";  inMinutes=-70;
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));
		
		inTime="11:59 pm";  inMinutes=1;
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));
		
		inTime="1:00 pm";  inMinutes=700;
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));

			
		inTime="1:43:23 pm"; inMinutes=44;
		sout ( inTime + " plus " + inMinutes + " = " + tl.addTime(inTime, inMinutes));
	}
	

}
