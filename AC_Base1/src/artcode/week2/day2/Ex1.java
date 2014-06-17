package artcode.week2.day2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int[] mas = {1,2,6,0,123};
		
		System.out.println(mas[0]);
		
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
		
		double a = (Math.random() * 4);
		System.out.println("Random value = " + a);
		
		int b = (int) 0.5;
		int random = (int) a;
		System.out.println("Random int value = " + random);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value");
		int inputValue = sc.nextInt();
		System.out.println("input = " + inputValue);
		
		
		
		
		

	}

}
