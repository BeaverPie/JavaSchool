
public class Job {

	public String title;
	public double salary;
	public String employee;

	
	

	public Job(String ti, double sl, String ep) {
		title = ti;
		salary = sl;
		employee = ep;

	}
	public String toString() {
		return title + " " + salary + " " + employee;

	}

	 
	public void setTitle(String ti) {
		title = ti;
	}

	public void setSalary(double sl) {
		salary = sl;
	}

	public void setEmployee(String ep) {
		employee = ep;

	}

	public String getTitle() {
		return title;
	}

	public double getSalary() {
		return salary;
	}

	public String getEmployee() {
		return employee;
	}

}
