package Reg4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Stream<String> stream = Files.lines(Paths.get("/Users/liza_shch/eclipse-workspace/LR7/src/Reg4/test.txt"));
		List<String> list = stream.collect(Collectors.toList());
		int count = 0;
		for (String string: list) {
			String[] words = string.split(" ");
			if (words[0].substring(0, 1).matches("[a-z]")) {
				count += 1;
			}
		}
		
		System.out.println(count);
	}

}
