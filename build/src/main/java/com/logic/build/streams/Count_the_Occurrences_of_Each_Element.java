package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_the_Occurrences_of_Each_Element {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		 // Count occurrences of each element using Streams and Collectors.groupingBy
        Map<String, Long> occurrences = asList.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Display the result
        occurrences.forEach((key, value) -> System.out.println(key + ": " + value));
	}

}
