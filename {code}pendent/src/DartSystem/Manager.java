package DartSystem;

public class Manager {

    // Default Constructor
    public Manager() {
    }

    public static void managerMenu() {
        // TODO make not static
        System.out.println("\nManager Screen - Type one of the options below:");
        System.out.println("1. Add an employee");
        System.out.println("2. Remove an employee");
        System.out.println("3. View all employees");
        System.out.println("4. Return to Main Menu");

        String[] managerMenuAcceptSet = {"1", "2", "3", "4"}; // Accepted responses for menu options
        Helper input = new Helper(); // Creating new Helper object
        String mInput = input.getMenuInput("Please enter your option: ", managerMenuAcceptSet); // Calling Helper method

        switch(mInput.toLowerCase())
        {
            case "1":
                System.out.println("Let's add and employee!!!"); //testing manager
                // cant actually add an employee because we
                // just created a new employee here that has an empty array.
                Employee addEmployee = new Employee();
                addEmployee.addEmployee();
                Manager.managerMenu();
                break;
            case "2":
                System.out.println("Remove an employee");
                // cant actually remove an employee because we
                // just created a new employee here that has an empty array.
                Employee removeOne = new Employee();
                removeOne.removeEmployee(removeOne.getEmployeeID());
                Manager.managerMenu();
                break;
            case "3":
                System.out.println("Let's view all employee");
                Employee viewEmployees = new Employee();
                // cant display all employees because your calling an employee who
                // doesnt have anything in their array because you just created here...
                viewEmployees.viewEmployees();
                Manager.managerMenu();
                break;
            case "4":
                System.out.println("Return to main menu: ");
                DartController.DartController();
            default:
                System.out.println("no match");
        }
    }


    //  changed this password authenticator to work for both employee and manager and customer if needed later. (d)
    //had to remove reference to menus at this time since the menus are currently static (d)
    public static void authManager() {
            String password = "admin1234";
            Helper Authorize = new Helper();
            Boolean authSuccess = Authorize.authenticate(password);

        if ( authSuccess ) {
            Manager mngr5 = new Manager();
            mngr5.managerMenu();
        } else {
            System.out.println("\n*** Wrong password *** \n");
            DartController dart2 = new DartController();
            dart2.DartController();
        }
    }
}