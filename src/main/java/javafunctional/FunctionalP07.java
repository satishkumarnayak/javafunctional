package javafunctional;

import java.util.stream.LongStream;

public class FunctionalP07 {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();
//		System.out.println(LongStream.range(0, 1000000000).sum());
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		System.out.println(System.currentTimeMillis() - time);

	}

}
