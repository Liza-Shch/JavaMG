package LR2;

import java.util.Scanner;

public class Matrix {
	public static void fillRandom(int[][] matrix, int power) {
		for (int i = 0; i < power; i++) {
			for (int j = 0; j < power; j++) {
				matrix[i][j] = (int) (Math.random() * (power * 2 + 1) - power);
			}
		}
	}
	
	public static void print(int[][] matrix) {
		for (int[] row: matrix) {
			for (int item: row) {
				System.out.printf("%d ", item);
			}
			
			System.out.println();
		}
	}
	
	public static int average(int[] items) {
		if (items.length == 0) {
			return 0;
		}
		
		int sum = 0;
		for (int item: items) {
			sum += item;
		}
		
		return sum / items.length;
	}
	
	public static int[][] createMatrix(int[][]matrix, int power) {
		int[][]newMatrix = new int[matrix.length][matrix.length];
		for (int i = 0; i < power; i++) {
			int average = Matrix.average(matrix[i]);
			for (int j = 0; j < power; j++) {
				newMatrix[i][j] = matrix[i][j] - average;
			}
		}
		
		return newMatrix;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input matrix power");
		int power = sc.nextInt();
		int[][] matrix = new int[power][power];
		Matrix.fillRandom(matrix, power);
		
		System.out.println("Random matrix\n");
		Matrix.print(matrix);
		
		System.out.println("\nResult matrix\n");
		int[][] newMatrix = Matrix.createMatrix(matrix, power);
		Matrix.print(newMatrix);
	}

}
