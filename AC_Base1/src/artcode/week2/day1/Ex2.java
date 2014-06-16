package artcode.week2.day1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
		
		double rand = Math.random();
		System.out.println(rand);
		int intRandom = (int) rand;
		System.out.println("Random int = " + intRandom);
		
		int randValue = (int)( Math.random() * 10);
		System.out.println(randValue);
		
	}

}
