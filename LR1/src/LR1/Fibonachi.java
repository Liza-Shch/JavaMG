package LR1;

import java.util.Scanner;

public class Fibonachi {
	public static boolean isFibonachiNumber(int number) {
		int prevNumber = 1;
		int currentNumber = 1;
		
		if (number == currentNumber) {
			return true;
		}
		
		while (currentNumber < number) {
			int newCurrentNumber = prevNumber + currentNumber;
			if (newCurrentNumber == number) {
				return true;
			}
			
			prevNumber = currentNumber;
			currentNumber = newCurrentNumber;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input count of numbers");
		int count = sc.nextInt();
		int[] numbers = new int[count];

		System.out.printf("Input %d numbers", count);
		for (int i = 0; i < count; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("List of Fibonachi numbers:");
		for (int number: numbers) {
			boolean isFibonachiNumber = Fibonachi.isFibonachiNumber(number);
			if (isFibonachiNumber) {
				System.out.println(number);
			}
		}
	}
}
