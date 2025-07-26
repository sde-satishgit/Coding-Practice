package com.logic.build.javaCodingInterviewQuestions;

public class Find_Missing_Number_in_Array {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6};
		
		int number = 6;
		
		int sumOfOnetoN = (number*(number+1))/2;
		
		int sum=0;
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			sum+=arr[i];
		}

		System.out.println("sumOfOnetoN  "+sumOfOnetoN);
		System.out.println("sum  "+sum);
		int numb = sumOfOnetoN-sum;
		
		System.out.println("missing number "+numb);
	}

}
