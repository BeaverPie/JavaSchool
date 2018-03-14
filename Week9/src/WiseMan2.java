
public class WiseMan2 {
public static void main(String[]args) {
	
	double Squares = (64);
	double Grain = 1;
	double TotalGrains= 1;
	
	for (int i=2; i <=64; i++) {
		Grain*=2;
		TotalGrains+=Grain;
	}

	System.out.println(TotalGrains);
}

}
