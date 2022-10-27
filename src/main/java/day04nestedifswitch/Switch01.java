package day04nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    /*
    Switch statement does the same with if-else-if, it has
    just different syntax
     */
    public static void main(String[] args) {

        /*
        Get the number of days from user and print the name of the day
        For example: 1 ==> Sunday  2==> Monday
         */

        //1st Way: If-else-if

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of day");
        int numOfDay = scanner.nextInt();

        if(numOfDay==1){
            System.out.println("Sunday");
        } else if (numOfDay==2) {
            System.out.println("Monday");
        } else if (numOfDay==3) {
            System.out.println("Tuesday");
        } else if (numOfDay==4) {
            System.out.println("Wednesday");
        } else if (numOfDay==5) {
            System.out.println("Thursday");
        } else if (numOfDay==6) {
            System.out.println("Friday");
        } else if (numOfDay==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("It is not valid number");
        }

        //2nd Way: Switch Statement

        switch (numOfDay){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");

        }


    }
}
