package day10loops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {
        /*
        Example 1: Type code to print integers from 3 to 6
         */

        //1st Way: For loop
        for (int i=3; i<=6; i++){
            System.out.print(i + " ");
        }

        //2nd Way: While loop
        System.out.println("");

        int k =3;

        while(k<=6){


            System.out.print(k + " ");
            k++;
        }
        System.out.println("");

        //Ex 2: Type code to print odd integers from 12 to 67 in the
        //same line with a space between them

        int m = 12;

        while(m<68){

            if(m%2!=0){
                System.out.print(m+ " ");
            }
            m++;
        }

        System.out.println("");

        int o = 12;
       do{

            if(o%2!=0){
                System.out.print(o+ " ");

            }
           o++;

        }while (o<68);


        System.out.println("");
       //3rd Example: Type code to find the sum of integers from 12 to 67

        int num = 12;
        int sum = 0;

        while (num<68){

            sum+=num;
            num++;
        }

        System.out.print("The sum is " + sum);

        System.out.println("");
        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int number = scanner.nextInt();
//        number =Math.abs(number);
//        int sumOfDigits = 0;
//
//        while(number>0){
//
//
//
//            sumOfDigits+= number%10;
//
//            number= number/10;
//        }
//        System.out.print(sumOfDigits);

       /*
		 Example 5: Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.
	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	  */

        int n = 3;
        int i = 1;

        while(i<11){

            System.out.print(n + "x" + i  + "=" + n*i + " ");

            i++;
        }






    }

}
