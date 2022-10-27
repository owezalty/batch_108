package day02typecastingscanner;


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) throws InterruptedException {

        //Scanner Class: We will get data from user into our codes.

        //1st Step: Create an "object" from "Scanner Class"
        //Class Name    Object Name     new     Constructor
        Scanner         scan        =    new    Scanner(System.in);

        System.out.println("Enter your address");
        String address = scan.nextLine();
        System.out.println(address);
        //2nd Step: Give a message to user about the data you ask
        System.out.println("Enter your age");

        //3rd Step: Get the data by the help of the "input" object
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println(name);



    }
}
