package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;

public class SecondSmallestLargestNumber {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,33,5,66,70,44);
		
		Integer secondSmallest = integerList.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		
		Integer secondLargest = integerList.stream().distinct().sorted((a,b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);
		
		Integer orElse = integerList.stream().distinct().sorted((a,b) ->Integer.compare(b, a)).skip(1).findFirst().orElse(0);
		
		System.out.println("secondSmallest " + secondSmallest);
		
		System.out.println("secondLargest " + secondLargest);

	}

}
