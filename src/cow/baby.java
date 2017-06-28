package cow;

class baby extends Thread {
	
	boolean locked = false; 

	fridge	token ;

	baby () {
		// shouldn't really be called
		token = new fridge ();
	}

	baby ( String name , fridge fridge1) {

		this ();
		setName (name ) ;
		token = fridge1;
	}
	
	public void run () {
	
		System.out.println ("baby : " + getName() + " :getting to work.");

		for ( int i =0 ; i < 2; i++ ) {

		// ask for some random amount

		token.eat ( randnum ()  );

		// sleep some random time

		try {
		Thread.sleep(randnum() *45 );
			} catch ( Exception e ) {}

		}

		System.out.println (getName () + ": about to print  ");
		token.print ();
	}

        long randnum () {

                double z=Math.random () *100;
                long zz = Math.round ( z );

                zz = zz % 5 + 1;

                //System.out.println ( "   made rand # : " + zz );

                return ( zz) ;
        }


}; 
