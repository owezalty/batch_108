package day09loops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Type code to reverse a String

        String s = "Queen";
        String reversedName = "";

        //1st Way:
        for (int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            reversedName += ch;

        }
        System.out.println(reversedName);

        //2nd Way:
//        System.out.println("Original word: " + s);
//        String temp = "";
//        char ch;
//        for (int i=0; i<s.length();i++ ){
//            ch = s.charAt(i);
//            temp = ch + temp;
//        }
//        System.out.println("Reversed word: " + temp);

        //Example 2: Find the sum of the integers from 3 to 6

        int sum = 0;
        for (int i=3; i<=6; i++){
            sum += i;
        }
        System.out.println(sum);

        //Example 3: Find the multiplication of the integers from 3 to 6
        int multiplication = 1;

        for (int i=3 ; i<=6; i++){
            multiplication *= i;
        }
        System.out.println(multiplication);

        //******Example 4: Type code to find the sum of the digits of an integer
        //      584 ==> 17
        //If it is negative? -584 what should we do?

        //Note: "number %10 " gives you last digit

        int num = -584;
        num = Math.abs(num);

        int sumOfDigits = 0;
        for(int i =num; i>0 ; i=i/10){


            sumOfDigits += i%10;
        }
        System.out.println(sumOfDigits);


    }
}
