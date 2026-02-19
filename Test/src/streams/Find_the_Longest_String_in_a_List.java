package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_the_Longest_String_in_a_List {

	public static void main(String[] args) {
		
		
		List<String> asList = Arrays.asList("apple", "banana", "kiwi", "cherry");
		
		Optional<String> max = asList.stream().max((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		max.ifPresent(System.out::println);
	}

}
