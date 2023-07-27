package List;
import java.util.ArrayList;
public class ArrayListExample_2 {
public static void main(String[] args) {
	ArrayList <Integer>x= new ArrayList<>();
	x.add(10);
	x.add(20);
	x.add(new Integer(30));//boxing
	System.out.println(x);
	x.add(1, 700);
	System.out.println(x);
	ArrayList <Integer>y=new ArrayList<Integer>();
	y.add(300);
	y.add(500);
	x.addAll(2,y);
	System.out.println(x);
	if(x.contains(300)) {
	System.out.println("Yes present");
	}else {
		System.out.println("Not present");
	}
	x.remove(1);
	System.out.println(x);
}
}
