package com.logic.build.javaCodingInterviewQuestions;

public class BubbleSort {

	public static void main(String[] args) {
	
		int arr[] = {33,44,55,11,89,70,44,909,2,1100};
		
		int arr1[] = bubbleSort(arr);
		
		System.out.println(arr1);
		for(int r:arr1) {
			System.out.println(r);
		}
	}

	private static int[] bubbleSort(int[] arr) {
		
		int n = arr.length-1;
		
		while(n>=1) {
		for(int i=0;i<n;i++) {
			
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		n--;
		}
		
	 return arr;
	}

}
