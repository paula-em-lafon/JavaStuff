import java.util.ArrayList;

public class DotCom
{
	private ArrayList<String>  locationCells;
	
	public void setLocationCells (ArrayList<String> loc)
	{
		locationCells = loc;
	}
	
	public String checkYourself(String stringGuess)
	{
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
			
		if  (index >= 0);
		{
			if (locationCells.isEmpty())
			{
				result = "kill";
			}
			else
			{
				result = "hit";
			}
		}
		return result;
	}
}
