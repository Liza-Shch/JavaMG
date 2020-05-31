package Reg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Stream<String> stream = Files.lines(Paths.get("/Users/liza_shch/eclipse-workspace/LR7/src/Reg3/test.txt"));
		List<String> list = stream.collect(Collectors.toList());
		ArrayList<String> result = new ArrayList<String>();
		
		for (String string: list) {
			String[] words = string.substring(0, string.length() - 1).split(" ");
			String buffer = words[0];
			words[0] = words[words.length - 1];
			words[words.length - 1] = buffer;
			String res = "";
			for (String word: words) {
				res += word + " ";
			}
			
			res = res.substring(0, res.length() - 1) + ".";
			result.add(res);
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/Users/liza_shch/eclipse-workspace/LR7/src/Reg3/result.txt")));
        for (String line: result) {
        	writer.append(line);
        	writer.newLine();
        }
        
        writer.close();
        stream.close();
	}		

}
