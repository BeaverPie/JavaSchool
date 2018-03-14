import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
		
		int array[]=new int[5];
		double average=0;
		double total;
		
		Scanner src=new Scanner(System.in);
		System.out.println("Select 5 numbers");
		array[0] = src.nextInt();
		array[1] = src.nextInt();
		array[2] = src.nextInt();
		array[3] = src.nextInt();
		array[4] = src.nextInt();
		
		for(int i=0; i<array.length; i++) {
			average += array[i];
	
		}
		total = average/array.length;
		System.out.println(total);
	}
}
