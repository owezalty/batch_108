package day05ternarystringmanipulations;

public class Ternary01{

    //ternary does the same with "if else" by using more simple syntax

    public static void main(String[] args) {

        //If an integer is positive print "the integer is positive" otherwise print "the integer is not positive"
        int i = 12;

        //Use ternary //condition       //true condition            //false condition
        String result = i>0 ?       "The integer is positive" : "The integer is negative";
        System.out.println(result);

        //Type a program to print the min of 2 integers on the console, use ternary
        // 12, 23 ==> 12    345, 23 ==>

       double a = 1.2, b=2.5;

        double res = a<b ? a : b;
        System.out.println(res);


        /*
        Type code to calculate the absolute value of a number
        For positives and zero absolute value is the same with the number
        Fir negative numbers to find absolute value multiply the number by -1
         */

       int x = 0;
       int absolute = x>0 ? x : -1*x;
        System.out.println(absolute);

        /*
        You have 2 integers
        If both of the integers are positive do multiplication
        Otherwise, return "I do not how to multiply
         */

        int num1 = 34, num2 = -10;

        Object res1 = num1>0 && num2>0 ? num1*num2 : "I do not how to multiply";
        System.out.println(res1);





    }
}
