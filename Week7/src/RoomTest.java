
public class RoomTest {
	public static void main(String[]args) {
		
		
		Room info = new Room("AD" , "second", 19, true, 210);
		Person employee = new Person("273891", "12 day");
		Room info1 = new Room("gd", "third", 15, false, 350);
		Person employee2 = new Person("000", "several months");
		
		
		System.out.println(info);
		System.out.println(employee);
		System.out.println(employee2);
	}
}
