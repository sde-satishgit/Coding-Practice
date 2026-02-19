package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Combine_Two_Lists_into_a_Map {

	public static void main(String[] args) {
		
		List<String> keys = Arrays.asList("a", "b", "c");
		List<Integer> values = Arrays.asList(1, 2, 3);

		Map<String, Integer> collect = IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(keys::get, values::get));
		
		System.out.println(collect);
	}

}
