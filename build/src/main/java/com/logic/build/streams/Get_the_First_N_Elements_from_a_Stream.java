package com.logic.build.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Get_the_First_N_Elements_from_a_Stream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Specify how many elements you want
        int N = 3;

        // Get the first N elements using Stream.limit
        List<String> firstNElements = list.stream()
            .limit(N)
            .collect(Collectors.toList());

        // Print the result
        System.out.println("First " + N + " elements: " + firstNElements);

	}

}
