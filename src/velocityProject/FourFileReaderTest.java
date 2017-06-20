package velocityProject;

import java.io.*;
import java.nio.charset.Charset;

public class FourFileReaderTest {

  static String filename ="./src/conf/comment-test.txt";

  public static void main(String args[]) throws Exception {
    // ---------------------------First way-------------------------//
    FileInputStream fin = new FileInputStream(filename);
    
    // Create a byte array
    byte[] b = new byte[fin.available()];
    
    // Read data into the array
    fin.read(b);
    for (int i = 0; i < b.length; i++) {
      System.out.print((char) b[i]);
    }
    // ---------------------------Second way-------------------------//
    int k = 0;
    FileInputStream fin1 = new FileInputStream(filename);
    System.out.println("\n\nSecond way\n");
    // Read till the end of file
    while ((k = fin1.read()) != -1) {
      System.out.print((char) k);
    }
    // ---------------------------Third way-------------------------//
    FileInputStream fin2 = new FileInputStream(filename);
    byte b1[] = new byte[fin2.available()];
    fin2.read(b1, 0, b1.length);
    System.out.println("\n\nThird way\n");
    for (int i = 0; i < b1.length; i++) {
      System.out.print((char) b1[i]);
    }

 // ---------------------------fourth way-------------------------//
    
    
    System.out.println("\n\n Fourth way with buffered reader, input and output streams \n");
    
    String line;
    InputStream fis = new FileInputStream(filename);
    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
    BufferedReader br = new BufferedReader(isr);

//    public void doTwoThingsWithStream(InputStream inStream, OutputStream outStream){ 
      //create temporary bayte array output stream
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      
      //doFirstThing(inStream, baos);
      while ((line = br.readLine()) != null) {
        // Deal with the line
       // return f.replaceAll("(?<=\\w)#", "\\\\#");
        System.out.println("line: "+ line.replaceAll("(?<=\\w)#", "\\\\#"));
        baos.write(line.getBytes());
      }
      
      //create input stream from baos
      
      InputStream isFromFirstData = new ByteArrayInputStream(baos.toByteArray()); 
      
      InputStreamReader isr2 = new InputStreamReader(isFromFirstData, Charset.forName("UTF-8"));
      BufferedReader br2 = new BufferedReader(isr2);

      while ((line = br2.readLine()) != null) {
        // Deal with the line
       
        System.out.println("output stream line: "+ line);
//        baos.write(line.getBytes());
      }
    
  
    
    
    // Close the document
    fin.close();
    fin1.close();
    fin2.close();
    br.close();
  }


}
