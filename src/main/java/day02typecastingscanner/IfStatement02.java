package day02typecastingscanner;

import java.util.Scanner;

public class IfStatement02 {

    /*
    Example 1: Type code to print "Weekday" for the weekday names, "Weekend day" for the weekend day names
               Monday --> Friday ==> Weekday            Saturday, Sunday ==> Weekend day
 */

    /*
    "==" checks both
        i) The value
        ii) The address

    If both are same Java will tell you true
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day name");
        String dayName = scanner.next();

        //Note: To compare Strings use "equals()", do not use "=="
        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend");
        }

        //2nd Way: I will use if-else statement

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday")||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equals("Wednesday")||
                dayName.equalsIgnoreCase("Thursday")||
                dayName.equalsIgnoreCase("Friday");
        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday")||
                dayName.equalsIgnoreCase("Sunday");

        if(isWeekDay){
            System.out.println("Weekday");
        } else if (isWeekendDay) {
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid day name");
        }


    }

}
