package com.logic.build.javaCodingInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_the_Common_Elements_in_Three_Sorted_Arrays {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 10, 20, 40, 80 }, arr1[] = { 6, 7, 10, 20, 80, 100 },
				arr2[] = { 3, 4, 10, 20, 70, 80, 120 };

		Object arr3[] = getCommonNumbersFromArrays(arr, arr1, arr2);
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}
	}

	private static Object[] getCommonNumbersFromArrays(int[] arr, int[] arr1, int[] arr2) {

		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		for (int i = 0; i < arr1.length; i++) {

			if (list.contains(arr1[i])) {
				list1.add(arr1[i]);
			}
		}

		for (int i = 0; i < arr2.length; i++) {

			if (list1.contains(arr2[i])) {
				list2.add(arr2[i]);
			}
		}

		
		return list2.toArray();
	}

}
