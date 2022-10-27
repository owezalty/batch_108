package day11constructorsmethodcallstatickeyword;

import java.util.Scanner;

public class DoWhile01 {

    public static void main(String[] args) {

     /*

    Username is "admin", Password is "pwd123"
    Ask user to enter username and password
    User should see "Enter your username and password" message
    hIf user enters correct credentials, e should get "You are in your account!" message
    Otherwise, he should see "Enter your username and password" message 3 times
    After 3 times he should get "Your account is blocked" message
         */

        Scanner scanner = new Scanner(System.in);

        //My Way:
//        int counter = 0;
//        do{
//            System.out.println("Enter your username and password");
//            String userName = scanner.next();
//            String pwd = scanner.next();
//
//            if(userName.equals("admin")&&pwd.equals("pwd123")){
//                System.out.println("You are in your account!");
//                break;
//            }else if (counter<4){
//                System.out.println("You typed wrong");
//                counter++;
//            }
//
//
//        }while (counter<4);
//        System.out.println("Your account is blocked");



        //TechPro Way:
        int count = 0;

        do{
            if(count ==3){
                System.out.println("Your account is blocked!");
                break;
            }
            System.out.println("Enter your username...");
            String userName = scanner.next();

            System.out.println("Enter your password...");
            String pwd = scanner.next();

            count++;
            if(userName.equals("admin")&&pwd.equals("pwd123")){
                System.out.println("You are in your account!");
                break;
            }


        }while (true);

        scanner.close();


    }
}
