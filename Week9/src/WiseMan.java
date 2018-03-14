
public class WiseMan {
	public static void main(String[]args) {
		
		double SquareBoard=(64);
		double Grains = 1;
		double TotalGrains=1;
		
		
		for (int i=0; i<64; i++) {
			Grains*=2;
			TotalGrains +=SquareBoard;
			System.out.println(Grains);
			
			
		}
	}
}
