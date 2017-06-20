package test1;

import static org.junit.Assert.*;

import org.junit.Test;

import code.timeLibrary;

public class unit1 {

	@Test
	public void test() {
	//	System.out.println("asdfasdf");
		
		String initial = "08:09 pm";
		
		String parts[] = initial.split(":");
		
		for ( String p : parts) {
			System.out.println(p);
		
			Integer i=new Integer(p);
			System.out.println(i+"");
		
		}
		
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
