package velocityProject;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTestWithFilter {
  public static void SpeakIt(String fileName) throws IOException {
    try {
      File file = new File(fileName);

      InputStream inF = filterComments(new FileInputStream(file));
      Scanner sc = new Scanner(inF);

      patternMatcherWeird(sc);

      sc.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * Take input stream, and line by line delete any full line comments starting with pound sign.
   * Also remove blank, whitespace only lines.
   * 
   * @param fileWithComments
   * @return stream with comments and blanks removed
   * @throws IOException
   */
  static public InputStream filterComments(InputStream fileWithComments) throws IOException {

    InputStreamReader isr = new InputStreamReader(fileWithComments, Charset.forName("UTF-8"));
    BufferedReader br = new BufferedReader(isr);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    String line;
    String lineWithCommentsRemoved = "";
    while ((line = br.readLine()) != null) {

      //  won't get comments at eol
      boolean blankline = false;
      if (line.matches("^\\s*$")) {
        blankline = true;
        lineWithCommentsRemoved="";
      } else {
        lineWithCommentsRemoved = line.replaceAll("^\\s*#.*", "");
      }

      // only write out non-blank lines where we didn't clear out comments
      if (!blankline && line.length() == lineWithCommentsRemoved.length()) {
        baos.write(lineWithCommentsRemoved.getBytes());
        baos.write(System.lineSeparator().getBytes());
      }
    }

    InputStream filteredStream = new ByteArrayInputStream(baos.toByteArray());

    return filteredStream;
  }

  public static void sout(String s) {
    System.out.println(s);;
  }

  public static void patternMatcherWeird(Scanner scanner) {

    scanner.useDelimiter(Pattern.compile("[ =\\]]"));

    try {
      while (scanner.hasNextLine()) {

        // return f.replaceAll("(?<=\\w)#", "\\\\#");


        scanner.useDelimiter(Pattern.compile("\\]"));
        String s = scanner.next();

        String type = s.replaceAll("\\[", "").trim();

        sout("type  :" + type);

        scanner.useDelimiter(Pattern.compile("="));

        s = scanner.next();
        String name = s.replaceAll("\\]", "").trim();

        sout("name  :" + name);

        s = scanner.nextLine();
        StringBuffer value = new StringBuffer(s.replaceFirst("=", "").trim());
        int colonIndex = value.lastIndexOf(";");

        if (colonIndex == -1)
          ; // TODO - if the semi-colon is not found, throw?

        value.replace(colonIndex, colonIndex + 1, "");

        sout("value :" + value + "\n");
      }
    } catch (Exception e) {

      e.printStackTrace();

    }
  }


  public static void main(String[] args) throws IOException {
    // SpeakIt("./src/conf/values.txt");
    SpeakIt("./src/conf/comment-test.txt");
  }
}
