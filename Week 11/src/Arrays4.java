import java.util.Scanner;
public class Arrays4 {
	public static void main(String[]args) {
		
		Scanner src=new Scanner(System.in);
		
		int array[]= new int[4];
		
		
		System.out.println("please imput 4 numbers");
		array[0]=src.nextInt();
		array[1]=src.nextInt();
		array[2]=src.nextInt();
		array[3]=src.nextInt();
		
		int array2[]=new int[4];
		
		System.out.println("please imput 4 more numbers");
		array2[0]=src.nextInt();
		array2[1]=src.nextInt();
		array2[2]=src.nextInt();
		array2[3]=src.nextInt();
		
		
		int array3[]=new int[4];
		//array3[0]=array[0] + array2[0];
		//array3[1]=array[1] + array2[1];
		//array3[2]=array[2] + array2[2];
		//array3[3]=array[3] + array2[3];
		
		for (int i=0; i<array.length; i++) {
			array3[i]=array[i] + array2[i];
			System.out.println(array3[i]);
		}
		
		
		
		//boolean arraysEquals=true;
		//if (array.length != array2.length)
		//	arraysEquals = false;
		//else 
		//{
		//	for(int i=0; i<array.length; i ++) 
		//	{
		//		if ( array[i] != array2[i]) 
		//		{
		//			arraysEquals=false;
		//			break;
		//		}
		//	}
				
		//if (arraysEquals) {
			//System.out.println("the arrays are equal");
		//}
		//else
		//{
		//	System.out.println("the arrays are not equal");
		//}
		//}
		
		
		
		
		
		
		
	}
}
