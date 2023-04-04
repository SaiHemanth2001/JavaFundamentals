import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulatingCollections {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("clare");
		list1.add("neharai");
		list1.add("wolf");
		list1.add("taylor");
		list1.add("selena");
		
		for (String a : list1){
			System.out.println(a);
		}
		Collections.sort(list1);
		
		for (String a : list1){
			System.out.println(a);
		}
		
	}

}
