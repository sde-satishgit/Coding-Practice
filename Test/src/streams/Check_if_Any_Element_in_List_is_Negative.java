package streams;

import java.util.Arrays;
import java.util.List;

public class Check_if_Any_Element_in_List_is_Negative {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		
		// my code
		long count = asList.stream().filter(e -> e < 0).count();
		if (count > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		boolean anyMatch = asList.stream().anyMatch(e -> e < 0);
		System.out.println(anyMatch);
	}

}
