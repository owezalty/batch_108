package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Data Type         Variable Name       =       Value   ;
            int                 age             =       27      ;

       //Example 1: Create a variable whose value is 1.99
       double priceOfShirt = 1.99;

       /*
       Data Types(Primitives)

        1) byte: It is used for whole numbers.
        The minimum value of byte is -128
        The max value of byte is 127
        byte variables use 8 bits in memory

        2) short: It is used for whole numbers.
        The minimum value of short is -32,768
        The max value of short is 32,767
        short variables use 16 bits in memory

        3) int: It is used for whole numbers.
        The min value of integers is -2b
        The max value of integers is 2b
        Integer variables use 32 bits in memory

        4) long: It is used for whole numbers.
        The min value of long is -9 trillion
        The max value of long is +9 trillion
        Integer variables use 64 bits in memory

        Note: When you select any data type the value must be in the range of the data type.
        */

        int populationOfGermany = 8000000;
        System.out.println(populationOfGermany);


        int populationOfTheWorld = 70000;

        byte ageOfStudent = 23;
        System.out.println(ageOfStudent);


        /*
        Data Types about decimal values
        1)float:
        2) double
         */

        //Example 2: Create an integer variable, and 2 double variables
        //then print their sum on the console
        //Note: If you use different numeric data types in any math operation
        //the result will be in the largest data type.

        int shirt = 12;
        double shoes = 2.99, socks = 3.99;

        System.out.println("The sum is: " + (shirt+shoes+socks));

        //Example 3: Create 2 float, 3 short and 2 double and print the sum
        float a = 12.9f, b = 14.9f;
        short s1 = 12, s2 = 23, s3 = 44;
        double x = 29.99, y = 15.99;

        System.out.println(a+b+s1+s2+s3+x+y);

        //Example 4: Create a char variable and an integer variable and try
        //to do addition operation with them.

        char c1 = 'A';
        int num = 25;
        //When you use any char in any math operation Java uses the ASCII value of the char

        System.out.println(c1+num);

        //Example 5: Create a String variable and 2 integer and try to do addition operation

        String str = "Ali";
        int i1 = 12, i2 = 15;

        System.out.println(str+i1+i2);



    }



}
