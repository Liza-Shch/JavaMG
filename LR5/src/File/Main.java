package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        File file = new File("/Users/liza_shch/eclipse-workspace/LR5/src/File/test.txt");
		File result = new File("/Users/liza_shch/eclipse-workspace/LR5/src/File/output/test.txt");
        result.getParentFile().mkdir();
        result.createNewFile();
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(result)));
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
        	String line = sc.nextLine();
            writer.append(line.replace("public", "private"));
            writer.newLine();
        }
        
        sc.close();
        writer.close();
	}
}
