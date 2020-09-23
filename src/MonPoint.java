
public class MonPoint {
	
	private int x ;
	private int y ;
	
	MonPoint (){}
	
	MonPoint (int a, int b)
	{
		x = a ;
		y = b ;
	}
	
	public String getValue()
	{
		String value = x + " : " + y;
		return value;
	}
	
	

}
