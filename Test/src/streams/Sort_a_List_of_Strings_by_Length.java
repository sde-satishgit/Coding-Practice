package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_a_List_of_Strings_by_Length {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("apple", "banana", "kiwi", "cherry");
		List<String> collect = asList.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println(collect);

	}

}
