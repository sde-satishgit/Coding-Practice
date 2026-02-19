package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_Strings_by_Length {

	public static void main(String[] args) {
		
		Map<Integer, List<String>> collect = Arrays.asList("apple", "banana", "cherry", "date").stream()
		.collect(Collectors.groupingBy(String::length));
		
		System.out.println(collect);
	}

}
