package javafunctional;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalP01 {

	public static void main(String[] args) {

		// printAllNumbersInListFunctional(List.of(12, 8, 14, 44, 3, 76, 21));

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker","Kubernetes");

		// printAllCoursesInListFunctional(courses);

		// printCoursesContainingSpring(courses);

		printAllSquareNumbersIFEvenFunctional(List.of(12, 8, 14, 44, 3, 76, 21));

	}

	private static void printAllSquareNumbersIFEvenFunctional(List<Integer> numbers) {

		numbers.stream()
				.filter(number -> number % 2 == 0)
				.map(number -> number * number)
				.forEach(System.out::println);
	}

	private static void printCoursesContainingSpring(List<String> courses) {

		courses.stream().forEach((course) -> {
			if (course.contains("Spring")) {
				// System.out.println(course);
			}
		});
		;

		// courses.stream().filter( course ->
		// course.contains("Spring")).forEach(System.out::println);
		// courses.stream().filter( course ->
		// course.contains("Spring")).collect(Collectors.toList()).stream().forEach(System.out::println);
		courses.stream().filter(course -> course.length() > 3).forEach(System.out::println);

	}

	private static void printAllCoursesInListFunctional(List<String> courses) {

		courses.stream().forEach(System.out::println);

		courses.stream().forEach(course -> System.out.println(course));

		courses.stream().forEach((course) -> System.out.println(course));

		courses.stream().forEach((String course) -> System.out.println(course));

	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// numbers.stream().forEach(FunctionalP01::print);

//		numbers.stream().forEach(System.out::println);

		numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		numbers.stream().filter(FunctionalP01::isEven).forEach(System.out::println);

	}

	public static void print(int number) {
		System.out.println(number);
	}

	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

}
