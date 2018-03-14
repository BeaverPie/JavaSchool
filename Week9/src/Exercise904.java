
public class Exercise904 {
	public static void main(String[] args) {
		
		int n=0;
		int n1=1;
		int temp;
		
		for (int i =0; i <=20; i += 1)
		{
			temp=n;
			n=n1;
			n1 = temp + n1;
			System.out.println( n);
			
		}
		
	}
}
