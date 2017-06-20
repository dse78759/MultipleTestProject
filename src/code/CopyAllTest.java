package code;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CopyAllTest {

	public static void main(String[] args) {
		CopyAllTest bt=new CopyAllTest();
		
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
