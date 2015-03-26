package name.brian_gordon.java8_demo;

/**
 * @author Brian Gordon
 */
public class MultipleInheritance {
	private interface Parent1 {
		default void printName() {
			System.out.println("Parent1");
		}
	}

	private interface Parent2 {
		default void printName() {
			System.out.println("Parent2");
		}
	}

	private static class Child implements Parent1, Parent2 {
		@Override
		public void printName() {
			Parent2.super.printName();
		}
	}
}
