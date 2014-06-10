package artcode.week1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner helper = new Scanner(System.in);
		System.out.println("Enter value a");
		int a = helper.nextInt();
		System.out.println("Enter value b");
		int b = helper.nextInt();
		
		if(a > b){
			System.out.println("A > B");
		} 
		if (a < b){
			System.out.println("A < B");
		} else {
			System.out.println("a == b");
		}
		
		
	}

}
