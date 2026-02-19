package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate_Multiple_Strings_in_a_List {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Java", "is", "fun");
		
		String collect = asList.stream().collect(Collectors.joining());
		
		System.out.println(collect);

	}

}
