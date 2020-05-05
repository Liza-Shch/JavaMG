package Matrix;

import Matrix.Matrix;

public class Main {
	public static Matrix findMatrixWithMaxNorm(int range, Matrix[] array) {
		int max = Integer.MIN_VALUE;
		int maxI = -1;
		for (int i = 0; i < array.length; i++) {
			int norm = array[i].norm(range);
			if (max < norm) {
				max = norm;
				maxI = i;
			}
		}
		
		return array[maxI];
	}
	
	public static void main(String []args) {
		int n = 5;
		Matrix matrix = new Matrix(n);
		Matrix matrix2 = new Matrix(n);
		
		matrix.fillRandom();
		matrix2.fillRandom();
		
		matrix.print();
		matrix2.print();
		
		matrix.doAddition(matrix2);
		matrix.print();
		
		matrix.doSubtraction(matrix2);
		matrix.print();
		
		matrix.doMultiplication(matrix2);
		matrix.print();
		
		System.out.println(matrix.norm(1));
		System.out.println(matrix.norm(2));
		
		Matrix[] array = new Matrix[n];
		for (int i = 0; i < n; i++) {
			array[i] = new Matrix(n);
			array[i].fillRandom();
		}
		
		Main.findMatrixWithMaxNorm(1, array).print();
		Main.findMatrixWithMaxNorm(2, array).print();
  }
}