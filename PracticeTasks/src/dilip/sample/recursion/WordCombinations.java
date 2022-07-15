package dilip.sample.recursion;

//Java program to print all combination of size r in an array of size n
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class WordCombinations {
	static void printPermutn(String str, String ans, List<String> wordList) {
		// When string is empty
		if (str.length() == 0) {
			for (int i = 0; i < ans.length(); i++) {
				String ansch = String.valueOf(ans.charAt(i));
				if (!ansch.isBlank()) {
					int ind = Integer.parseInt(String.valueOf(ans.charAt(i)).trim());
					System.out.print(wordList.get(ind) + " ");
				}
			}
			System.out.println("");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call is looking for 
			printPermutn(ros, ans + " " + ch, wordList);
		}
	}

	// main
	public static void main(String[] args) {
		List<String> wordList = new ArrayList<String>();
	//	wordList.add("Hello");
		wordList.add("How");
		wordList.add("Are");
		wordList.add("You");

		String s = "";
		for (int i = 0; i < wordList.size(); i++) {
			s = s.concat(String.valueOf(i));
		}
		printPermutn(s, "", wordList);
	}
}
