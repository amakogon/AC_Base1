package artcode.week3.day1;

import artcode.utils.ArrayHelper;

public class TestMinMax {
	public static void main(String[] args) {
		int[] mas = {1,7,3,6,123};
		ArrayHelper.swapMinMax(mas);
		ArrayHelper.printArray(mas);
		
		mas = ArrayHelper.genMasWithConditions(10);
		System.out.println("Generated array");
		ArrayHelper.printArray(mas);
		
	}
}
