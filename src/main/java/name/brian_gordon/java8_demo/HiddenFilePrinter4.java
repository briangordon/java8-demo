package name.brian_gordon.java8_demo;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Predicate;

/**
 * Java 8 v2
 *
 * @author Brian Gordon
 */
public class HiddenFilePrinter4 {
	public static void main(String[] args) {
		File[] files = new File("/Users/brian/").listFiles(f -> f.isHidden() && f.isDirectory());
		for(File file : files) {
			System.out.println(file.getName());
		}
	}
}
