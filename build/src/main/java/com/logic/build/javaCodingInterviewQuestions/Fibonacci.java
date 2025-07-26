package com.logic.build.javaCodingInterviewQuestions;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 0,1,1,2,3,5,8...
		
		int fn = 0;
		int sn =1;
		
		int n= 10;
		for(int i=1;i<=n;i++) {
			
			System.out.print(fn + " ");
			
			int next = fn+sn;
			fn =sn;
			sn = next;
		}
	}

}
