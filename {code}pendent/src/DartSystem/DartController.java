package DartSystem;

import java.io.*;
import java.util.*;
import java.lang.*;

public class DartController {


    // Default Constructor
    public static void DartController() {
        // TODO make not static

            System.out.println("Main Menu:");
            System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up! \n");
            // Poking fun at Steam, huh.
            System.out.println("1. Enter \"M\" for Manager ");
            System.out.println("2. Enter \"E\" for Employee");
            System.out.println("3. Enter \"C\" for Customer");
            System.out.println("4. Enter \"X\" to exit system");

            String[] mainMenuAcceptSet = {"M","m","E","e","C","c","X","x"}; // Accepted responses for menu options
            Helper getInput = new Helper(); // Creating new Helper object
            String userInput = getInput.getMenuInput("Please enter your choice: ", mainMenuAcceptSet); // Calling Helper method

            switch(userInput.toLowerCase())
            {
                case "m":
                    // Manager.authManager(); // Moved authManager() to Manager class. Let's have classes to do their own stuff. (Altan)
                    System.out.println("prompts manager authorization"); // we cant access the authManger yet due to static's (Drake)
                    break;
                case "e":
//                    Employee.employeeMenu();
                    break;
                case "c":
                    Customer.customerMenu();
                    break;
                case "x":
                    System.out.println("Exiting system ...");
                    break;
                default:
                    System.out.println("no match");
            }


//    public void mainMenu() {
//        // TODO implement here
//    }
//
//    public void exit() {
//        // TODO implement here
//    }
//
//
//    public void exceptionHandler() {
//        // TODO implement here
    }
    /*============================Add Employee==========================*/
    // this method you pass an array through it and it check to see whether there is
    // a employee object in the space or null. If there is a null it will add a new employee to the position formerly
    // occupied by null. Hello
    public Employee[] addEmployee(Employee employee, Employee[] employeeArr) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null) {
                continue;
            } else {
                employeeArr[i] = employee;
                i = employeeArr.length;
                //break; // I WILL FIGHT YOU
            }
        }
        return employeeArr;
    }

    /*==========================Remove Employee=========================*/
    public Employee[] removeEmployee(UUID employeeID, Employee[] employeeArr) {
        for (int i = 0; i < employeeArr.length; i++) { // goes through the array fed into method
            if (employeeArr[i] == null) continue;
            if (!employeeArr[i].getEmployeeID().equals(employeeID)) { //  it doesnt equal our employee to remove do nothing.
                continue;
            } else {
                employeeArr[i] = null; // if it does have the employee we want to remove. (Ternary statement?)
                i = employeeArr.length;
            }
        }

        for (int j = 0; j < employeeArr.length-1; j++) { //runs through the array
            if (employeeArr[j] !=(null) && employeeArr[j + 1] != null) { // position j != null && position j+1 != null
                continue; //do nothing
            } else if (employeeArr[j] == (null) && employeeArr[j + 1] != null) { // position j = null && position j+1 !=null
                employeeArr[j] = employeeArr[j + 1]; // position j = position j + 1\
                employeeArr[j+1] = null;
            } else {
                j = employeeArr.length; // only other situation would be position j && j+1 == null which means the array has two nulls in a row
            }
        }

        return employeeArr;
    }

}



