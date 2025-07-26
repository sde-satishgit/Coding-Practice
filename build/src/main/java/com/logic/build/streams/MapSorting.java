package com.logic.build.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSorting {

	public static void main(String[] args) {

		String s = "Java is simple and Java is secure";

		String[] split = s.split(" ");

		List<String> list = new ArrayList<>();
		for (String s1 : split) {
			list.add(s1);
		}

		// Count of key and value
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);

		// Ascending Order

		collect.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getKey() + " :" + entry.getValue()));

		// Descending Order

		collect.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEach(entry -> System.out.println(entry.getKey() + " :" + entry.getValue()));

		// Preserv sorted map

		LinkedHashMap<String, Long> collect2 = collect.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(collect2);
	}

}
