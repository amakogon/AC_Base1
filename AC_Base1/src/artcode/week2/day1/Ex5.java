package artcode.week2.day1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < array.length; i++){
//			System.out.println("Enter value of " + i + " cell");
//			array[i] = sc.nextInt();
			array[i] = (int)(Math.random() * 5);
		}
		System.out.println();
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
