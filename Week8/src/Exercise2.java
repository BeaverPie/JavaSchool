import java.util.Scanner;
public class Exercise2 {

	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("what is your gender?");
		String gender = scan.nextLine();
		
		
		System.out.println("What is your age?");
		int age = scan.nextInt();
		
		if (gender.charAt(0) == 'm' && age < 0) {
			System.out.println("Error in typed values");
		}
		
		if (gender.charAt(0) == 'f' && age < 0) {
			System.out.println("error in typed values");
		}
		
		if (gender.charAt(0) == 'm' && age < 18) {
			System.out.println("Boy");
		}
		else if (gender.charAt(0) == 'm' && age >= 18) {
			System.out.println("Man");
		}
		
		
		if (gender.charAt(0) == 'f' && age < 18) {
			System.out.println("Girl");
		}
		else if (gender.charAt(0) == 'f' && age >= 18 ) {
			System.out.println("Woman");
		}
	
	
	
	
	}
}
