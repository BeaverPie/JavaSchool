import java.util.Scanner;
public class Exercise3 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("What grade did you get?");
		int Grade = scan.nextInt();
		
		if (Grade == 12) {
			System.out.println("Your grade is A");
		}
		
		else if(Grade == 10) {
			System.out.println("Your grade is B");	
		}
		else if(Grade == 7) {
			System.out.println("Your grade is C");
		}
		else if(Grade == 4) {
			System.out.println("Your grade is D");
		}
		else if(Grade == 2) {
			System.out.println("Your grade is E");
		}
		else if(Grade == 0) {
			System.out.println("Your grade is Fx");
		}
		else if(Grade == -3) {
			System.out.println("Your grade is F");
		}
		
	
	
	}
}
