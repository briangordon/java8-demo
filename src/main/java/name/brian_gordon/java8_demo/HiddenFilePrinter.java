package name.brian_gordon.java8_demo;

import java.io.File;
import java.io.FileFilter;

/**
 * Java 1.0
 *
 * @author Brian Gordon
 */
public class HiddenFilePrinter {
	private static class MyFileFilter implements FileFilter { // Not until 1.1!
		@Override
		public boolean accept(File file) {
			return file.isHidden();
		}
	}

	public static void main(String[] args) {
		File[] files = new File("/Users/brian/").listFiles(new MyFileFilter());
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}
}
