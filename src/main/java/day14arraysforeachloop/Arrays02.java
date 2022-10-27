package day14arraysforeachloop;

import jdk.dynalink.linker.ConversionComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print date like
        //"Month: 09        Day: 20         Year: 2022"

        String date = "09/20/2022";

        //split() method returns Array
        String dates[] = date.split("/");
        System.out.println(Arrays.toString(dates));

        System.out.println("Month : " +dates[0]);
        System.out.println("Day : " +dates[1]);
        System.out.println("Year : " +dates[2]);

        //Example 2: Get string from user and type code to find the number of words in the String.
        //           "I like to move it, move it" ==> 7

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();

        String words[] = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("The number of the words is " + words.length);

        //Example 3: Count the number of words starts with "a" in the String

        int counter =0 ;

        for(String w: words){

            if(w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter + " words start with a");


        //Example 4: Type code to find the longest word in the sentence


        System.out.println(Arrays.toString(words));
        String sent = "I like to move it, move it Alabama";
        String arr[] = sent.split(" ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println(arr[arr.length-1]);

        Arrays.sort(arr, Comparator.comparing(String::length).reversed());
        System.out.println(arr[0]);



    }
}
