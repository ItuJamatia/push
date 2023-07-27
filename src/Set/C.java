package Set;

import java.util.LinkedHashSet;

//LinkedHashSet- It maintains insertion order and cannot contain duplicate elements.
//It can take null values.

public class C {
public static void main(String[] args) {
	
	LinkedHashSet<Integer> LinkedHashSet= new LinkedHashSet<>();
	LinkedHashSet.add(10);
	LinkedHashSet.add(20);
	LinkedHashSet.add(100);
	LinkedHashSet.add(80);
	LinkedHashSet.add(null);
	System.out.println(LinkedHashSet);		//[10, 20, 100, 80, null]
}										//It maintains insertion order
}
