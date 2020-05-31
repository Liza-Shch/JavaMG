package Reg2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String string = "ajhnha dfn jj dcdl ldl ldl";
		String[] list = string.split(" ");
		ArrayList<String> result = new ArrayList<String>();
		for (String word: list) {
			if (word.charAt(0) == word.charAt(word.length() - 1)) {
				if (!result.contains(word)) {
					result.add(word);
				};
			}
		}
		
		for (String word: result) {
			System.out.println(word);
		}
		
	}

}
