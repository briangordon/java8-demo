package name.brian_gordon.java8_demo;

import java.io.File;
import java.io.FileFilter;

/**
 * Java 8 v1
 *
 * @author Brian Gordon
 */
public class HiddenFilePrinter3 {
	public static void main(String[] args) {
		File[] files = new File("/Users/brian/").listFiles((File f) -> f.isHidden()); // TODO
		for(File file : files) { // Java 5!
			System.out.println(file.getName());
		}
	}
}
