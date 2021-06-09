package referenceTypesAndOperations;

import java.util.Date;

public class DateParseAndImplicitCasting{

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		
		//implicit casting
		//byte > short > int > long > float > double
		double x = 1.2;
		int y = (int)x + 2;
		System.out.println(y);
		
		
		//parse convert operations into other operations like here String to Int
		String a = "2";
		int b = Integer.parseInt(a) * 5;
		System.out.println(b);
		
		//or like this
		String s = "4.7";
		float f = Float.parseFloat(s) - 1.4F;
		System.out.println(Math.round(f));
		
		
		//converting integer or other numbers to an String goes like this:
		int i = 5;
		String j = String.valueOf(i);
		System.out.println(j);
	}

}
