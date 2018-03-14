
public class Arrays2 {
	public static void main(String[]args) {
		int [] sourceArray= {1,2,3,4,5,6,7,8,9,10};
		int [] destinationArray= new int[sourceArray.length*2];
		
		
		//int [] destinationArray=new int[sourceArray.length];
		
		for (int i=0; i < sourceArray.length; i++) 
		{
			destinationArray [i] = sourceArray[i];
			
			//destinationArray[i] = sourceArray[i];
			
		}
		
		for (int i =0; i<destinationArray.length; i++) {
			System.out.println(destinationArray[i]);
		}
	}
}
