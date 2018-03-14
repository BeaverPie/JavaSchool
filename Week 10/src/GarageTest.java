
public class GarageTest {
public static void main(String[]args) {
	
	
	Garage gr=new Garage();
	
	Car nw=new Car("fh", "hj", "hj", 56);
	
	Car ne=new Car( "mitsubishi", "lancer", "blue", "XN 193", 98);
	gr.park(nw, 1);
	gr.park(ne, 2);
	
	System.out.println(gr);
	
	
	
	
	
	
}
}
