package name.brian_gordon.java8_demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Brian Gordon
 */
public class StreamPlayground {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("helices");
		words.add("ichor");
		words.add("brouhaha");
		words.add("provocateur");
		words.add("frisson");

		// Print each distinct string.
		words.stream().distinct().forEachOrdered(System.out::println);

		// Get the first 3 words.
		List<String> firstThree = words.parallelStream().sequential().limit(3).collect(Collectors.toList());
		firstThree.forEach(System.out::println);

		// Count the number of strings which end with a consonant.
		long count = words.parallelStream().filter(word -> word.matches(".*[^aeiou]")).count();
		System.out.println(count + " strings end with a consonant.");

		// Add a prefix to each word.
		words.parallelStream().map(word -> "Best word: " + word).forEachOrdered(System.out::println);

		// Mash the words together into one long word.
		String longWord1 = words.parallelStream().collect(Collectors.joining());
		StringBuilder longWord2 = words.parallelStream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(longWord1);
		System.out.println(longWord2);

		// Put spaces between each word.
		StringBuilder sentence2 = words.stream().collect(StringBuilder::new,
				StringBuilder::append, (acc, str) -> acc.append(str).append(" "));
		System.out.println(sentence2);

		// Append all of the words together into a sentence (better).
		String sentence = words.parallelStream().reduce("", (accum, str) -> accum += (" " + str));
		System.out.println(sentence);

		// Group the words by length.
		Map<Integer, List<String>> wordsByLength = words.parallelStream()
				.collect(Collectors.groupingByConcurrent(String::length)); //ConcurrentHashMap!

		int[] numbers = new int[] {5, 7, 7, 11, 84, 19};

		// Find the sum
		System.out.println(Arrays.stream(numbers).reduce(0, (a, b) -> a + b));
		System.out.println(Arrays.stream(numbers).reduce(0, Integer::sum));
		System.out.println(Arrays.stream(numbers).sum());

	}
}
