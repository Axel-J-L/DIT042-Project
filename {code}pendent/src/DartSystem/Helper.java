package DartSystem;

import java.util.*;
import java.io.*;
/**
 * 
 */
public class Helper {

    /**
     * Default constructor
     */

    String userInput;

    public Helper() {
    }

    /**
     *
     */

    // THIS ONE IS SUPER USEFUL USE IT!
    public String getInput(String message) { // Method to get string input from user and return
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print(message); //removed println and replaced with print (D) if we need and println version we'll make one

        userInput = scanner.nextLine(); // Read user input

        scanner.close();

        return userInput;  // Output user input


    }

    public String getMenuInput(String message, String[] acceptSet) { // Method to get menu input from user and return

        Boolean accept = true;

        // di while to loop around until user enter one of the AcceptSet characters. Anything else, just keeps looping
        do {
            Scanner menu = new Scanner(System.in);
            System.out.print("\n" + message); // String message from called class before asking for input
            userInput = menu.nextLine(); // Gets user input

            for (int i = 0; i < acceptSet.length; i++) { // Loop around AcceptSet array for matching letter
                if (userInput.equals(acceptSet[i])) { // If user input is correct, then break loop and close scanner
                    accept = false;
                }

            }

            menu.reset();
            menu.close();

        } while (accept);



        return this.userInput; // Returns user's menu choice back to called class
    }

    /**
     *
     */
    public void printArray(String[] pArray[]) {

        for (String[] element : pArray) {
            System.out.println(element);
        }

        // TODO implement here
    }

    // asks for password and then returns value
    // (would like to implement authentication and hide password)
    /** public static String Password() { //this is to implement passwords and password protection (D)
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Password: "); // hide password input
        String userPass = scanner.nextLine();
        scanner.close(); // Close scanner
        return userPass;  // Output user input
    }
     **/

        // Dont think it works
        // if this works it will replace the password method (D)

    public String Authenticator() { // authenticates passwords

        String authSuccess;
        String mpassword = "admin1234";

        String ePassword = getInput("Enter manager password: ");

        // checks both the manager and the employee passwords to see if you entered correct
        // I think it will work but not 100% sure (D)
        if (mpassword.equals(ePassword)) {
            authSuccess = "Correct";
        } else {
            authSuccess = "No good";
        }

        return authSuccess;
    }
}