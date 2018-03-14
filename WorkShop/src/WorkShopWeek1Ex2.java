import java.util.Scanner;
public class WorkShopWeek1Ex2 {
	public static void main(String[]args) {
		
		Scanner src=new Scanner(System.in);
		System.out.println("Please imput a factorial:");
		int n=src.nextInt();
		int count = 1;
	
		
			// for a. just change the operator from count *=//
		for (int i=1; i<=n; i++) {
		count += i;
		}
		System.out.println(count);
		
	
	
	}
}
