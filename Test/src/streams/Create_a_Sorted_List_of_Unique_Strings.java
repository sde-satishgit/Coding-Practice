package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Create_a_Sorted_List_of_Unique_Strings {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("banana", "apple", "apple", "cherry");
		
		List<String> collect = asList.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
