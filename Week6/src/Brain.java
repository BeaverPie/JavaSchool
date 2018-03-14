
public class Brain {

	
	String activeMemoryItem;
	String passiveMemoryItemOne;
	String passiveMemoryItemTwo;
	
	public Brain(String aMI, String pMIO, String pMIT) {
		activeMemoryItem=aMI;
		passiveMemoryItemOne=pMIO;
		passiveMemoryItemTwo=pMIT;
	}
	
	int iq;
	
	
	public int getIq(int iq) {
		return iq;
	}
	public boolean isBrainDamaged() 
	{
		if (iq<70) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	
	}
	




}
