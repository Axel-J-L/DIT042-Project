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
        System.out.println("<<< Manager Menu >>>");
        System.out.println("Manager Screen - Type one of the options below:");
        System.out.println("1. Enter \"1\" to add an employee ");
        System.out.println("2. Enter \"2\" to view all employee's");
        System.out.println("3. Enter \"3\" to go to Employee Menu");
        System.out.println("4. Enter \"4\" to return to Main Menu \n");
    }




    /**
     *
     */
    public void authManager() { //this checks the manager password. (drake)
        // TODO implement here
            String response = "incorrect";
            Helper input = new Helper();
            response = input.Password();

        }
    }
//
//    /**
//     *
//     */
//    public void displaySalary() {
//        // TODO implement here
