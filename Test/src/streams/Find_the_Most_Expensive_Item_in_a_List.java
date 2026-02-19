package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_the_Most_Expensive_Item_in_a_List {

	public static void main(String[] args) {
		
		List<Item> itemList = Arrays.asList(new Item("Item1", 100), new Item("Item2", 200), new Item("Item3", 50));
		
		Optional<Item> max = itemList.stream().max(Comparator.comparing(Item::getPrice));
		
		System.out.println(max.get().getItem());

	}

}
