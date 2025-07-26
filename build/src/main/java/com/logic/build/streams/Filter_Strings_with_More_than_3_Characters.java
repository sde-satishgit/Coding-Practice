package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Strings_with_More_than_3_Characters {

	public static void main(String[] args) {
		
		 // Sample list of strings
        List<String> list = Arrays.asList("apple", "cat", "dog", "elephant", "bat", "hi");

        // Filter strings with more than 3 characters using Stream.filter
        List<String> filteredList = list.stream()
            .filter(s -> s.length() > 3)
            .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Strings with more than 3 characters: " + filteredList);

	}

}
