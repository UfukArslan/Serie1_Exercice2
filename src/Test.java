
public class Test {

	public static void main(String[] args) {

		
		MonPoint form1 = new MonPoint (5, 4);
		
		// Display value
		form1.getValue();
		
		
		
		//Change value
		form1.moveTo(10, 8);
		
		//Erase value
		System.out.println(form1.erase());
		
		//Object Rectangle
		
		MonRectangle rect = new MonRectangle (20, 5);
		
		rect.getValue();
		
	
		rect.moveTo(3, 4);
		
		
		System.out.println(rect.erase());
		
	
	}

}
