package artcode.week2.day2;

import artcode.utils.ArrayHelper;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int[] arr = { 1, 2, 3, 1, 2, 4 };
		int a = 5;
		printArray(arr);

		int[] mass = { 123, 4532, 512, 52 };
		System.out.println();
		printArray(mass);
		System.out.println("\nUsing arrayHelper");
		ArrayHelper.printArray(mass);
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

}
