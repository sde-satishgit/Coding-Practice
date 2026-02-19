package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition_List_Based_on_a_Predicate {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);
		
	//	Output:		{false=[1, 3, 5], true=[2, 4, 6]}

		Map<Boolean, List<Integer>> collect = asList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
		
		
		System.out.println(collect);
		

	}

}
