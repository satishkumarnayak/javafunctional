package javafunctional;

import java.util.List;

public class FunctionalP02 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 8, 14, 44, 3, 76, 21);
		System.out.println(addNumbers(numbers));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	private static int addNumbers(List<Integer> numbers) {
		return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);

	}

}
