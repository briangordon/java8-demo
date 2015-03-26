package name.brian_gordon.java8_demo;

import java.util.function.Function;

/**
 * @author Brian Gordon
 */
public class FunctionPlayground {
	private static void visualize(Function<Integer, Integer> fun) {
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column <= 40; column++) {
				if (fun.apply(column) >= 10-row) {
					System.out.print('x');
				} else {
					System.out.print(' ');
				}
			}
			System.out.print(System.lineSeparator());
		}
		System.out.print(System.lineSeparator());
	}

	public static void main(String[] args) {
		Function<Integer, Integer> parabola = x -> x*x/100;
		Function<Integer, Integer> wave = x -> (int)(5*Math.sin(x)) + 5;
		visualize(parabola);
		visualize(wave);
		visualize(x -> parabola.apply(x) + wave.apply(x));
		visualize(wave.compose(parabola));
	}
}
