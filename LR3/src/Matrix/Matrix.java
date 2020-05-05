package Matrix;

public class Matrix {
	public int n = 0;
	public int[][] head = null;
	
	public Matrix() {}
	
	public Matrix(int[][] matrix, int n) {
		this.n = n;
		this.head = new int[n][n];
		this.fill(matrix);
	}

	public Matrix(int n) {
		this.n = n;
		this.head = new int[n][n];
	}
	
	public void fillRandom() {
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				this.head[i][j] = (int) (Math.random() * (n * 2 + 1) - n);
			}
		}
	}
	
	public void fill(int[][] matrix) {
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				this.head[i][j] = matrix[i][j];
			}
		}
	}

	public void print() {
		for (int[] row: this.head) {
			for (int item: row) {
				System.out.printf("%d ", item);
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	public Matrix doAddition(Matrix matrix) {
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				this.head[i][j] += matrix.head[i][j];
			}
		}
		
		return this;
	}
	
	public Matrix doSubtraction(Matrix matrix) {
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				this.head[i][j] -= matrix.head[i][j];
			}
		}
		
		return this;
	}
	
	public Matrix doMultiplication(Matrix matrix) {
		if (this.n != matrix.n) {
			return null;
		}
		
		Matrix result = new Matrix(this.n);
		
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				int sum = 0;
				for (int k = 0; k < this.n; k++) {
					sum += this.head[i][k] * matrix.head[k][j];
				}
				
				result.head[i][j] = sum;
			}
		}
		
		this.fill(result.head);
		return result;
	}
	
	public int norm(int range) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < this.n; i++) {
			int sum = 0;
			for (int j = 0; j < this.n; j++) {
				switch (range) {
				case 1:
					sum += this.head[i][j];
					break;
				case 2:
					sum += this.head[j][i];
				}
			}
			
			if (max < sum) {
				max = sum;
			}
		}
		
		return max;
	}
}
	
