package day05ternarystringmanipulations;

import java.util.Scanner;

public class NestedTernary01 {

    /*
    Type java code by using nested ternary
     Write a program to check if a year is leap year or not
     If the year is divisible by 100 then it must be divisible by 400
     If a year is not divisible by 100 then it must be divisible by 4
     */
    public static void main(String[] args) {

        int year = 2022;

        String result = (year%100==0) ?(year%400==0? "It is leap year" :"It is not leap year"):(year%4==0 ? "It is leap year" : "It is not leap year");
        System.out.println(result);

        /*
        Type code to check the password
        If it has more than 8 characters, initial should be 'i'
        If it has no more than 8 characters, initial should be 'K'
        Solve with nested ternary
         */

        String pwd = "ia1b3z";

        String res = (pwd.length()>8)? (pwd.charAt(0)=='i'? "Valid" : "Invalid") : (pwd.charAt(0)=='K'? "Valid" : "Invalid");
        System.out.println(res);


    }
}
