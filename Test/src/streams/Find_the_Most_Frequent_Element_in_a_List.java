package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_the_Most_Frequent_Element_in_a_List {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		
		Integer orElse = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByKey()).map(Map.Entry::getKey).orElse(null);
		
		System.out.println(orElse);
		
		
	}

}
