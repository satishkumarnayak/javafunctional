package javafunctional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalP03 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 8, 14, 44, 3, 76, 21);
		
		Predicate<Integer> pr = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				// TODO Auto-generated method stub
				return  (number % 2 ==0);
			}
		};
	//	Predicate<Integer> predicateIsEven = number -> number % 2 ==0;
		Function<Integer,Integer> functionSquare = number -> number * number;
		Consumer<Integer> consumerPrint = number -> System.out.println(number);
		numbers.stream()
		    .filter(pr)
		    .map(functionSquare)
		    .forEach(consumerPrint);

	}

}
