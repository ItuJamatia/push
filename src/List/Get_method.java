package List;

import java.util.ArrayList;

//Q. How do you fetch data from arraylist based on index number?
// You can read the data from arraylist by using get method() or iterator.

public class Get_method {
public static void main(String[] args) {
	
	ArrayList <Integer>x= new ArrayList<>();
	x.add(10);
	x.add(20);
	x.add(new Integer(30));//boxing
	System.out.println(x);
	System.out.println(x.get(2));
	System.out.println(x.indexOf(2));// wrong 
}
}
