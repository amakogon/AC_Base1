package artcode.week2.day2;

import artcode.utils.ArrayHelper;

public class TestMethod {

	public static void main(String[] args) {
		int[] mas = ArrayHelper.generateArray(10);
		// double r = Math.random();
		ArrayHelper.printArray(mas);
		int[] mas2 = ArrayHelper.generateArray(3);
		System.out.println();
		ArrayHelper.printArray(mas2);
		int a = 10;
		int b = 3;
		int result = sum(a, b);
		System.out.println("Result = " + sum(a,b));
	}

	public static int sum(int first, int second) {
		int result = first + second;
		return result;
	}
}
