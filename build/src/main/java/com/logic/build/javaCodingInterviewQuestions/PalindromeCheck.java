package com.logic.build.javaCodingInterviewQuestions;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String str = "A man, a plan, a canal, Panama";
		
		String replaceAll = str.replaceAll("\\W", "").toLowerCase();
		
		StringBuilder sb =  new StringBuilder();
		
		sb.append(replaceAll);
		
		String reverse = sb.reverse().toString().toLowerCase();
		
		System.out.println("reverse " + reverse);
		if(replaceAll.equals(reverse)) {
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		

	}

}
