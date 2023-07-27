package List;

//NOTE: Java collection concept comes by default with the implementation
//of doubly linked list.

import java.util.LinkedList;
import java.util.List;

public class LinkedList_addFirst_addLast {
public static void main(String[] args) {
	
	LinkedList<Integer> x= new LinkedList <Integer>();
	x.add(10);
	x.addFirst(20);
	x.addLast(30);
	x.add(2, 40);
	x.addLast(50);
	System.out.println(x);
	LinkedList <Integer> y= new LinkedList<Integer>();
	y.add(500);
	y.addFirst(600);
	x.addAll(4,y);
	System.out.println(x);
	
}
}
