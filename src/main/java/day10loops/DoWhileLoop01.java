package day10loops;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while loop
        int i=1;

        while (i<1){
            System.out.println("While Loop");
            i++;
        }

        //Do while loop
        //When you use do-while loop, zero execution is impossible
        //loop body will be executed at least once
        //If it is must execute inside the loop body at least once use do while loop

        int k=1 ;
        do{

            System.out.println("Do-While Loop");
            k++;
        }while (k<1);

        /*
        Example 1: Ask user to enter an integer
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
         */

//        Scanner scan = new Scanner(System.in);
//
//
//        //My Way:
//        do{
//            System.out.println("Enter an integer if you want to win");
//            int integer = scanner.nextInt();
//
//
//            if(integer<100 && integer>0){
//                System.out.println("Won!");
//            }else if(integer<0){
//                System.out.println("Enter positive number!");
//            }else{
//                System.out.println("Lost!");
//                break;
//            }
//
//
//        }while (true);


        //Suleyman's Way:

                /*
        Example 1: Ask user to enter an integer
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
         */
        Scanner scan = new Scanner(System.in);

        int num;

        do{
            System.out.println("Enter an integer");
            num = scan.nextInt();

            if(num<100){
                System.out.println("Won");
            }

        }while (num<100);

        System.out.println("Lost");

        //Note: If you do not type increment/decrement part loop will be infinite loop.
        for (int p=1; p>10; ){
            System.out.print(p + " ");
        }



        //Note: By putting "true" inside the while parenthesis. We can create infinite loop, and we break the loop by the codes inside the loop body
        int r =0;

        while (true){
            System.out.println("Hi!");
            r++;

        }











    }
}
