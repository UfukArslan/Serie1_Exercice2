
public class MonPoint {
	
	protected int x ;
	protected int y ;
	
	MonPoint (){}
	
	MonPoint (int a, int b)
	{
		x = a ;
		y = b ;
	}
	
	
	public void getValue()
	{
		String value = x + " : " + y;
		System.out.println("getValue = " + value);
	}
	
	public void moveTo(int newX, int newY) 
	{
		this.x = newX;
		this.y = newY;
		System.out.println("moveTo: x=" +this.x+", y="+this.y+"");
	}
	
	public String erase() 
	{	
		String text = "le point est effacé";
		return text;
	}
	

	

	
	

}
