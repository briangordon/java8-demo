package name.brian_gordon.java8_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Brian Gordon
 */
public class SortList5 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Banana");
		items.add("Apple");
		items.add("Apricot");
		items.add("Papaya");
		items.add("Durian");
		items.add("Kiwi");

		// Sort items by length.
		items.sort(Comparator.comparing(String::length));

		for(String item : items) {
			System.out.println(item);
		}
	}
}
