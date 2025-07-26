package com.logic.build.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_a_List_of_Integers_in_Descending_Order {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		
		Collections.sort(list,Comparator.reverseOrder());
		
		list.stream().forEach(System.out::println);
		
		/*
		 * int[] sorted = IntStream.of(a) .boxed() .sorted(Comparator.reverseOrder())
		 * .mapToInt(i -> i) .toArray();
		 */

	}

}
