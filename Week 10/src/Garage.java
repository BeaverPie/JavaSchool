
public class Garage {

	
	private Car spot1;
	private Car spot2;
	
	public Garage() {
		spot1=null;
		spot2=null;
	}
	
	
	public boolean isParkingAreaTaken(int position) {
		if (position ==1) 
		{
			if (spot1 !=null) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else if (position ==2) 
		{
			if (spot2 != null) 
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			return false;
		}
	}
	
	public void park(Car Car, int position) {
		if (position == 1 ) {
			if(spot1== null) {
				spot1 = Car;
			}
		}
		else if (position== 2) {
			if(spot2 == null) {
				spot2 = Car;
			}
		}
	}
	//A method leaveGarage(int position) that simulates driving a car from the parking area leaving the position empty. 
	//The method should return the reference to the Car-object that was on the position given by the parameter. 
	//If there is no car parked in that position the method return null.
	
	public void leaveGarage(int position) {
		if (position ==1) 
		{
			if(spot1!=null) 
			{
				spot1=null;
			}
		if (position ==2) 
		{
			if(spot2 !=null) 
			{
				spot2 = null;
			}
		}
		}
		
		}
	public String toString() 
	{
		return spot1 + "/" + "/" + spot2;
	}
	
	public boolean equals(Garage obj) {
		if (spot1==obj.spot1 && spot2==obj.spot2) {
			return true;
		}
		else return false;
	}
	
	
		
	
	}

