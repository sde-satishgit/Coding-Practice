package com.logic.build.javaCodingInterviewQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Find_the_Majority_Element {

	public static void main(String[] args) {

		int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4, 3, 3, 3, 3, 3 };

		int key = checkMajority(arr);

		System.out.println(key);

	}

	private static int checkMajority(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				int integer = map.get(arr[i]);
				map.put(arr[i], ++integer);
			} else {
				map.put(arr[i], 1);
			}
		}

		int max = Collections.max(map.values());

		int key = 0;
		for (Entry<Integer, Integer> entrySet : map.entrySet()) {

			if (entrySet.getValue() == max) {
				key = entrySet.getKey();
			}
		}
		return key;
	}

}
