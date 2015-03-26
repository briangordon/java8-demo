package name.brian_gordon.java8_demo;

/**
 * @author Brian Gordon
 */
public class WhichClass {
	public interface MyInterface {}
	private static class Impl1 implements MyInterface {}
	private static class Impl2 implements MyInterface {}
	private static class Impl3 implements MyInterface {}
	private static class Impl4 implements MyInterface {}

	public MyInterface getInstance(String name) {
		MyInterface ret = null;

		switch(name) {
			case "One":
				ret = new Impl1();
				break;
			case "Two":
				ret = new Impl2();
				break;
			case "Three":
				ret = new Impl3();
				break;
			case "Four":
				ret = new Impl4();
				break;
		}

		return ret;
	}
}
