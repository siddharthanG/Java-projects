package mar1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sort = new LinkedList<String>();
		
		sort.add("John");
		sort.add("Pradeep");
		sort.add("Mary");
		sort.add("Ramya");
		List<String> sort1 = new LinkedList<String>();
		sort1.addAll(sort);
		System.out.println(sort1);
		Collections.sort(sort1);
		System.out.println(sort1);
	}

}
