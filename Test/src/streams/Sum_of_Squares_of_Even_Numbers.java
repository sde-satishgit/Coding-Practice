package streams;

import java.util.Arrays;
import java.util.List;

public class Sum_of_Squares_of_Even_Numbers {

	public static void main(String[] args) {
	
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);

		int sum = asList.stream().filter(n -> n%2 == 0)
		.mapToInt(n -> n*n)
		.sum();
		
		System.out.println(sum);
	}

}
