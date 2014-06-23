package artcode.week3.day1;

import artcode.utils.ArrayHelper;
import artcode.utils.StringHelper;

import com.sun.xml.internal.ws.message.StringHeader;

public class TestCountSymbol {
	public static void main(String[] args) {
		String word = "JavA is programming language";

		int result = StringHelper.countSymbol(word, 'a');
		int resG = StringHelper.countSymbol(word, 'g');
		System.out.println("Count a = " + result + " count g = " + resG);

		boolean bool = 5 == 10;

		String s1 = "some";
		// Math.random();
		System.out.println(s1.equals(word));
		String[] words = { "My", "name", "is", "Vova" };
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		String longest = StringHelper.getlongestWord(words);
		System.out.println("longest word = " + longest);

	}
}
