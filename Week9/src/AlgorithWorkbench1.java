import java.util.Scanner;
public class AlgorithWorkbench1 {
	public static void main(String[]args) {
		
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Imput a number please");
		int a=src.nextInt();
		
		
		while(a<=100) {
			System.out.println(a);
			a = a+10;
			
		}
		
		
	}
}
