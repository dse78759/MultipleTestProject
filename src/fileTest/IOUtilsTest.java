package fileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;

public class IOUtilsTest {

	public static void main(String[] args) throws IOException {

	  sout("hi");
		File inFile;
		
		inFile = new File ( "src/fileTest/poop.txt");
		sout ( "exists? " + 		inFile.exists() );
		
		InputStream is = new FileInputStream(inFile);
		
		StringWriter sw = new StringWriter();
		
		IOUtils.copy( is, sw );
		
		sout ( sw.toString() );

	    sout("done");

	}
	
	static void sout (String s ) { System.out.println(s); }

	
}
