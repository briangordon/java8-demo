package name.brian_gordon.java8_demo;

import java.util.function.Consumer;

/**
 * @author Brian Gordon
 */
public class LambdaPlayground {
	private void printName() {
		System.out.println("Brian");
	}

	public static void main(String[] args) {
		LambdaPlayground playground = new LambdaPlayground();
		Consumer<LambdaPlayground> consumer = LambdaPlayground::printName; // Wat?
	}
}
