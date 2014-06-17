package artcode.week2.day2;

public class Ex4 {
	public static void main(String[] args) {
		String s = "Hello studetns";
		System.out.println(s);
		char symbol = s.charAt(8);
		System.out.println("Symbol on eight position = " + symbol);
		System.out.println(s.charAt(9));

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}

		int[] nums = { 5, 1, 72, 3, 4 };
		int min = nums[0];
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("Min = " + min);
		
	}
}
