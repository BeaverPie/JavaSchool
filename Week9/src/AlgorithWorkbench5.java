
public class AlgorithWorkbench5 {
	public static void main(String[]args) {
		
		double numerator;
		double denominator=30.0;
		double total=0;
		for ( numerator=1.0; numerator<=30; numerator++) {
			double sum = numerator/denominator;
			total = total+ sum;
		
			denominator--;
			System.out.println(total);
			
	//System.out.println("Total sum: " + total);
			}
	}
	
	}


