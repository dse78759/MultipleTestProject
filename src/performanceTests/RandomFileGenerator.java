package performanceTests;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Use to generate a file with X values to a maximum of Y.
 * 
 * If X and Y are not passed, default to 1000 and 10000 respectively.
 * 
 * @author scott
 *
 */
public class RandomFileGenerator {

	static void sout (String s ) { System.out.println(s); }
	
	public static void main(String args[]) {
		int number, maxSize;
		if (args.length == 2) {
			// parse
			number = Integer.valueOf(args[1]);
			maxSize = Integer.valueOf(args[2]);
		} else {
			number = 1000;
			maxSize = 10000;
		}

		RandomFileGenerator rfg = new RandomFileGenerator();
		rfg.saveArray( rfg.makeArray(number, maxSize));
		
	}

	public void saveArray( List<Integer> xx) {
		File outFile;

		outFile = new File("src/performanceTests/numbers.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {

			// String content = "This is the content to write into file\n";

			for (Integer i : xx) {
				bw.write("" + i+"\n");
			}
		
			// no need to close it.
			// bw.close();

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public List<Integer> makeArray(int num, int max) {

		List<Integer> sendBack = new ArrayList<Integer>();

		// first how many elements?
		Random r = new Random();

		for (int i = 0; i < num; i++) {
			int num2 = r.nextInt() % max;

			if (num2 < 0) {
				sendBack.add(num2 * -1);
			} else {
				sendBack.add(num2);
			}
			sout ( "" + sendBack.get(sendBack.size()-1) );
		}

		return sendBack;
	}
}
