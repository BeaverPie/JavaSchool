import java.util.Scanner;
public class PgChallengepg370 {
	public static void main(String[]args) {
		
		Scanner src=new Scanner(System.in);
		System.out.println("please select a number");
		int a=src.nextInt();
		
		
		
		for (int b=0; b<a; b++ ) {
			int sum = b+b;
			
			System.out.println(sum);
		}
		
	}
}
