package DartSystem;

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
    public static void managerMenu() {
        // TODO implement here
        System.out.println("<<< Manager Menu >>>");
        System.out.println("Manager Screen - Type one of the options below:");
        System.out.println("1. Enter \"A\" to add an employee ");
        System.out.println("2. Enter \"B\" to view all employee's");
        System.out.println("3. Enter \"C\" to go to Employee Menu");
        System.out.println("4. Enter \"R\" to return to Main Menu");

        String[] managerMenuAcceptSet = {"a", "A", "b", "B", "c", "C", "r", "R"}; // Accepted responses for menu options
        Helper input = new Helper(); // Creating new Helper object
        String mInput = input.getMenuInput("Please enter your choice: ", managerMenuAcceptSet); // Calling Helper method

        switch(mInput.toLowerCase())
        {
            case "a":
                    System.out.println("Let's add and employee!!!"); //testing manager menu
                break;
            case "b":
                System.out.println("Let's view all employee");
                break;
            case "c":
                Employee.employeeMenu();
                break;
            case "r":
                DartController.DartController();
                break;
            default:
                System.out.println("no match");
        }
    }


    /**
     *
     */
    public static String password = "admin1234";
    // manager password to use when authenticating for manager menu (D)
    public void authManager() { //this checks the manager password. more to be added. (drake)
        // TODO implement here
        Helper input = new Helper();
        String response = input.Password();
    }
}
//
//    /**
//     *
//     */
//    public void displaySalary() {
//        // TODO implement here
