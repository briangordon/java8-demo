package name.brian_gordon.java8_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Brian Gordon
 */
public class SortList2 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Banana");
		items.add("Apple");
		items.add("Apricot");
		items.add("Papaya");
		items.add("Durian");
		items.add("Kiwi");

		// Sort items in reverse.
		Collections.sort(items,
				(s1, s2) -> s2.compareTo(s1)
		);

		for(String item : items) {
			System.out.println(item);
		}
	}
}
