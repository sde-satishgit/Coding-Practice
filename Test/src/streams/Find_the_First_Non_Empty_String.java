package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_the_First_Non_Empty_String {

	public static void main(String[] args) {
	
		List<String> asList = Arrays.asList(null, " ", "","apple", "banana");
		
		// Below is my code

		Optional<String> first = asList.stream().filter(e -> (e != null && e.trim().length() !=0)).findFirst();
		
		first.ifPresent(System.out::println);
		
		// Below is gpt code
		
		Optional<String> firstNonEmpty = asList.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .findFirst();

        firstNonEmpty.ifPresent(System.out::println);
	}

}
