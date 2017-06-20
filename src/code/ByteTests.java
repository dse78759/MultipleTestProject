package code;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ByteTests {

	public static void main(String[] args) {
		ByteTests bt=new ByteTests();
		
		bt.collectionSortArray();
	}
	
	public void collectionSortArray () {
		Character[] p = {'a','l','e'};
		
		List<Character> ll = 		new ArrayList<Character> ();
		
		Collections.addAll(ll, p);
		
		Collections.sort(ll);
		System.out.println(ll);
		
	}
	public void repeatedLetters ( String input ) {
	    
	    HashSet<Byte> whatWeSaw = new HashSet<Byte>();
	    HashSet<Byte> whatWeSaved = new HashSet<Byte>();
	    
	    Byte amazonIsStupid = new Byte("what will this do:");
	    
	    System.out.println("" + amazonIsStupid);
	    
//	     return output.toString();   
	}
}
