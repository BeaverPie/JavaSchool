import java.util.Scanner;
public class Power {
public static void main(String[]args) {
	
	Scanner src= new Scanner(System.in);
	
	
	System.out.println("Imput a positive number");
	double x=src.nextDouble();
	if (x<0) {
		System.out.println("Please imput a positive number");
	} else if(x<0) {
		System.out.println("Please imput a positive number!");
	}
	
	
	System.out.println("Imput a positive number");
	int n=src.nextInt()	;
	double pwr=1;
	
	if (n>0 && x>0) {
		pwr =x*n;
		
		
		System.out.println(pwr);
	}else {
		System.out.println("imput positive numbers");
	}
	

}
}
