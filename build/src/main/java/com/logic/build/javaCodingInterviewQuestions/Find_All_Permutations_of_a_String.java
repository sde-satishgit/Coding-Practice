package com.logic.build.javaCodingInterviewQuestions;

public class Find_All_Permutations_of_a_String {

	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = "";
					String substring = str.substring(0, i);
			String substring2 = str.substring(i + 1);
			ros = substring + substring2;

			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

	public static void main(String[] args) {

		String s = "ABC";
		printPermutn(s, "");

	}

}
