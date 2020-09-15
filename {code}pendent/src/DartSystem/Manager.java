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

 // I think this menu might be better to have in the DartController class (D)
    public static void managerMenu() {
        System.out.println("\nManager Screen - Type one of the options below:");
        System.out.println("1. Add an employee");
        System.out.println("2. View all employees");
        System.out.println("3. Return to Main Menu");

        String[] managerMenuAcceptSet = {"1", "2", "3"}; // Accepted responses for menu options
        Helper input = new Helper(); // Creating new Helper object
        String mInput = input.getMenuInput("Please enter your option: ", managerMenuAcceptSet); // Calling Helper method

        switch(mInput.toLowerCase())
        {
            case "1":
                System.out.println("Let's add and employee!!!"); //testing manager menu
                break;
            case "2":
                System.out.println("Let's view all employee");
                break;
            case "3":
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
    public static void authManager() { //this checks the manager password. more to be added. (drake)
        // TODO implement here

        Helper mAuth = new Helper();
        String authSuccess = mAuth.Authenticator();

        if (authSuccess.equals("success")) {
            Manager.managerMenu();
        } else {

            System.out.println("\n*** Wrong password *** \n");

            DartController.DartController();
        }
    }
}
//
//    /**
//     *
//     */
//    public void displaySalary() {
//        // TODO implement here
