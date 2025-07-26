package com.logic.build.javaCodingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Sort_an_Array_of_0s_1s_and_2s {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 1, 0, 2, 1 };
		System.out.println(arr.length);
		sortArray(arr);
		for (int i : arr) {
			System.out.print(i + ",");
		}

	}

	private static void sortArray(int[] arr) {

		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

		while (mid <= high) {

			switch (arr[mid]) {

			case 0:
				swap(arr, low, mid);
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				swap(arr, mid, high);
				high--;
				break;

			}
		}
		
	}

	private static void swap(int[] arr, int low, int mid) {
		int temp = arr[low];
		arr[low] = arr[mid];
		arr[mid] = temp;

	}

}
