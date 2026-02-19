package streams;

import java.util.Arrays;
import java.util.List;

public class Sum_the_Length_of_All_Strings_in_a_List {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Java", "is", "fun");

		long count = asList.stream().map(e -> e.length()).mapToInt(Integer::intValue).sum();
		System.out.println(count);

		// gpt code

		int totalLength = asList.stream().mapToInt(String::length).sum();

		System.out.println("Total length: " + totalLength);

	}

}
