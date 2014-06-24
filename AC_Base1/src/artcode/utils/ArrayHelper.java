package artcode.utils;

public class ArrayHelper {

	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
		}
	}
	
	public static int[][] genMatrix(int rows, int columns){
		int[][] matrix = new int[rows][columns];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
		return matrix;
	}

	public static int[] genArrayInRange(int size, int a, int b) {
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * (b - a)) + a);

		}
		return mas;
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int[] generateArray(int size) {
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 100);
		}
		return mas;
	}

	public static void swapMinMax(int[] array) {
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[minIndex] > array[i]) {
				minIndex = i;
			}
			if (array[maxIndex] < array[i]) {
				maxIndex = i;
			}
		}
		int temp = array[minIndex]; // temp = 1
		array[minIndex] = array[maxIndex]; // {7,7,3,6};
		array[maxIndex] = temp;
	}

	public static int[] genMasWithConditions(int size) {
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			int rand = (int) (Math.random() * 10);
			if (i % 2 == 0) {
				if (rand % 2 == 0) {
					mas[i] = rand;
				} else {
					mas[i] = rand + 1;
				}
			} else {
				if (rand % 2 != 0) {
					mas[i] = rand;
				} else {
					mas[i] = rand + 1;
				}
			}
		}
		return mas;
	}
	
	
}
