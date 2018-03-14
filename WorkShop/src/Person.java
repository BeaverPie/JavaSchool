
public class Person {

	
	public char gender;
	private Name name;
	
	public Person(char gender, Name name) {
		this.name = name.copy();
		gender = gender.copy();
		
		}
	
	public void setName(Name name) {
		this.name = name.copy();
	}
	
	public void setName(String firstName, String lastName) {
		name = new Name(firstName, lastName);
	}
	
	//public String getName() {
		
	
	
	



}

