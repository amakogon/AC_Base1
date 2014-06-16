package artcode.week2.day1;

public class Ex4 {

	public static void main(String[] args) {
		int[] mas = new int[5];
		mas[0] = 1;
		mas[1] = 2;
		mas[3] = 123;
		mas[4] = (int) (Math.random() * 10);
		System.out.println(mas[0]);
		System.out.println(mas[1]);
		System.out.println(mas[2]);
		System.out.println(mas[3]);
		System.out.println(mas[4]);
		System.out.println("------------------");
		// int i = 6;
		for (int i = 0; i < mas.length; i = i + 2) {
			mas[i] = 5;
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		int a = 3;
		int[] array = new int[a];

		

	}

}
