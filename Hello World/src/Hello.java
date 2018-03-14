
import java.util.Scanner;
public class Hello  {
	
	public static void main (String [] args) 
	{
		
		int a;
		int b;
		int c;
	
		@SuppressWarnings("resource")
		Scanner bronz= new Scanner (System.in);
		System.out.println("declare A, a=?");
        a = bronz.nextInt();
        System.out.print("declare B, b=?");
        b = bronz.nextInt();
        System.out.println("declare C. c=?");
        c = bronz.nextInt();
		
		
	if (a+b ==c) {
		
		System.out.println("Hello world");
	}
	
	else System.out.print("fals");
	
	}

	
	

}
