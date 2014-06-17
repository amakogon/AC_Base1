package artcode.utils;

public class ArrayHelper {

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int[] generateArray(int size) {
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			mas[i] = (int)(Math.random() * 100);
		}
		return mas;
	}

}
