package collection_Example;

import java.util.LinkedList;

public class A {
public static void main(String[] args) {
	
	Employee arun= new Employee("Arun","Kumar",100);
	Employee ravi= new Employee("Ravi","Joshi",101);
	Employee santosh= new Employee("Santosh","Pujari",102);
	
	LinkedList<Employee>empdetails= new LinkedList<Employee>();
	empdetails.add(arun);
	empdetails.add(ravi);
	empdetails.add(santosh);
	System.out.println(empdetails);
	for(Employee e:empdetails) {
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getId());
	}
}
}
