package Stream1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		String result = Stream.of("abc", "defg", "h").collect(Collectors.joining(":"));
		System.out.println(result);
	}

}
