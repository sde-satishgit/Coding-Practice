package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate_All_Strings_in_a_List {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Hello", "world", "this", "is", "Java");
		
		StringBuffer sb = new StringBuffer();
		
		// Below my code is not working
		String string = asList.stream().map(e -> sb.append(e)).toString();
		
		// gpt code
		
		String collect = asList.stream().collect(Collectors.joining(" "));
		System.out.println(collect);

	}

}
