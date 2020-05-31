package Reg1;

import java.io.IOException;

public class Reg1 {

	public static void main(String[] args) throws IOException {
		int k = 3;
		String letter = "a";
		String string = "jhbhyjhjh hyfvfdcgvhbnj xdfcfd atvjknkj vsajnkjn sdc";
		String[] list = string.split(" ");
		String res = "";
		for (String word: list) {
			if (word.length() > k) {
				res += word.substring(0, k - 1) + letter + word.substring(k) + " ";
			} else {
				res += word + " ";
			}
		}
		
		System.out.println(res);
	}

}
