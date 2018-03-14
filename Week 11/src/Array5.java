public class Array5 {
	public static void main(String[]args) {
		
		
		int plays[]= {3, 5, 1, 3, 3, 1, 4, 1, 3};
		double numberOfHits=0.0;
		double average;
		int HoleInOne=0;
		//adding number of hits + number of holes in one
		for (int i=0; i<plays.length; i++) 
		{
			numberOfHits += plays[i];
			if (plays[i]==1) 
			{
				HoleInOne += 1;
				
		}
		}
		System.out.println("The total number of hits is: " + numberOfHits);

		//making the average number of hits
		
		
		average = numberOfHits/plays.length;
		
		System.out.println("the average number of hits is: " + average);
		
		System.out.println("number of holes in one: " + HoleInOne);
			
		
		
		
		
		
	}
}
