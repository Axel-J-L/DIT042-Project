package DartSystem;
// Hey this is a demonstration for commit (D)
import java.util.*;
import java.time.Year;
/**
 * 
 */
public class Employee {

    /**
     * Default constructor
     */
    public Employee() {
    }

  //  public object ArrayList employees;

    public String employeeId;
    public String name;
    public String password = "password123";
    public int birthYear;
    public String address;
    public int salary;




    public static void employeeMenu() {
        // Finished for the moment
        System.out.println("<<< Employee menu >>>");
        System.out.println("Employee screen - Type one of the options below:");
        System.out.println("1. Enter \"A\" to register a game ");
        System.out.println("2. Enter \"B\" to remove a game");
        System.out.println("3. Enter \"C\" to register a customer");
        System.out.println("4. Enter \"D\" to remove a customer");
        System.out.println("5. Enter \"E\" to show total rent profit");
        System.out.println("6. Enter \"F\" to view all games");
        System.out.println("7. Enter \"R\" to return to main menu\n");
        String[] employeeMenuAcceptSet = {"A","a","B","b","C","c","D","d","E","e","F","f","R","r"}; // Accepted responses for menu options
        Helper getInput = new Helper(); // Getting new object from Helper
        String userInput = getInput.getMenuInput("Please enter your choice: ", employeeMenuAcceptSet); // using argument to call Helper method

        switch(userInput.toLowerCase())
        {
            case "a":
                System.out.println("Register a game");
                break;
            case "b":
                System.out.println("Remove game");
                break;
            case "c":
                System.out.println("Register a customer");
                break;
            case "d":
                System.out.println("Remove customer: ");
                break;
            case "e":
                System.out.println("Show total rent profit");
                break;
            case "f":
                System.out.println("View all games: ");
                break;
            case "r":
                System.out.println("Return to main menu: ");
                break;
            default:
                System.out.println("no match");
        }
    }

    /**
     * 
     */
    public void addEmployee() {
        // TODO implement here
        int empBirth=1;
        int age=1;
        Helper input = new Helper();
        String askName = "Employee name: ";
        String empName = input.getInput(askName);
        String askBirthYear = "Employee birth year: ";
        // empBirth=input.getInt(askBirthYear);
        //  Year birthYear=input.next();
       // Year currentYear=Year.now();
         //age=currentYear.minus(empBirth);
        // should fix it later
        String askSalary=("Ask the Gross salary: ");
        int grossSalary=input.getInt(askSalary);




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