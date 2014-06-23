package artcode.utils;

public class StringHelper {

	public static int countSymbol(String word, char symbol) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == symbol) {
				count++;
			}
		}
		return count;
	}

	public static String getlongestWord(String[] sentence) {
		String maxWord = sentence[0];
		for (int i = 1; i < sentence.length; i++) {
			if (maxWord.length() < sentence[i].length()) {
				maxWord = sentence[i];
			}
		}

		return maxWord;
	}

}
