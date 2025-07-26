package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_a_List_of_Strings_to_Uppercase {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "stream", "api");
		
		list.stream().map(String :: toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

	}

}
