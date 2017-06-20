package velocityProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest2 {
	public static void SpeakIt(String fileName) {
		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			
			patternMatcherWeird(sc);

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void sout ( String s ) {
		System.out.println(s);;
	}
	
	public static void patternMatcherWeird ( Scanner scanner ) {
		
		scanner.useDelimiter(Pattern.compile("[ =\\]]"));
				
		try {
			while ( scanner.hasNextLine() ) {
			  
//			  return f.replaceAll("(?<=\\w)#", "\\\\#");
			  
			  
				scanner.useDelimiter(Pattern.compile("\\]"));
				String s = scanner.next(); 

				String type=s.replaceAll("\\[", "").trim();
				
				sout ( "type  :" + type  );

				scanner.useDelimiter(Pattern.compile("="));

				s = scanner.next();
				String name=s.replaceAll("\\]", "").trim();

				sout ( "name  :" +name);

				s= scanner.nextLine();
				StringBuffer value=new StringBuffer( s.replaceFirst("=", "").trim());
				int colonIndex=value.lastIndexOf(";");
				
				if ( colonIndex==-1 ) ; //TODO - if the semi-colon is not found, throw?
				
				value.replace(colonIndex, colonIndex+1, "");
				
				sout ("value :"+value+"\n" );
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

	
	public static void main(String[] args) {
//		SpeakIt("./src/conf/values.txt"); 
        SpeakIt("./src/conf/comment-test.txt"); 
	}
}
