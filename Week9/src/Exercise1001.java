import java.util.Scanner;
public class Exercise1001 {

		public static void main(String[]args) {
			
		
			char username;
			String password;
			String password2;
			
			Scanner src= new Scanner(System.in);
			System.out.println("Please select a username");
			username = src.nextLine().toUpperCase().charAt(0);
			
			
			System.out.println("Please imput a password");
			password = src.nextLine();
			
			System.out.println("Please repeat the password");
			password2 = src.nextLine();
			System.out.println(username);
		
			if (password.equals(password2)) {
				System.out.println("your password is correct");
			}
			else if ( !password.equals(password2)) {
				System.out.println("Your password is incorect");
			}
			
			
		}
}
