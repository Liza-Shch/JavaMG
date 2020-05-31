package String;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Stream<String> stream = Files.lines(Paths.get("/Users/liza_shch/eclipse-workspace/LR5/src/String/test.txt"));

		List<String> result = stream
				.map(line -> line.replaceAll("final", ""))
				.collect(Collectors.toList());
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/Users/liza_shch/eclipse-workspace/LR5/src/String/result.txt")));
        for (String line: result) {
        	writer.append(line);
        	writer.newLine();
        }
        
        writer.close();
	}
}
