package day09loops;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Type code to print characters except "m" in a String
        // For example: Andromeda ===> Androeda

    String str = "Mama";

    //1st Way:
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!= 'm'){
                System.out.print(ch);
            }
        }
        System.out.println();

    //2nd Way:
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='m'){
                continue;
            }
            System.out.print(ch);

        }
        System.out.println();

        //Example 2: Type code to print characters before "m" in a String
        //      Luxembourg ==>  Luxe

        String s = "Luxembourg";

        for (int i=0; i<s.length();  i++){

            char ch = s.charAt(i);
            if(ch=='m'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
        //Example 3: Type code to find the sum of the unique digits in an integer
        //          For example: 1232 ==> 1+3 = 4;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        String num = input.next();

        int sum = 0;

        for (int i=0; i<num.length(); i++){

            String digit = num.substring(i, i+1);
            if (num.indexOf(digit)==num.lastIndexOf(digit)){
                sum += Integer.valueOf(digit);
            }

        }
        System.out.println(sum);






    }

}
