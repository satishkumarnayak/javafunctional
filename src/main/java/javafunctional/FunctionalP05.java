package javafunctional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalP05 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 8, 14, 44, 3, 76, 21);

		/*
		 * Function<Integer, Integer> mapperSquare = number -> number * number;
		 * 
		 * 
		 * List<Integer> squaredList = numbers.stream() .map(mapperSquare)
		 * .collect(Collectors.toList());
		 * 
		 * 
		 * 
		 * 
		 * Function<Integer,Integer> mapperCube = number -> number * number * number;
		 */

		List<Integer> cubeList = functionpass(numbers, number -> number * number * number);
		List<Integer> squaredList = functionpass(numbers, number -> number * number);

		System.out.println(squaredList);
		System.out.println(cubeList);
	}

	private static List<Integer> functionpass(List<Integer> numbers, Function<Integer, Integer> function) {
		return numbers.stream().map(function).collect(Collectors.toList());
		
	}

}
