package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;

public class Check_if_All_Elements_in_a_List_are_Positive {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		
		boolean allMatch = list.stream().allMatch(num -> num > 0);
		System.out.println(allMatch);

	}

}
