
public class Payroll

{

	private String name;
	private double payrate;
	private double hoursworked;
	
	public String toString() {
		return name + hoursworked + payrate;
	}
	public Payroll(String na, Double pr, Double hw) {
		
		name = na; 
		payrate = pr; 
		hoursworked = hw;
	}
	
	
	public Payroll() {
		// TODO Auto-generated constructor stub
	}
	public void setname(String na) {
	name = na;
	
	}
	public void setpayrate(double pr) {
	payrate = pr;
	}
	
	public void sethoursworked(double hw) {
	hoursworked = hw;
	
	}
	
	public String getname() {
		return name;
	}
	public double getpayrate() {
		return payrate;
	}
	public double gethoursworked() {
		return hoursworked;
	}
	public double getgross(){
		return payrate * hoursworked;
	}

}

