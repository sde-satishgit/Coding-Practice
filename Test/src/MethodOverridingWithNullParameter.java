import java.util.ArrayList;
import java.util.HashMap;

public class MethodOverridingWithNullParameter {

	public void get(int a) {
		System.out.println(a);
	}
	
	public void get(Object a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingWithNullParameter meth =new MethodOverridingWithNullParameter();
		meth.get(null);
		HashMap<String,String> map = new HashMap<>();
	//	map.put(null, "test");
	//	System.out.println(map.get(null));
		
		ArrayList<Integer> list = new ArrayList<>(2);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		}

}
