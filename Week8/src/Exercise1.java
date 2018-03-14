import java.util.Scanner;
public class Exercise1 {

	
	public static void main(String[]args) {
	Scanner name = new Scanner(System.in);

	
	
	
	
	System.out.println("what is your age?");
	int age = name.nextInt();
	
	if(age < 0) {
		System.out.println("Error in age value");	
	}
	
	else if(age <= 12) {
		System.out.println("Child");
	}
	
	
	else if(age >= 13 && age <=19) {
		System.out.println("Teenager");
	}
	
	else if(age >= 20 && age < 65) {
		System.out.println("adult");
	}

	else if(age >=65) {
		System.out.println("Senior Citizen");
	}
	
	}
}
