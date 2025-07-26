package com.logic.build.streams;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenOddNumber {

	public static void main(String[] args) {
	
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(21);
		integerList.add(40);
		integerList.add(11);
		integerList.add(30);
		
		int even = integerList.stream().filter(e -> e%2 == 0).mapToInt(Integer::intValue).sum();
		int odd = integerList.stream().filter(e -> e%2 != 0).mapToInt(Integer::intValue).sum();
		
		System.out.println("even "+ even);
		System.out.println("odd "+ odd);

	}

}
