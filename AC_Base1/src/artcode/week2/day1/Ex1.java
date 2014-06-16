package artcode.week2.day1;

public class Ex1 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		System.out.println(array[0]);
		int a = 6;
		array[0] = 14;
		System.out.println(array[0]);
		array[1] = a;
		System.out.println(array[1]);
		
		char[] mas = {'a','d','Q','2'};
		System.out.println(mas[3]);
		boolean[] qwe = new boolean[2];
		System.out.println(qwe[0]);		
		qwe[1] = true;
		
		int masLength = mas.length;
		System.out.println("Mas length = " + masLength);
		
		
	}

}
