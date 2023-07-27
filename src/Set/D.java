package Set;
import java.util.TreeSet;

//TreeSet- It sorts the data in ascending order and store it.
//It contains only unique elements.

public class D {
public static void main(String[] args) {
	
	TreeSet<Integer> treeset= new TreeSet<>();
	treeset.add(33);
	treeset.add(100);
	treeset.add(10);
	treeset.add(20);
	System.out.println(treeset);//[10, 20, 33, 100]
}								//It sorts the data in ascending order
}
