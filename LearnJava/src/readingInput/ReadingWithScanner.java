package readingInput;

import java.util.Scanner;

public class ReadingWithScanner {

	public static void main(String[] args) {
		
		//Scanner for byte
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Age :");
		byte age = sc.nextByte();
		System.out.println("You are " + age + " years old");
		
		//Scanner for String
		@SuppressWarnings("resource")
		Scanner nameScan = new Scanner(System.in);
		System.out.print("Name :");
		String name = nameScan.nextLine().trim();
		System.out.println("Your name is : " + name);
		
		
		//*Scanner is in nearly all cases used for the console, not for websites or apps*
	}

}
