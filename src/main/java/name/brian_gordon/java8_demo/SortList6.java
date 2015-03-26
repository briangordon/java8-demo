package name.brian_gordon.java8_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Brian Gordon
 */
public class SortList6 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Banana");
		items.add("Apple");
		items.add("Apricot");
		items.add("Papaya");
		items.add("Durian");
		items.add("Kiwi");

		// Sort items in reverse.
		items.stream()
				.sorted(Comparator.comparing(String::length).reversed())
				.forEach(System.out::println);
	}
}
