import java.util.Scanner;
public class WorkShopWeek1Ex4 {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		
		
		double top=1.0;
		
		double result = 0.0;
		
		
		System.out.println("please select a number");
		int n=src.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			result += top/(Math.pow(2, n));
			System.out.println(result);
			
		}
		
		
		
	}
}
