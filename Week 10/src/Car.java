
public class Car {
	
		
		String make;
		String model;
		String color;
		String licenseNumber;
		int year;
		
		public Car(String mk, String ml, String cl, String ln, int y) {
		make = mk;
		model = ml;
		color = cl;
		licenseNumber= ln;
		year= y;
			
			
		}
		
		public Car(String mk1, String cl1, String ml1, int y1) {
			
			make =mk1;
			color = cl1;
			model = ml1;
			year=y1;
			licenseNumber=null;
		}
		
		public String getMake() {
			return make;
		}
		public String getModel() {
			return model;
		}
		public String getColor() {
			return color;
		}
		public String getlicenseNumber(String ln) {
			return ln;
		}
		public int getYear() {
			return year;
		}
		public String setColor() {
			return color;
		}
		public String setlicenseNumber(String ln) {
			return ln;
		}
		
		public Car copy() {
			return new Car(make, model, color, licenseNumber, year);
		
		}
		public String toString() {
			return make + " " + model + " " + color + " " + licenseNumber + " " + year;
			
		}
		public boolean equals(Car obj) {
			if (make.equals(obj.make) && model.equals(obj.model) && color.equals(obj.color) && year == obj.year ) {
				return true;
			}else return false;
		}
		
		
}

