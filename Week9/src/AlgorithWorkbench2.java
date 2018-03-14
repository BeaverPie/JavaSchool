import java.util.Scanner;

public class AlgorithWorkbench2 {
	public static void main (String[]args) {
		
		Scanner src=new Scanner(System.in);
			int choice;
		do {
			System.out.println("enter first number");
		int a=src.nextInt();
		System.out.println("enter second number");
		int b=src.nextInt();
		System.out.println("sum is = "+ (a+b));
		System.out.println("would you like to repeat the process?Press 0 to run it again or 1 to stop");
		choice=src.nextInt();
		}while(choice == 0);
		System.out.println("you left");
			
			
		}

}


