package artcode.week3.day2;

import artcode.utils.ArrayHelper;

public class Ex2 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 ,9} };
		int[][] table = new int[3][3];

		int[][] mas3 = new int[5][4];
		// ArrayHelper.printMatrix(mas3);
		int[][] randmatrix = ArrayHelper.genMatrix(3, 3);
		ArrayHelper.printMatrix(randmatrix);
		System.out.println("~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}

			}
		}
	}
}
