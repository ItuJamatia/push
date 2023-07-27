package Set;
import java.util.Hashtable;

//Hashtable- Hashtable is an associated array wherein values are stored as a key value pair.
//Initial size of hashtable is 16. It increase by double of its size when the table is filled by 75%.
//Hashtable is synchronized and hence performance is poor.

public class B {
public static void main(String[] args) {
	
	Hashtable<Integer, String> hashtable= new Hashtable<>();
	hashtable.put(100, "Adam");
	hashtable.put(101, "Smith");
	hashtable.put(102, "Sam");
	System.out.println(hashtable);
}
}
