package com.logic.build.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromList {

	public static void main(String[] args) {
		

		List<String> nameList = new ArrayList<>();
		
		nameList.add("Reeyansh");
		nameList.add("Satish");
		nameList.add("Shanaya");
		
		List<String> collect = nameList.stream().distinct().collect(Collectors.toList());
		
		collect.stream().forEach( e -> System.out.println(e));
		collect.stream().forEach(System.out::println);
	}

}
