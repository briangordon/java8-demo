package name.brian_gordon.java8_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Gordon
 */
public class FilterList {
	public static void main(String[] args) {
		// Stupid trick :)
		List<Integer> numbers = new ArrayList<Integer>() {{
			add(5);
			add(6);
			add(7);
			add(8);
		}};

		List<Integer> filteredNumbers = new ArrayList<>();
		for (int curNumber : numbers) {
			if (curNumber > 5) {
				filteredNumbers.add(curNumber);
			}
		}

		for (int curNumber : filteredNumbers) {
			System.out.println(curNumber);
		}
	}
}
