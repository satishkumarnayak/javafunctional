package javafunctional;

import java.util.List;

public class StrutureP01 {

	public static void main(String[] args) {

		printAllNumbersInListStrctured(List.of(12, 8, 14, 44, 3, 76, 21));

	}

	private static void printAllNumbersInListStrctured(List<Integer> numbers) {
		
		for(int number : numbers) {
			System.out.println(number);
		}

	}

}
