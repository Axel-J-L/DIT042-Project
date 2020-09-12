package DartSystem;

import java.util.*;

/**
 * 
 */
public class Helper {

    /**
     * Default constructor
     */
    public Helper() {

    }

    /**
     * @param String message 
     * @param int 
     * @param char 
     * @param string
     */
    public static String getInput(String message) {
    	
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println(message);

        String userInput = scanner.nextLine();  // Read user input
        
        scanner.close(); // Close scanner
        
        return userInput;  // Output user input
        
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