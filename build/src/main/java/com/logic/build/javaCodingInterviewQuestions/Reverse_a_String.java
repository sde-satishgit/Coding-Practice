package com.logic.build.javaCodingInterviewQuestions;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		String s = "Hello, World!";
		
		char[] charArray = s.toCharArray();
		
		StringBuilder sb =  new StringBuilder();
		int lastIndex = charArray.length-1;
		for(int i = lastIndex;i>=0;i--) {
			
			sb.append(charArray[i]);
		}

		System.out.println(sb.toString());
	}

}
