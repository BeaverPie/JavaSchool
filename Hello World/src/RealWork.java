import java.util.Scanner;
public class RealWork {
	
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		
		System.out.println("please imput your number of hours:");
		int hours = src.nextInt();
		
		double grossPay, payRate = 25.0;
		double overPay = 0.50;
		grossPay= hours* payRate;
		System.out.println("your gross pay is:" + grossPay + "$");
	if (hours>40) {
		System.out.println(grossPay*overPay);
	}
		
			
		}
	}

