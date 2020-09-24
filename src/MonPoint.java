
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
	
	public void moveTo(int newX, int newY) 
	{
		this.x = newX;
		this.y = newY;
	}
	
	public String erase() 
	{	
		String text = "le point est effacé";
		return text;
	}
	
	

	
	

}
