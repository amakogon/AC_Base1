package artcode.week1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		if (10 % 2 == 0) {
			System.out.println("parnoe");
		} else {
			System.out.println("ne parnoe");
		}

//		 a X^2 + bX + c = 0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();

		int diskriminant = b * b - 4 * a * c;
		if (diskriminant < 0) {
			System.out.println("No solution");
		} else {
			double x1 = (-b + Math.sqrt(diskriminant)) / 2 * a;
			double x2 = (-b - Math.sqrt(diskriminant)) / 2 * a;
			System.out.println("x1 = " + x1 + "x2 = " + x2);
		}

	}

}
