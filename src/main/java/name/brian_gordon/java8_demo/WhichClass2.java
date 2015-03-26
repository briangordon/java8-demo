package name.brian_gordon.java8_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author Brian Gordon
 */
public class WhichClass2 {
	public interface MyInterface {}
	private static class Impl1 implements MyInterface {}
	private static class Impl2 implements MyInterface {}
	private static class Impl3 implements MyInterface {}
	private static class Impl4 implements MyInterface {}

	private static Map<String, Supplier<MyInterface>> constructors = new HashMap<>();
	static {
		constructors.put("One", Impl1::new);
		constructors.put("Two", Impl2::new);
		constructors.put("Three", Impl3::new);
		constructors.put("Four", Impl4::new);
	}

	public MyInterface getInstance(String name) {
		return constructors.get(name).get();
	}
}
