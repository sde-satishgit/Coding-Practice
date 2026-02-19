package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten_a_List_of_Lists {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 2, 3);
		List<Integer> asList2 = Arrays.asList(4,5);
		List<Integer> asList3 = Arrays.asList(5,6);
		
		List<List<Integer>> mergedList = new ArrayList<>();
		mergedList.add(asList);
		mergedList.add(asList2);
		mergedList.add(asList3);
		
		mergedList.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(e -> System.out.print(e + " "));;
		
		

	}

}
