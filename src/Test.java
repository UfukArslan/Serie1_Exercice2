
public class Test {

	public static void main(String[] args) {

		
		MonPoint form1 = new MonPoint (5, 4);
		
		// Display value
		String value = form1.getValue();
		System.out.println(value);
		
		
		//Change value
		form1.moveTo(10, 8);
		String newValue = form1.getValue();
		System.out.println(newValue);
		
		//Erase value
		System.out.println(form1.erase());
		
		//Object Rectangle
		
		MonRectangle rect = new MonRectangle (10, 5);
		
		String valueRect = rect.getValue();
		System.out.println(valueRect);
	
		rect.moveTo(3, 4);
		String newRectValue = rect.getValue();
		System.out.println(newRectValue);
		
		System.out.println(rect.erase());
		
	
	}

}
