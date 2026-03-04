package streams;

import java.util.*;
//import java.util.List;
//import java.util.Map;
import java.util.stream.*;

public class Practise {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		List<String> strList = Arrays.asList("apple", "banana", "kiwi", "cherry");
		
		List<String> sorted = strList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		System.out.println(sorted);
	}

}
