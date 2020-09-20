package DartSystem;
// testing branch push
import DartSystem.DartController;

import java.lang.*;
import java.net.Authenticator;
import java.util.Scanner;

public class Launcher {
    final public static int INITIAL_ARRAY_SIZE = 4;
    Employee[] employees =  new Employee[INITIAL_ARRAY_SIZE];


    public static void main(String[] args) {
        // TODO The main you can run the program to test things from here if you want
        DartController session = new DartController();
        session.DartController();
    }

    // Default Constructor
    public Launcher() {
    }


}