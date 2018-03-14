
public class Name {
	
	public String firstName;
	public String lastName;
	
	public Name (String fN, String lN) {
		firstName=fN;
		lastName=lN;
	}

	public String getFirstName() {
		return firstName;	
		}
	public String getLastName() {
		return lastName;	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return firstName + lastName;
	}
	
	public Name copy() {
		return new Name(firstName, lastName);
	}
	
	public boolean equals(Object obj) {
	if (!(obj instanceof Name)) {
		return false;
	}
	Name instance = (Name) obj;
	if (firstName.equals(instance.firstName)) {
		return true;
	}
		if (lastName.equals(instance.lastName)) {
			return true;
		}
		else return false;

}
	}
