package coding;

public class Fibonacci {

	public static void main(String[] args) {
		
	//	System.out.println(fibonacci(15));
		fibonacciPrint(5);
	}

	public static int fibonacci(int n) {

		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}

	}
	
	public static void  fibonacciPrint(int n) {

		if (n <= 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {
			 System.out.println(fibonacci(n - 2) + fibonacci(n - 1));
		}

	}


}
