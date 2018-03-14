import java.util.Scanner;

public class Exercise4 {

	public static void main(String[]args) {
		Scanner scr = new Scanner(System.in);
		
		
		System.out.println("Please select the first number");
		int Nr1 = scr.nextInt();
		System.out.println("Please select the second number");
		int Nr2 = scr.nextInt();
		System.out.println("Please select the third number");
		int Nr3 = scr.nextInt();
		System.out.println("Please select the fourth number");
		int Nr4 = scr.nextInt();
		
		
		if (Nr1 < Nr2) {
			System.out.println(Nr1);
		}
		
		else if (Nr1 > Nr2){
			System.out.println(Nr2);
		}
		if (Nr1<Nr3) {
			System.out.println(Nr1);
		}
		else if(Nr3<Nr1) {
			System.out.println(Nr3);
		}
		if (Nr1 < Nr2) {
			System.out.println(Nr1+ " "+ Nr2);
		}
		else if (Nr1>Nr2) {
			System.out.println(Nr2+ " " +Nr1);
		}
		if (Nr1<Nr4) {
			System.out.println(Nr1);
		}
		else if(Nr1>Nr4) {
			System.out.println(Nr4);
		}
		if (Nr2<Nr3) {
			System.out.println(Nr2);
		}
		else if(Nr2>Nr3) {
			System.out.println(Nr3);
		}
		if (Nr2<Nr4) {
			System.out.println(Nr2);
		}
		else if(Nr2>Nr4) {
			System.out.println(Nr4);
		}
	}
}
