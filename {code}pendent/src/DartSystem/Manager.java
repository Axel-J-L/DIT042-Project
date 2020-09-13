package DartSystem;

/**
 * 
 */
public class Manager {
    // manager password to use when authenticating for manager menu (D)
    public String password = "admin1234";

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
        System.out.println("\n<<< Manager Menu >>>");
        System.out.println("Manager Screen - Type one of the options below:");
        System.out.println("1. Enter \"A\" to add an employee ");
        System.out.println("2. Enter \"V\" to view all employee's");
        System.out.println("3. Enter \"E\" to go to Employee Menu");
        System.out.println("4. Enter \"X\" to return to Main Menu");

        Helper managerMenu = new Helper();
        String[] mMenuAcceptSet = {"A","a","V","v","E","e","X","x"}; // Accepted responses for menu options

        String mInput = managerMenu.getMenuInput("Please enter your choice: ", mMenuAcceptSet);
    }




    /**
     *
     */
    public void authManager() { //this checks the manager password. (drake)
        // TODO implement here


        }
    }
//
//    /**
//     *
//     */
//    public void displaySalary() {
//        // TODO implement here
