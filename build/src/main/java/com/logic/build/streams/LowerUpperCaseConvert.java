package com.logic.build.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LowerUpperCaseConvert {

	public static void main(String[] args) {
	List<String> nameList = new ArrayList<>();
		
		nameList.add("Reeyansh");
		nameList.add("Satish");
		nameList.add("Shanaya");
		
		List<String> upparCase = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		List<String> lowerCase = nameList.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		upparCase.stream().forEach(System.out::println);
		
		lowerCase.stream().forEach(e -> System.out.println(e));
	}

}
