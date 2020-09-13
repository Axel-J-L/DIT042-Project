package Drake.DartSystem;

import java.util.Scanner;

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

     */
    public static String getInput(String message) { // Method to get string input from user and return

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println(message);
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

        } while(accept);

        return this.userInput; // Returns user's menu choice back to called class
    }

    /**
     * 
     */
    public void printArray(String[] pArray[]) {
    	
    	for (String[] element: pArray) {
            System.out.println(element);
        }
    	
        // TODO implement here
    }

}