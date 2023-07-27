package List;
import java.util.ArrayList;
//List is an interface and ArrayList, LinkedList, Vector is a java class.
public class ArrayListExample_1 {
public static void main(String[] args) {
	ArrayList x= new ArrayList();
	x.add(10);
	x.add(20);
	x.add(new Integer(30));//boxing
	System.out.println(x);
	
	x.add(true);		//heterogeneous data can also be stored in arraylist
	x.add("Motu");
	x.add(11.33);
	System.out.println(x);
	
}
}
