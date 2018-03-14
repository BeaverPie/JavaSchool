
public class CourseTest {
	public static void main(String[]args) {
		
		Course info = new Course("Mihai", 20, true );
		
		Course info2 = new Course("something", 15, false);
		
		Course info3 = new Course("moresomething", 25, true);

		
		System.out.println(info);
		System.out.println(info2);
		System.out.println(info3);
		
	}
}
