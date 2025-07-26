package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;

public class Find_the_Sum_of_All_Even_Numbers {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		int sum = list.stream().filter(e -> e%2 !=0).mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
		
		

	}

}
