
public class Person {
	private String name;
	private String adress;
	private String birthday;
	private int Iq;
	
	
	public String toString() {
		return name + birthday + adress;
	}
	public Person (String na, String bi, String ad)
	
	{
	name = na;
	birthday = bi;
	adress = ad;
	}
	
	public void getIq() {		
	}
	
	public void setIq(int iq) {
		}
	
	public void setName(String na) {
	}
	
	public void setBirthday(String bi)
	{
		birthday = bi;
	}
	public void setAdress(String ad) {
	}
	
	public String getAdress(String ad) {
		return adress;
	}
	public String getBirthday()
	{
		return birthday;
	}
	public void getAge(int age) {	
	}
	public boolean equals(Person obj) {
		if(name == obj.name && adress == obj.adress && birthday == obj.birthday) {
			return true;
		}else return false;
	}
	public String getName() {
		return name;
		
	}
	}