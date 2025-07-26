package com.logic.build.streams;

import java.util.ArrayList;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(0);
		intList.add(5);
		intList.add(9);
		intList.add(7);
		intList.add(2);
		
		
		Integer min = intList.stream().min(Integer::compare).orElse(null);
		
		Integer max = intList.stream().max(Integer::compare).orElse(null);
		
		System.out.println("min "+min);
		System.out.println("max "+max);
	}

}
