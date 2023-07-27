package Set;
import java.util.HashSet;

//Set- set is an interface. Set- HashSet and TreeSet

//HashSet- HashSet is a class. It uses hashtable and hashing technique internally.
//It contains only unique elements. It is not synchronized.
//This class permits null element.
//Insertion order is not maintained.
public class A {
public static void main(String[] args) {
	HashSet <Integer> hashset=new HashSet<>();		//<Integer> --- called as generic
	hashset.add(20);
	hashset.add(30);
	hashset.add(40);
	hashset.add(50);
	hashset.add(null);	//permits null element.
	System.out.println(hashset); //output- [null,50,20,40,30]
}								//Insertion order is not maintained.
}
