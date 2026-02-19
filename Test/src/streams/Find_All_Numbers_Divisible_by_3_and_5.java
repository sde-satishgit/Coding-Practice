package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_All_Numbers_Divisible_by_3_and_5 {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(15, 30, 45, 50, 60);
		
		List<Integer> collect = asList.stream().filter(e -> e%3==0 && e%5==0).collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
 