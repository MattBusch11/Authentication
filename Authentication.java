import java.util.Scanner;
public class Authentication {
	/**Author: Matt Busch
	 * Date: 10/12/2017
	 * Purpose: To authenticate a user trying to gain access
	 */
	public static void main(String[] args) {
		/**
		 * Pupose: To prompt the user for username and password and if it is correct, then to display welcome message or if it is wrong to display error message
		 */
		Scanner keyboard = new Scanner (System.in);
		String username, password;
		System.out.println("Enter your username");//prompt for username
		username = keyboard.nextLine();
		System.out.println("Enter your password");//prompt for password
		password = keyboard.nextLine();
		if (username.equals("Csc200class") && password.equals("admin")) {//compare input to correct username and password and execute correct block of code
			System.out.println("Welcome Csc200class!");
		}
		else {
			System.out.println("Wrong username or password");
		}
	}
}
			

