package com.logic.build.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter210125 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(20);
		list.add(4);
		list.add(33);
		list.add(55);
		list.add(66);
		list.add(3);
		list.add(99);
		list.add(122);

		List<Integer> collect = list.stream().filter(number -> number % 2 == 0).filter(n -> n > 20)
				.collect(Collectors.toList());
		
		//collect.stream().forEach(System.out::println);
		
		// Adding all integer 
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		//System.out.println(sum);
		
		//Ascending order
		
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		
		
		//sorted.stream().forEach(System.out::println);
		
		
		//Descending order
		
		List<Integer> descending = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		descending.stream().forEach(n -> System.out.println(n));

	}

}
