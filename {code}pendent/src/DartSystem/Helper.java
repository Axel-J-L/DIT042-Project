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
    public static String getInput(String message) { // Method to get string input from user and return

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print(message); //removed println and replaced with print (D) if we need and println version we'll make one
        String userInput = scanner.nextLine();  // Read user input
        scanner.close(); // Close scanner
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
                    menu.close();
                }

            }

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

    // asks for password and then returns value (would like to implement authentication and hide password)
    public static String Password() { //this is to implement passwords and password protection (D)
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Password: "); // hide password input
        String userPass = scanner.nextLine();
        scanner.close(); // Close scanner
        return userPass;  // Output user input
    }

        // should work not but I haven't tested it (D)
    public static String Authenticator() { // authenticates passwords
        Manager mPass = new Manager(); // called the password from Manager class
        Employee ePass = new Employee(); // called the password from Employee class
        // mPass.password = admin1234 & ePass.password =
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Password: "); // would like to add the ability to hide password as its being input
        String userEntry = scanner.nextLine();
        scanner.close(); // Close scanner
        // checks both the manager and the employee passwords to see if you entered correct
        // I think it will work but not 100% sure (D)
        if (userEntry != mPass.password) {
            return mPass.password = "incorrect";
        } else if (userEntry == mPass.password){
            return mPass.password = mPass.password;
        } else if (userEntry != ePass.password){
            return ePass.password = "incorrect";
        } else if (userEntry == ePass.password) {
            return ePass.password = ePass.password;
        } else {
            return "incorrect";
        }
    }
}