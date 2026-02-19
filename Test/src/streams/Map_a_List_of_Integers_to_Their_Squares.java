package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_a_List_of_Integers_to_Their_Squares {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		
		asList.stream().mapToInt(n -> n*n).forEach(e -> System.out.println(e));
		
		List<Integer> collect = asList.stream().map(n -> n*n).collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
