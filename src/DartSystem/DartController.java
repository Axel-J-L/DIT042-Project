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
        System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up!");
        System.out.println(" ");
        System.out.println("Please specify your role by entering one of the options given:");
        System.out.println("1. Enter \"M\" for Manager ");
        System.out.println("2. Enter \"E\" for Employee");
        System.out.println("3. Enter \"C\" for Customer");
        System.out.println("4. Enter \"X\" to exit system");
        Helper input = new Helper();
//        Helper.getInput();
    }



    /**
     * 
     */
    public String menuState;

    /**
     * 
     */
    public String menuOption;

    String cEmployee;                       //create employee
    String rEmployee;                       //remove employee


    /**
     * 
     */
    public void mainMenu() {
        // TODO implement here
    }

    /**
     * 
     */
    public void exit() {
        // TODO implement here
    }

    /**
     * 
     */
    public void exceptionHandler() {
        // TODO implement here
    }

}