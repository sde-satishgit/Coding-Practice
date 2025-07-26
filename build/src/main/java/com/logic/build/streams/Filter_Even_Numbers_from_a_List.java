package com.logic.build.streams;

import java.util.ArrayList;
import java.util.List;

public class Filter_Even_Numbers_from_a_List {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		list.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
	}

}
