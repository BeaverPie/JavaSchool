import java.util.Scanner;
public class olleh {
public static void main(String[]args) {
	
	
	
	Scanner src= new Scanner(System.in);
	System.out.println("enter something");
	String hello = src.nextLine();
	
	
	System.out.println(hello.length());
	String Str="";

	for (int i = hello.length()-1; i >= 0; i--) {
	Str += hello.charAt(i);
}

System.out.println(Str);

}
}
