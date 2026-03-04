package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Arcelor_Mittal_Interview_Code {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("raj", 100);
		map1.put("avi", 200);
		map1.put("sat", 300);
		map1.put("kun", 400);
		Map<String, Double> map2 = new HashMap<>();
		map2.put("raj", 55655.0);
		map2.put("avi", 4465.0);
		map2.put("sat", 666.0);
		map2.put("kun", 7765.0);

		Map<String, Double> collect = map2.entrySet().stream()
			.sorted(Map.Entry.<String, Double>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		//System.out.println(collect);
		
		collect.forEach((key, value1) -> {
		    Integer value2 = map1.get(key);
		    if (value2 != null) {
		        System.out.println(value2 + "," + value1);
		    }
		});

	}

}
