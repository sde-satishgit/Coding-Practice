package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_a_List_of_Objects_to_a_List_of_Their_Property_Values {

	public static void main(String[] args) {
		
		List<Person> person= Arrays.asList(new Person("Alice", 30),new Person("Bob", 25), new Person("Charlie", 35));
		
		List<String> collect = person.stream().map(Person::getName).collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
