package Axel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeMenu {

    Scanner input= new Scanner(System.in);

    public static String[] empMenu(){

        String[] menu= new String[7];

        menu[0]=("1. Register a game" );
        menu[1]=("2. Remove a game");
        menu[2]=("3. Register a customer");
        menu[3]=("4. Remove a customer ");
        menu[4]=("5. Show total rent profit");
        menu[5]=("6. View all games");
        menu[6]=("7. Return to Main Menu");

        System.out.println(menu);


       return menu;
     }


    }


