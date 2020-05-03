package LR2;

import java.util.Date;
import java.util.Scanner;

public class Strings {
	
	public static int lengthAverage(String[] strings) {
		if (strings.length == 0) {
			return 0;
		}
		
		int lengthSum = 0;
		for (String string: strings) {
			lengthSum += string.length();
		}
		
		return lengthSum / strings.length;
	}
	
	public static void fprintFilter(String[] strings, int lengthAverage, boolean isMore) {
		System.out.println("Filtered string");
		if (isMore) {
			System.out.printf("where length is more then %d\n", lengthAverage);
		} else {
			System.out.printf("where length is less or equal to %d\n", lengthAverage);
		}
		
		for (String string : strings) {
			if (string.length() > lengthAverage == isMore) {
				System.out.printf("%s length = %d\n", string, string.length());
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input count of strings");
		int count = sc.nextInt();
		String[] strings = new String[count];

		System.out.printf("Input %d strings\n", count);
		for (int i = 0; i < count; i++) {
			strings[i] = sc.next();
		}
		
		int lengthAverage = Strings.lengthAverage(strings);
		System.out.printf("Average length = %d\n", lengthAverage);
		Strings.fprintFilter(strings, lengthAverage, false);
		Strings.fprintFilter(strings, lengthAverage, true);
		
		System.out.println("Shcherbakova Liza, IU6-21M");
		System.out.printf("Date of done %tc\n", new Date());
	}

}
