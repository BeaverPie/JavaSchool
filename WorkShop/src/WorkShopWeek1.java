import java.util.Scanner;
public class WorkShopWeek1 {
	public static void main(String[]args) {
		
		Scanner src=new Scanner(System.in);
		System.out.println("please imput first variable");
		int a=src.nextInt();
		System.out.println("please imput second variable");
		int b=src.nextInt();
		
		System.out.println("first variable is = " + a);
		System.out.println("second variable is = " + b);
	
		System.out.println("Decide what happens next");
		
		int c=src.nextInt();
		if (c==0) {
			a=b;
	System.out.println("first value = " +a);
		}else if (c==1) {
			b=a;
			System.out.println(b);
		}
		}
	
	
	
	
	}
	

