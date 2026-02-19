package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_a_List_of_Integers_to_a_Map_of_Integer_to_Its_Square {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		
		Map<Integer, Integer> collect = asList.stream().collect(Collectors.toMap(e -> e, e1 -> e1*e1));
		
		System.out.println(collect);

	}

}
