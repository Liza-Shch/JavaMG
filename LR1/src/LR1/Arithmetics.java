package LR1;

import java.util.Scanner;

public class Arithmetics {
	public static int calcMultiplication(int[] multipliers) {
		int multiplication = 1;
		for (int multiplier: multipliers) {
			multiplication *= multiplier;
		}
		
		return multiplication;
	}
	
	public static int calcSum(int[] terms) {
		int sum = 0;
		for (int term: terms) {
			sum += term;
		}
		
		return sum;
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
		
		int sum = Arithmetics.calcSum(numbers);
		int multiplication = Arithmetics.calcMultiplication(numbers);
		System.out.printf("Sum = %d, multiplication = %d", sum, multiplication);
	}

}
