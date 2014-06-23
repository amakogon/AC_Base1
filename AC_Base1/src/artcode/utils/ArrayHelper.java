package artcode.utils;

public class ArrayHelper {

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
