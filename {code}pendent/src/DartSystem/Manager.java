package DartSystem;

import java.util.*;

/**
 * 
 */
public class Manager {

    /**
     * Default constructor
     */
    public Manager() {
    }


    /**
     *
     */
    public void mPassword() { //this checks the manager password. (drake)
        String pass = "admin1234";
        String response = "incorrect";
        Helper input = new Helper();
        response = input.Password();

    }

    /**
     *
     */
    public static void managerMenu() {
        // TODO implement here
        System.out.println("<<< Manager Menu >>>");
        System.out.println("Manager Screen - Type one of the options below:");
        System.out.println("1. Enter \"1\" to add an employee ");
        System.out.println("2. Enter \"2\" to view all employee's");
        System.out.println("3. Enter \"3\" to exit system \n");
    }
}











//    /**
//     *
//     */
//    public void authManager() {
//        // TODO implement here
//    }
//
//    /**
//     *
//     */
//    public void displaySalary() {
//        // TODO implement here
