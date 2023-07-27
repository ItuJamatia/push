package collection_Example;

public class Employee {

	private String firstName;		//Encapsulation- we make variables private so that direct interaction
	private String lastName;		//is not allowed and to interact with these variables	
	private int id;					// we develop publicly define setters and getters
	
	Employee(String firstName, String lastName, int id){
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
