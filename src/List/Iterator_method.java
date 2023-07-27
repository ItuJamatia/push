package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_method {
public static void main(String[] args) {
	ArrayList <Integer>x= new ArrayList<Integer>();
	x.add(10);
	x.add(20);
	x.add(new Integer(30));//boxing
	System.out.println(x);
	
	Iterator itr= x.iterator();//without importing util package iterator cannot run
	while(itr.hasNext()) {
		System.out.println("Value of x is: " +itr.next());
	}
	
}
}
