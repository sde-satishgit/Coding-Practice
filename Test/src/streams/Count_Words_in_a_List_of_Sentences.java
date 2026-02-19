package streams;

import java.util.Arrays;
import java.util.List;

public class Count_Words_in_a_List_of_Sentences {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Java 8 is amazing", "Streams are powerful");
		
		// Below my code is not working giving 2 as output
		long count = asList.stream().map(e -> e.split("\\s+"))
		.filter(e -> e.length > 1).count();
		
		
		// gpt code
		
		long count2 = asList.stream().flatMap(sent -> Arrays.stream(sent.split("\\s+"))).count();
		System.out.println(count2);

		
		long wordCount = asList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .count();

        System.out.println(wordCount);
        
        long wordCount1 = asList.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .flatMap(s -> Arrays.stream(s.trim().split("\\s+")))
                .filter(word -> !word.isEmpty())
                .count();
        
        System.out.println(wordCount1);
        
        // ignore 8 because of its number
        long wordCount2 = asList.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .filter(word -> word.matches("[a-zA-Z]+"))
                .count();

        System.out.println(wordCount2);
	}

}
