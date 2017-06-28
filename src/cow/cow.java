package cow;

class cow extends Thread {
	
	boolean locked = false; 

	fridge	token ;

	cow () {
		// shouldn't really be called
		token = new fridge ();
	}

	cow ( String name , fridge fridge1) {

		this ();
		setName (name ) ;
		token = fridge1;
	}
	
	public void run () {
	
		System.out.println ("thread: " + getName() + " getting to work.");

		// random # of loop

		long loopnum  = randnum ();

		for ( int i =0 ; i < loopnum; i++ ) {
			
			try {
			Thread.sleep ( 10* randnum () );
			}
			catch ( Exception e ) {}

			token.store(randnum());

		}
		
		System.out.println ("thread: " + getName() + " finished fridge.one()  ");

		System.out.println (getName () + ": about to print  ");
		token.print ();
	}

        long randnum () {

                double z=Math.random () *100;
                long zz = Math.round ( z );

                zz = zz % 5 + 1;

                //System.out.println ( "made rand # : " + zz );

                return ( zz) ;
        }

}; 
