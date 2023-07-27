package Set;
import java.util.HashMap;
import java.util.Map;
//Map is an interface.

//HashMap- HashMap internally uses hashtable and hashing technique.
//It stores the data as key value pair.
//HashMap is not synchronized and hence performance is better than hashtable.

public class E {
public static void main(String[] args) {
	
	Map<Integer,String> studentInfo= new HashMap<>();
	studentInfo.put(100, "Sonam");
	studentInfo.put(101, "Rahul");
	studentInfo.put(102, "Veer");
	System.out.println(studentInfo);	//{100=Sonam, 101=Rahul, 102=Veer}
	System.out.println(studentInfo.get(101));	//Rahul
	System.out.println(studentInfo.keySet());	//[100, 101, 102]
	System.out.println(studentInfo.values());	//[Sonam, Rahul, Veer]
}
}
