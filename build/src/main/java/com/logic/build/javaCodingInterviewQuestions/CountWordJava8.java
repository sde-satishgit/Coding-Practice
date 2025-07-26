package com.logic.build.javaCodingInterviewQuestions;

import java.util.Arrays;

public class CountWordJava8 {

	public static void main(String[] args) {


		String str = "I am sharping java skill";
		
		// \\s and " " both are same
		long count = Arrays.stream(str.split("\\s")).count();
		
		System.out.println(count);

	}

}
