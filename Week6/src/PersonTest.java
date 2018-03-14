
public class PersonTest {

	public static void main(String[]args) {
		
		Person rect = new Person("mihai" , "11.05.1992", "Adress");
	rect.setName("mihai");
	rect.setBirthday("11/05/1992");
	rect.setAdress("adress");
	
	System.out.println(rect.getName());
	System.out.println(rect.getBirthday());
	
	
	}
}
