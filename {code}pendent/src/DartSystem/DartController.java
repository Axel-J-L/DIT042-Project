package DartSystem;

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * 
 */
public class DartController {

    /**
     * Default constructor
     */

    public static void DartController() {

            System.out.println("<<< Main Menu >>>");
            System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up! \n");
            System.out.println("Please specify your role by entering one of the options given:");
            System.out.println("1. Enter \"M\" for DartSystem.Manager ");
            System.out.println("2. Enter \"E\" for DartSystem.Employee");
            System.out.println("3. Enter \"C\" for DartSystem.Customer");
            System.out.println("4. Enter \"X\" to exit system");

            String[] mainMenuAcceptSet = {"M","m","E","e","C","c","X","x"}; // Accepted responses for menu options
            Helper getInput = new Helper(); // Creating new Helper object
            String userInput = getInput.getMenuInput("Please enter your choice: ", mainMenuAcceptSet); // Calling Helper method

            switch(userInput.toLowerCase())
            {
                case "m":
                    Manager.managerMenu();
//                    System.out.println("Let's Go to Manager section"); //testing manager menu
                    break;
                case "e":
                    Employee.employeeMenu();
//                    System.out.println("Let's Go to Employee section");
                    break;
                case "c":
                    System.out.println("Let's Go to Customer section");
                    break;
                case "x":
                    System.out.println("Exiting system ...");
                    break;
                default:
                    System.out.println("no match");
            }
    }
}




//    going to modify this so that if the wrong password is entered it takes you back to the main menu (drake)
//        Scanner input = new Scanner(System.in);
//        int menuC = 0;
//        while (menuC != 1 || menuC != 2 || menuC != 3 || menuC != 4) {
//            menuC = input.nextInt();
//            input.nextLine();
//            if (menuC == 1) {
//                System.out.print("password: ");
//                String password = input.nextLine();
//            } else if (menuC == 2) {
//                // generate employee menu
//            } else if (menuC == 3) {
//                // generate customer menu
//            } else if (menuC == 4) {
//                // exit system
//            } else {
//                System.out.println("");
//            }
//        }























//
//    /**
//     *
//     */
//    public String menuState;
//
//    /**
//     *
//     */
//    public String menuOption;
//
//
//
//    /**
//     *
//     */
//    public void mainMenu() {
//        // TODO implement here
//    }
//
//    /**
//     *
//     */
//    public void exit() {
//        // TODO implement here
//    }
//
//    /**
//     *
//     */
//    public void exceptionHandler() {
//        // TODO implement here
//    }
//
//}
