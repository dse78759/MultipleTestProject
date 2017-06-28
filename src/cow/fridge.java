package cow;

/**
 *  Class with synchronized methods to allow cows to drop off
 *  	milk and babies to pick it up.
 *  
 * @author scott
 *
 */
class Fridge {
	// sync 

	//	vec_test data;
	
	int amount_milk ;
	
	Fridge () {
		//data = new vec_test ();
		amount_milk = 2;
		System.out.println("Fridge started with : " + amount_milk + " milks. ");
	}
	
	Fridge ( int startAmt ) {
		amount_milk=startAmt;
		System.out.println("Fridge started with : " + amount_milk + " milks. ");
	}

	synchronized void eat ( long wanted ) {

		System.out.println ( Thread.currentThread().getName () + " requesting milk :" + wanted  );	

		try {

		while ( wanted > amount_milk ) {
			System.out.println ( "Not enough milk for " 
				+ Thread.currentThread().getName () + " . Waiting . ");	
			wait () ; 
		}

		} catch ( Exception e ) { } 

		amount_milk-= wanted ;
		
		System.out.print ( Thread.currentThread().getName () + " got milk. " );	
		System.out.println ( " Amount left : " + amount_milk );	

	}
	
	synchronized void store ( long amount ) {

		System.out.println ( " fridge: storing "+amount+" milk from " 
				+ Thread.currentThread().getName () );	
		amount_milk+= amount ;
		//System.out.print ( Thread.currentThread().getName () + " stored milk " );	
		System.out.println ( "total amount : " + amount_milk );	
		
	}
	
	synchronized void print ( ) {

		System.out.print ( " fridge: printing data  (" );	
		System.out.println ( Thread.currentThread().getName () + ")" );	
		//data.print ();
		System.out.println ( " milk : " + amount_milk );	
		System.out.println ( " ---- done printing ---- " );	
	}
	


};
