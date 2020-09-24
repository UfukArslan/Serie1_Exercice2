
public class MonRectangle extends MonPoint {
	
	private int x ;
	private int y ;
//	
//	MonPoint (){}
//	
//	MonPoint (int a, int b)
//	{
//		x = a ;
//		y = b ;
//	}
//	
//	
//	public String getValue()
//	{
//		String value = x + " : " + y;
//		return value;
//	}
//	
//	public void moveTo(int newX, int newY) 
//	{
//		this.x = newX;
//		this.y = newY;
//	}
//	
//	public String erase() 
//	{	
//		String text = "le point est effacé";
//		return text;
//	}
	
	
	MonRectangle (int a, int b)
	{
		x = a ;
		y = b ;
	}
	
	public String getValue()
	{
		String value = x + " : " + y;
		return value;
	}
	
	public String erase() 
	{	
		String text = "le rectangle est effacé";
		return text;
	}
	
	
	

}
