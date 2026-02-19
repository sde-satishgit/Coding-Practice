package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_Numbers_by_Even_and_Odd {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		Map<String, List<Integer>> collect = asList.stream().collect(Collectors.groupingBy(e -> e % 2 ==0 ? "even":"odd"));
		
		System.out.println(collect);

	}

}
