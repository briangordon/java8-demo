package name.brian_gordon.java8_demo;

import java.io.File;
import java.io.FileFilter;

/**
 * Java 1.1
 *
 * @author Brian Gordon
 */
public class HiddenFilePrinter2 {
	public static void main(String[] args) {
		File[] files = new File("/Users/brian/").listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}
}
