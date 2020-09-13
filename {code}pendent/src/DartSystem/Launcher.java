package DartSystem;

import DartSystem.DartController;

import java.lang.*;

/**
 * 
 */
public class Launcher {
	
    public static void main(String[] args) {
        // TODO implement here
        // Calling objects to be used :D (Drake)
        DartController session = new DartController();
        Manager authManager = new Manager(); //calling manager object to authenticate manager
        Helper input = new Helper();


        DartController.DartController();

        authManager.mPassword(); //authManger is what I called the manager object in Launcher
                                //mpassword calls the method to check for manager password (drake)
    }

    /**
     * Default constructor
     */
    public Launcher() {
    }

    /**
     * 
     */


    /**
     * 
     */


}