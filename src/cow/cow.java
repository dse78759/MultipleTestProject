package cow;

class cow extends Thread {
	
	boolean locked = false; 

	Fridge	token ;

	private cow () {
		// shouldn't really be called
		token = new Fridge ();
	}

	cow ( String name , Fridge fridge1) {

		//this ();
		setName (name ) ;
		token = fridge1;
	}
	
	public void run () {
	
		System.out.println ("Cow " + getName() + " getting to work.");

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

	/**
	 * Return a number from 1-5;
	 * 
	 * @return
	 */
	long randnum() {

		double z = Math.random() * 100;
		long zz = Math.round(z);

		zz = zz % 5 + 1;

		// System.out.println ( "made rand # : " + zz );

		return (zz);
	  }

}; 
