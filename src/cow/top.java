package cow;

import java.util.*;

class top {

	static public void main ( String r [] ) {

		fridge frig1 = new fridge ();
		
		try {

			cow producer1 = new cow ("lulu", frig1); 
	
			baby consumer1 = new baby ("stewie", frig1 ); 
			baby consumer2 = new baby ("maggie", frig1 ); 
	
			producer1.start ();
	
			Thread.sleep (10);
	
			consumer1.start ();
			consumer2.start ();
	
			System.out.println ( " consumers started " );

			// print contents of mon

			// join on each	prod/cons
	
		}
		catch ( Exception e ) {}

		//System.out.println ( " val: " + worker.getVal () );

	}
};
