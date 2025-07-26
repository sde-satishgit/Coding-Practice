package com.logic.build.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_the_Maximum_and_Minimum_Number_in_a_List {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		int max = list.stream().max(Integer :: compare).orElse(null);
		
		int min = list.stream().min(Integer :: compare).orElse(null);
		
		Long collect = list.stream().collect(Collectors.counting());
		
		
		
		System.out.println("collect "+ collect);
		
		System.out.println("max " + max);
		System.out.println("min " + min);
	}

}
