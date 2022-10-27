package day05ternarystringmanipulations;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
        Ask user to enter country name among "America, England
        Type code to pint abbreviation of the countries "EN, IN, DE ...
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter country name");
        String country = scanner.next().toUpperCase();

        switch (country){//Inside the switch parenthesis, we can use just "int", "byte", "short", "char", "string" data types
            //Note: boolean, long, float, double cannot be used in switch statement


            case "AMERICA":
                System.out.println("US");
                break;
            case "ENGLAND":
                System.out.println("UK");
                break;
            case "TURKMENISTAN":
                System.out.println("TKM");
                break;
            default:
                System.out.println("You entered wrong country");


        }

    }


}
