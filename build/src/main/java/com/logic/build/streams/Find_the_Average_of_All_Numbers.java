package com.logic.build.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Find_the_Average_of_All_Numbers {

	public static void main(String[] args) {
	
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(21);
		integerList.add(40);
		integerList.add(11);
		integerList.add(30);
		
		OptionalDouble average = integerList.stream().filter(e -> e%2 == 0).mapToInt(Integer::intValue).average();
	
		if(average.isPresent() && !average.isEmpty()) {
			System.out.println("average " + average.getAsDouble());
		}
		
	

	}

}
