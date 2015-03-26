package name.brian_gordon.java8_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Brian Gordon
 */
public class FilterList2 {
	public static void main(String[] args) {
		// Stupid trick :)
		List<Integer> numbers = new ArrayList<Integer>() {{
			add(5);
			add(6);
			add(7);
			add(8);
		}};

		List<Integer> filteredNumbers = numbers.stream().filter(i -> i > 5).collect(Collectors.toList());

		for (int curNumber : filteredNumbers) {
			System.out.println(curNumber);
		}
	}
}
