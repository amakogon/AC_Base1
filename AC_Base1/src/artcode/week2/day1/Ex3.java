package artcode.week2.day1;

public class Ex3 {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 20);
		if(rand < 10) {
			System.out.println("Less then 10, value = " + rand);
		} else {
			System.out.println("More then 10, value = " + rand);
		}
	}

}
