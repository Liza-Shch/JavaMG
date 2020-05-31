package Stream2;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		int result = Stream.of(1, 2, 3, 4, 5, 6)
				.filter((number) -> number % 2 == 0)
				.reduce(0, (acc, number) -> acc + number);
		
		System.out.println(result);

	}

}
