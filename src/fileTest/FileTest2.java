package fileTest;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.text.StringEscapeUtils;

public class FileTest2 {

	public static void main(String[] args) throws IOException {

		File optionalVelocityTemplateDir;
		
		optionalVelocityTemplateDir = new File ( "src/fileTest/poop.txt");
		
		sout ( "" + optionalVelocityTemplateDir.exists() );
		sout ("" + optionalVelocityTemplateDir.lastModified() );
		sout ("" + optionalVelocityTemplateDir.getCanonicalPath() );
		sout ("abs path: " + optionalVelocityTemplateDir.getAbsolutePath() );
		sout( "" + optionalVelocityTemplateDir.isDirectory() );
		sout( "separator char :" + File.separatorChar );
		sout( "separator :" + File.separator );
		sout( "path separator :" + File.pathSeparator );
		
		FileReader fr=new FileReader(optionalVelocityTemplateDir);
		
		BufferedReader bio = new BufferedReader(fr);
		
		sout (bio.readLine());
		printIntAndChar (bio.read() );
		printIntAndChar (bio.read() );
		printIntAndChar (bio.read() );
		printIntAndChar (bio.read() );
		
		bio.skip(5); sout ("-skip 5-");
		
		printIntAndChar (bio.read() );
		printIntAndChar (bio.read() );
		printIntAndChar (bio.read() );
		
	}
	
	static void sout (String s ) { System.out.println(s); }

	static void printIntAndChar ( int readInt ) {
		
		System.out.println(StringEscapeUtils.escapeJava(readInt + " " + (char)readInt));

	}
}
