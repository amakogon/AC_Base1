package artcode.week2.day2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = input.nextInt();
		
		int[] mas = new int[size];
		
		
		System.out.println("First array");
		for(int i = 0; i < mas.length; i++){
			int random = (int)(Math.random() * 10); //7
			mas[i] = random;
		}
		
		for(int i = mas.length - 1; i >= 0; i--){
			System.out.print(mas[i] + " ");
		}
		
//		---------------
		System.out.println();
		System.out.println("Second array");
		int[] mas2 = new int[6];
		
		for(int i = 0; i < mas2.length; i++){
			mas2[i] = (int)(Math.random() * 10);
		}
		
		for(int i = 0; i < mas2.length; i++){
			System.out.print(mas2[i] + " ");
		} 
				
	}
	
	
	
}
