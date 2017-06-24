package javaTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


 
public class CopyArrayWithLambda {
 
	public static void addCheck ( Set<String> w , String a) {
		boolean newItem = w.add(a);
		if ( !newItem) {
			System.err.println("dupe added");
		} else {
			System.err.println("added");
		}
	}
	
	public static void main(String[] args) {

		Set<String> zoo = new HashSet<String>();
		
		
		CopyArrayWithLambda.addCheck( zoo,"elephant");
		CopyArrayWithLambda.addCheck( zoo,"rhino");
		CopyArrayWithLambda.addCheck( zoo,"hyena");
		CopyArrayWithLambda.addCheck( zoo,"lion");
		CopyArrayWithLambda.addCheck( zoo,"rhino");

		// employmentInfo.setDeptSplitFlag(Boolean.TRUE.toString());
		List<StringBuffer> animals = new ArrayList<StringBuffer>();
		
		zoo.stream().forEach(e -> {
			animals.add(new StringBuffer(e));
		});
		
//		String[] animals=
//				targetDeptSplit.toArray(new String[targetDeptSplit.size()]);
		
		for ( StringBuffer s: animals) {
			System.err.println(s);
		}
		
	}
}