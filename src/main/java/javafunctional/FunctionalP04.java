package javafunctional;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalP04 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 8, 14, 44, 3, 76, 21);

		passbehaviour(numbers, number -> number % 2 == 0);

		passbehaviour(numbers, number -> number % 2 != 0);
		
		passbehaviour(numbers, number -> number % 4 == 0);
		
		
	}

	private static void passbehaviour(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
