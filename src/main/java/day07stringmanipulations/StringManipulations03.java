package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        String str = "Ali is 15 years old, I like Ali, Ali does not like!...";
        System.out.println(str);
        //Example 1: How many punctuation marks are used in the given String

        int punctMarks = str.replaceAll("[a-zA-Z0-9 ]","").length();
        System.out.println(punctMarks);

        //Example 2: Ask user to enter his full name, and fix if the user enters space at the beginning and at the end.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();
        System.out.println(fullName);

        String fixedFullName = fullName.trim();//trim() method removes spaces from the beginning and from the end, it does not touch spaces in the middle.
        System.out.println(fixedFullName);






    }

}
