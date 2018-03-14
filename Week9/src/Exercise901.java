import java.util.Scanner;
public class Exercise901 {

	
	public static void main(String[]args) {
		
	Scanner src= new Scanner(System.in);
	System.out.println("please imput a number");
		
	
	
	int n;
	n = src.nextInt();
		for (int i = 0; i <=n; i++)
		{
			System.out.print((i+ " " ));
		}
		System.out.println();
		
		n=src.nextInt();
		for (int i= 2; i<=2*n; i=i+2)
		{
			System.out.print((i + " "));
		}
		
		System.out.println();
		
		n = src.nextInt();
		for (int i = 1; i <= n; i++)
		{
			System.out.println((i*i + " "));
		}
		System.out.println();
		}
}
