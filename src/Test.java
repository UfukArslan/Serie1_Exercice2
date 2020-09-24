
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
	
	}

}
