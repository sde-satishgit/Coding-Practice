package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_the_Maximum_Product_of_Any_Two_Elements {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 9);
		
		// done some changes to check peek function as it is used for debugging
		List<Integer> collect2 = asList.stream().peek(x -> System.out.println(x)).map(p -> p*2).collect(Collectors.toList());
		
		System.out.println(collect2);

		if (asList.size() < 2) {
			throw new IllegalArgumentException("At least two numbers are required");
		}

		List<Integer> collect = asList.stream().sorted().collect(Collectors.toList());

		int size = collect.size();

		int p1 = collect.get(size - 1) * collect.get(size - 2);
		int p2 = collect.get(0) * collect.get(1);

		int max = Math.max(p1, p2);

		System.out.println(max);
	}

}
