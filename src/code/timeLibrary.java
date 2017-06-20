package code;

public class timeLibrary {

	public String addTime ( String time, int inMinutes ) {
	
		String newTime="";
	
		int inHours = inMinutes /60;
		int inMins = inMinutes %60;
		
		String hoursAndRemainder[] = time.split(":");
		
		if ( hoursAndRemainder.length!=2 ) { 
			// something is wrong with incoming time format
			return "error";
		}

		// first item is hours
		int startHours=Integer.valueOf(hoursAndRemainder[0]);
		
		// now get minutes and am/pm
		String minutesAndAMPM[] = hoursAndRemainder[1].split(" ");
		if ( minutesAndAMPM.length!=2) {
			// something is wrong with incoming time format
			return "error";
		}
		
		int startMinutes=Integer.valueOf(minutesAndAMPM[0]);
		
		String ampm=minutesAndAMPM[1];
		
		int rawMinutes=startMinutes+inMins;
		int carryOverHour=rawMinutes/60;
		if ( rawMinutes<0) {
			carryOverHour-=1;
		}
		
		int finalMinutes=rawMinutes%60;
		if ( finalMinutes < 0 ) {
			finalMinutes+=60;
		}
		
		int rawHour=startHours+inHours+carryOverHour;
		
		int carryOverAMPM=rawHour/13;
		if ( carryOverAMPM<0 ) {
			carryOverAMPM-=1;
		}
		
		
		int finalHour=rawHour%13;
		if ( finalHour<1) { // there is no zero hour
			finalHour+=12;
		}
		
		String finalAMPM=whatAMPM(ampm, carryOverAMPM);
		
		newTime=finalHour+":"+finalMinutes+" "+finalAMPM;
		
		return newTime;
	}
	
	public String whatAMPM ( String currentAMPM, int hourCarryOver ) {
	
		boolean even=false;
		if ( hourCarryOver%2==0) even=true;
		
		if ( "am".equalsIgnoreCase(currentAMPM) && !even) return "PM";
		
		if ("pm".equalsIgnoreCase(currentAMPM) && !even) return "AM";
		
		//otherwise the hourCarryOver is even and am/pm doesn't change
		return currentAMPM;
	}

}