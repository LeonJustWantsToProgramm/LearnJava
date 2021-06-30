package readingInput;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ReadingWithJOptionPane {

	public static void main(String[] args) {
		String name; 
		String surname;
		
		name = JOptionPane.showInputDialog("Please enter your name");
		
		surname = JOptionPane.showInputDialog("Please enter your surname");
		
		JOptionPane.showMessageDialog(null, name + " " + surname);
		
		int firstNumber;
		int secondNumber;
		String input;
		
		input = JOptionPane.showInputDialog("Please enter the first Number");
		firstNumber = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Please enter the second Number");
		secondNumber = Integer.parseInt(input);
		
		double average = (firstNumber + secondNumber) / 2.0; 
		
		JOptionPane.showMessageDialog(null, "The average Number is: " + average);
		
		
		// User controlled loops with JOptionPane
		int days;
		double sales;
		double totalSales = 0.0;
		
		DecimalFormat euro = new DecimalFormat("#,###,##0.00");	// # shows nothing if nothing is on that place and shows something if it is
											//	2,000,065.48   	// the zeros show zeros if nothing is on that place
		
		input = JOptionPane.showInputDialog("For how many days do you have sales figures");
		
		days = Integer.parseInt(input);
		
		for (int i = 1; i <= days; i++) {
			input = JOptionPane.showInputDialog("Enter the sales for day " + i);
			
			sales = Double.parseDouble(input);
			
			totalSales += sales;
		}
		
		JOptionPane.showMessageDialog(null, "Your total sales are: " + euro.format(totalSales) + "€");
		
		System.exit(0);
	}

}
