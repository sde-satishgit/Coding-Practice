package com.logic.build.javaCodingInterviewQuestions;

import java.util.Arrays;

public class MedianArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4};
		
		double findMedianOfArray = findMedianOfArray(arr);
		
		System.out.println("Median = " + findMedianOfArray);
 		

	}

	private static double findMedianOfArray(int arr[]) {
		
		Arrays.sort(arr);
		int length = arr.length;
		
		if(length%2==1) {
			return arr[length/2];
		}else {
			
			return (arr[length/2] +arr[(length/2) -1])/2.0;
		}
		
	}
}
