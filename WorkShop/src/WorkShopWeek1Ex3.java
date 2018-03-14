import java.util.Scanner;
public class WorkShopWeek1Ex3 {
public static void main(String[]args) {

	
	Scanner src=new Scanner(System.in);
	System.out.println("please imput 10 variables");
	int a=src.nextInt();
	int b=src.nextInt();
	int c=src.nextInt();
	int d=src.nextInt();
	int e=src.nextInt();
	int A=src.nextInt();
	int B=src.nextInt();
	int C=src.nextInt();
	int D=src.nextInt();
	int E=src.nextInt();
	
	int Result=a+b+c+d+e+A+B+C+D+E;
	System.out.println(Result/10);
	if (Result<0) {
		System.out.println("Average is impossible");
	}


}
}