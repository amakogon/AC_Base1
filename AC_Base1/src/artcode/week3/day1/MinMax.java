package artcode.week3.day1;

public class MinMax {

	public static void main(String[] args) {
			int[] mas = {1,7,3,5};
			
			int min = mas[0];
			int max = mas[0];
			for (int i = 1; i < mas.length; i++) {
				if(min > mas[i]){
					min = mas[i];
				}
				if(max < mas[i]){
					max = mas[i];
				}
			}
			System.out.println("Min=" + min);
			System.out.println("Max=" + max);
	}

}
