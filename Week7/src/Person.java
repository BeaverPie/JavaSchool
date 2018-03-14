
public class Person {
	private String name;
	private String birthday;

	
	public String toString() {
		return name + birthday;
	}
	public Person (String na, String bi)
	
	{
	name = na;
	birthday = bi;
	}
	
	
	public void setName(String na) {
	}

	public void setBirthday(String bi)
	{
		birthday = bi;
	}
	public String getBirthday()
	{
		return birthday;
	}
	public String getName() {
		return name;
		
	}
	}