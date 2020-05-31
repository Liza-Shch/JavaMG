package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * (10 * 2 + 1) - 10));
		}
		
		list.forEach((el) -> System.out.println(el));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorting\n");
		list.forEach((el) -> System.out.println(el));
	}

}
