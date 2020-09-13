package DartSystem;

import java.util.*;

/**
 * 
 */
public class Employee {

    /**
     * Default constructor
     */
    public Employee() {
    }

    /**
     * 

    public object ArrayList employees;
     */

    /**
     * 
     */
    public String employeeId;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String password = "password123";


    /**
     * 
     */
    public int birthYear;

    /**
     * 
     */
    public String address;

    /**
     * 
     */
    public int salary;





    /**
     * 
     */
    public static void employeeMenu() {
        // TODO implement here
        System.out.println("<<< Employee menu >>>");
        System.out.println("Employee screen - Type one of the options below:");
        System.out.println("1. Enter \"1\" to register a game ");
        System.out.println("2. Enter \"2\" to remove a game");
        System.out.println("3. Enter \"3\" to register a customer");
        System.out.println("4. Enter \"4\" to remove a customer");
        System.out.println("5. Enter \"5\" to show total rent profit");
        System.out.println("6. Enter \"6\" to view all games");
        System.out.println("7. Enter \"7\" to return to main menu\n");
    }

    /**
     * 
     */
    public void addEmployee() {
        // TODO implement here
    }

    /**
     * 
     */
    public void authEmployee() { //Checks and uses the Authenticator method from help class. Returns false if !=password (A)
        // TODO implement here
        Helper passScan = new Helper();
        String userResponse = passScan.Password();

    }

    /**
     * 
     */
    public void removeEmployee() {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewAll() {
        // TODO implement here
    }

    /**
     * @param totalSalary 
     * @param netSalary

    public void salary(void totalSalary, void netSalary) {
        // TODO implement here
    }
     */

}