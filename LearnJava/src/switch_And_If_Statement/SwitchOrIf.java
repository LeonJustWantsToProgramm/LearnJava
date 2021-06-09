package switch_And_If_Statement;

import java.util.Scanner;

public class SwitchOrIf {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// short hand if-statement
		int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
		
        
		
		Scanner roles = new Scanner(System.in);
		System.out.print("Please print your role : ");
		String role = roles.next();
		
		
		//als switch statement
		switch (role) {
		case "admin":
			System.out.println("You're an admin");
			break;
		case "moderator":
			System.out.println("You're a moderator");
			break;
		default:
			System.out.println("You're a guest");
		}
		
		
		
		Scanner scanRoles = new Scanner(System.in);
		System.out.print("Type in your Name : ");
		String LoginName = scanRoles.next();
		
		
		if(LoginName.length() > 2) {
			System.out.println("Welcome "+ LoginName);
		} else if (LoginName.length() <= 2) {
			System.out.println("The Name is too short, type in a real one");
		} else if (LoginName.isEmpty()) {
			System.out.println("You haven't typed anything in, please type in your Name");
		}

	}

}
