package velocityProject;

import java.io.*;
import java.nio.charset.Charset;

public class FilterCommentsTest {

  static String filename = "./src/conf/comment-test.txt";

  public static void main(String args[]) throws Exception {
    FileInputStream fin = new FileInputStream(filename);

    String line;
    InputStream fis = new FileInputStream(filename);
    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
    BufferedReader br = new BufferedReader(isr);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();

    String commentedLine;
    while ((line = br.readLine()) != null) {

      // first runner up pattern - but won't get comments at eol
      // System.out.println("pattern2: "+ line.replaceAll("^\\s*#.*", "")); // so this does just a
      // comment on a line

      // working from end of line,
//      commentedLine = line.replaceAll("#[\\s\\w]*$", ""); // removes # and all after , even from eol,
      commentedLine = line.replaceAll("^\\s*#.*", ""); 
      
      System.out.println("as read: " + commentedLine);

      if (line.length() == commentedLine.length()) {
        baos.write(commentedLine.getBytes());
        baos.write(System.lineSeparator().getBytes());
      }
    }

    // create input stream from baos

    InputStream isFromFirstData = new ByteArrayInputStream(baos.toByteArray());

    InputStreamReader isr2 = new InputStreamReader(isFromFirstData, Charset.forName("UTF-8"));
    BufferedReader br2 = new BufferedReader(isr2);

    while ((line = br2.readLine()) != null) {
      // Deal with the line

      System.out.println("output stream line: " + line);
      // baos.write(line.getBytes());
    }

    // Close the document
    fin.close();

    br.close();
  }


}
