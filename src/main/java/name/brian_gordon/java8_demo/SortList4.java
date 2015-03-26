package name.brian_gordon.java8_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Brian Gordon
 */
public class SortList4 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Banana");
		items.add("Apple");
		items.add("Apricot");
		items.add("Papaya");
		items.add("Durian");
		items.add("Kiwi");

		// Sort items in reverse.
		items.sort(Comparator.reverseOrder()); // TODO streams: comparing length, .reversed()

		for(String item : items) {
			System.out.println(item);
		}
	}
}
