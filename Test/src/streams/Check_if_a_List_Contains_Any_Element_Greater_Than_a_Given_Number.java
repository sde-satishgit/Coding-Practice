package streams;

import java.util.Arrays;
import java.util.List;

public class Check_if_a_List_Contains_Any_Element_Greater_Than_a_Given_Number {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 5, 10, 20);
		
		boolean anyMatch = asList.stream().anyMatch(e -> e > 15);
		
		System.out.println(anyMatch);
		

	}

}
